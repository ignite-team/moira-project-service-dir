package es.ozona.moira.project.callejero;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import es.ozona.moira.project.callejero.infrastructure.repositories.ProvinciaRepository;
import es.ozona.moira.project.callejero.process.interfaces.rest.DirController;
import es.ozona.moira.project.callejero.process.interfaces.rest.dto.ProvinciaResource;
import es.ozona.moira.project.callejero.domain.model.entities.Provincia;

@SpringBootTest
public class ProvinciaControllerTest {

	@Autowired
	public DirController dirController;

	@MockBean
	public ProvinciaRepository provinciaRepository;

	Date date;

	@BeforeEach
	public void setup() {
		date = new Date();
		Provincia provincia = new Provincia(null, "nombre", null, "nombre_ca", date, date);
		provincia.setId(1L);
		provinciaRepository.save(provincia);
		Mockito.when(provinciaRepository.findAll()).thenReturn(List.of(provincia));
	}

	@Test
	public void HttpOkNotResults() throws Exception {
		ResponseEntity<List<ProvinciaResource>> response = dirController.listProvincia(1L);

		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

	@Test
	public void CorrectContent() throws Exception {
		ResponseEntity<List<ProvinciaResource>> response = dirController.listProvincia(1L);
		List<ProvinciaResource> content = response.getBody();
		ProvinciaResource prov = content.get(0);
		
		assertTrue(content.size() == 1);
		assertEquals(prov.getCodigo_provincia(), null);
		assertEquals(prov.getNombre(), "nombre");
		assertEquals(prov.getCodigo_ca(), null);
		assertEquals(prov.getNombre_ca(), "nombre_ca");
		assertEquals(prov.getFechaCreacion(), date);
		assertEquals(prov.getFechaModificacion(), date);
	}
}
