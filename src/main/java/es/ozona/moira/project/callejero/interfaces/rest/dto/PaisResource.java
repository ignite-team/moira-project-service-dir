package es.ozona.moira.project.callejero.interfaces.rest.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class PaisResource implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull
	private Long id;
	
	@NotEmpty
	private String nombre;
	
	@NotEmpty
	private String codigo_iso2;
	
	@NotEmpty
	private String codigo_iso3;
	
	@NotEmpty
	private String codigo_uni;
	
	private Date fechaCreacion;
	
	private Date fechaModificacion;
	
	public PaisResource() {
		
	}
	
	public PaisResource(Long id) {
		this.id = id;
	}


	public PaisResource(@NotEmpty String nombre, @NotEmpty String codigo_iso2, @NotEmpty String codigo_iso3,
			@NotEmpty String codigo_uni, Date fechaCreacion, Date fechaModificacion) {
		super();
		this.nombre = nombre;
		this.codigo_iso2 = codigo_iso2;
		this.codigo_iso3 = codigo_iso3;
		this.codigo_uni = codigo_uni;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo_iso2() {
		return codigo_iso2;
	}

	public void setCodigo_iso2(String codigo_iso2) {
		this.codigo_iso2 = codigo_iso2;
	}

	public String getCodigo_iso3() {
		return codigo_iso3;
	}

	public void setCodigo_iso3(String codigo_iso3) {
		this.codigo_iso3 = codigo_iso3;
	}

	public String getCodigo_uni() {
		return codigo_uni;
	}

	public void setCodigo_uni(String codigo_uni) {
		this.codigo_uni = codigo_uni;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
