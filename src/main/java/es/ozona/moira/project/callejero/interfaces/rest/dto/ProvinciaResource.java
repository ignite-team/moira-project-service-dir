package es.ozona.moira.project.callejero.interfaces.rest.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ProvinciaResource implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull
	private Long id;
	
	@NotNull
	private Long codigo_provincia;
	
	@NotEmpty
	private String nombre;
	
	private Long codigo_ca;
	
	private String nombre_ca;
	
	private Date fechaCreacion;

	private Date fechaModificacion;
	
	public ProvinciaResource() {
		
	}

	public ProvinciaResource(@NotNull @NotEmpty String nombre, Long codigo_ca, String nombre_ca, Date fechaCreacion,
			Date fechaModificacion) {
		super();
		this.nombre = nombre;
		this.codigo_ca = codigo_ca;
		this.nombre_ca = nombre_ca;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
	}

	public ProvinciaResource(@NotNull Long id) {
		super();
		this.id = id;
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

	public Long getCodigo_ca() {
		return codigo_ca;
	}

	public void setCodigo_ca(Long codigo_ca) {
		this.codigo_ca = codigo_ca;
	}

	public String getNombre_ca() {
		return nombre_ca;
	}

	public void setNombre_ca(String nombre_ca) {
		this.nombre_ca = nombre_ca;
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
