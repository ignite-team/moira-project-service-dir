package es.ozona.moira.project.callejero.process.interfaces.rest.dto;

import java.util.List;
import java.util.stream.Collectors;

import es.ozona.moira.project.callejero.domain.model.entities.Pais;

public class PaisAssembler {
	
	private PaisAssembler() {
		
	}
	
	public static final Pais buildFromResource() {
		return null;
	}
	
	public static final PaisResource buildFromEntity(Pais pais) {
		if(pais == null)
			return null;
		
		final PaisResource res = new PaisResource(pais.getId());
		res.setNombre(pais.getNombre());
		res.setCodigo_iso2(pais.getCodigo_iso2());
		res.setCodigo_iso3(pais.getCodigo_iso3());
		res.setCodigo_uni(pais.getCodigo_uni());
		res.setFechaCreacion(pais.getFechaCreacion());
		res.setFechaModificacion(pais.getFechaModificacion());
		
		return res;
	}
	
	public static final List<PaisResource> buildFromEntities(List<Pais> paises){
		return paises.stream().map(c -> PaisAssembler.buildFromEntity(c)).collect(Collectors.toList());
	}
}
