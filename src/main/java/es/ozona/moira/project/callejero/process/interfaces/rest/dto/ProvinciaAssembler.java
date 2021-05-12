package es.ozona.moira.project.callejero.process.interfaces.rest.dto;

import java.util.List;
import java.util.stream.Collectors;

import es.ozona.moira.project.callejero.domain.model.entities.Pais;
import es.ozona.moira.project.callejero.domain.model.entities.Provincia;

public class ProvinciaAssembler {

	private ProvinciaAssembler() {

	}

	public static final Provincia buildFromResource() {
		return null;
	}

	public static final ProvinciaResource buildFromEntity(Provincia provincia) {
		if (provincia == null)
			return null;

		final ProvinciaResource res = new ProvinciaResource(provincia.getId());
		res.setCodigo_provincia(provincia.getCodigo_provincia());
		res.setCodigo_ca(provincia.getCodigo_ca());
		res.setFechaCreacion(provincia.getFechaCreacion());
		res.setFechaModificacion(provincia.getFechaModificacion());
		res.setNombre(provincia.getNombre());
		res.setNombre_ca(provincia.getNombre_ca());

		return res;
	}
	
	public static final List<ProvinciaResource> buildFromEntities(List<Provincia> provincia){
		return provincia.stream().map(c -> ProvinciaAssembler.buildFromEntity(c)).collect(Collectors.toList());
	}
}
