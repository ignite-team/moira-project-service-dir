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

import es.ozona.moira.project.callejero.infrastructure.repositories.PaisRepository;
import es.ozona.moira.project.callejero.process.interfaces.rest.DirController;
import es.ozona.moira.project.callejero.process.interfaces.rest.dto.PaisResource;
import es.ozona.moira.project.callejero.domain.model.entities.Pais;

@SpringBootTest
public class PaisControllerTest {

	@Autowired
	public DirController dirController;

	@MockBean
	public PaisRepository paisRepository;

	Date date;

	@BeforeEach
	public void setup() {
		date = new Date();
		Pais pais = new Pais("nombre", "codigo_iso2", "codigo_iso3", "codigo_uni", date, date);
		pais.setId(1L);
		paisRepository.save(pais);
		Mockito.when(paisRepository.findAll()).thenReturn(List.of(pais));
	}

	@Test
	public void HttpOkNotResults() throws Exception {
		ResponseEntity<List<PaisResource>> response = dirController.listPais(1L);

		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

	@Test
	public void CorrectContent() throws Exception {
		ResponseEntity<List<PaisResource>> response = dirController.listPais(1L);
		List<PaisResource> content = response.getBody();
		PaisResource pais = content.get(0);
		
		assertTrue(content.size() == 1);
		assertEquals(pais.getNombre(), "nombre");
		assertEquals(pais.getCodigoIso2(), "codigo_iso2");
		assertEquals(pais.getCodigoIso3(), "codigo_iso3");
		assertEquals(pais.getCodigoUni(), "codigo_uni");
		assertEquals(pais.getFechaCreacion(), date);
		assertEquals(pais.getFechaModificacion(), date);
	}
}