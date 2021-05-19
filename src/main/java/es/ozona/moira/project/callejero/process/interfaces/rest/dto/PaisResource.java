package es.ozona.moira.project.callejero.process.interfaces.rest.dto;

import java.io.Serializable;
import java.util.Date;

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
	private String codigoIso2;
	
	@NotEmpty
	private String codigoIso3;
	
	@NotEmpty
	private String codigoUni;
	
	private Date fechaCreacion;
	
	private Date fechaModificacion;
	
	public PaisResource() {
		
	}
	
	public PaisResource(Long id) {
		this.id = id;
	}


	public PaisResource(@NotEmpty String nombre, @NotEmpty String codigoIso2, @NotEmpty String codigoIso3,
			@NotEmpty String codigoUni, Date fechaCreacion, Date fechaModificacion) {
		super();
		this.nombre = nombre;
		this.codigoIso2 = codigoIso2;
		this.codigoIso3 = codigoIso3;
		this.codigoUni = codigoUni;
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

	public String getCodigoIso2() {
		return codigoIso2;
	}

	public void setCodigoIso2(String codigoIso2) {
		this.codigoIso2 = codigoIso2;
	}

	public String getCodigoIso3() {
		return codigoIso3;
	}

	public void setCodigoIso3(String codigoIso3) {
		this.codigoIso3 = codigoIso3;
	}

	public String getCodigoUni() {
		return codigoUni;
	}

	public void setCodigoUni(String codigoUni) {
		this.codigoUni = codigoUni;
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
