package es.ozona.moira.project.callejero.process.interfaces.rest.dto;

import java.util.List;
import java.util.stream.Collectors;

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
		res.setCodigoProvincia(provincia.getCodigoProvincia());
		res.setCodigoCa(provincia.getCodigoCa());
		res.setFechaCreacion(provincia.getFechaCreacion());
		res.setFechaModificacion(provincia.getFechaModificacion());
		res.setNombre(provincia.getNombre());
		res.setNombreCa(provincia.getNombreCa());

		return res;
	}
	
	public static final List<ProvinciaResource> buildFromEntities(List<Provincia> provincia){
		return provincia.stream().map(c -> ProvinciaAssembler.buildFromEntity(c)).collect(Collectors.toList());
	}
}
