package es.ozona.moira.project.callejero.interfaces.rest.dto;

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
		res.setCodigo_ca(provincia.getCodigo_ca());
		res.setFechaCreacion(provincia.getFechaCreacion());
		res.setFechaModificacion(provincia.getFechaModificacion());
		res.setNombre(provincia.getNombre());
		res.setNombre_ca(provincia.getNombre_ca());

		return res;
	}
}
