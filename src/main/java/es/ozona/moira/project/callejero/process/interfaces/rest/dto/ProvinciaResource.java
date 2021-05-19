package es.ozona.moira.project.callejero.process.interfaces.rest.dto;

import java.io.Serializable;
import java.util.Date;

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
	private Long codigoProvincia;
	
	@NotEmpty
	private String nombre;
	
	private Long codigoCa;
	
	private String nombreCa;
	
	private Date fechaCreacion;

	private Date fechaModificacion;
	
	public ProvinciaResource() {
		
	}

	public ProvinciaResource(@NotNull Long codigoProvincia, @NotEmpty String nombre, Long codigoCa, String nombreCa,
			Date fechaCreacion, Date fechaModificacion) {
		super();
		this.codigoProvincia = codigoProvincia;
		this.nombre = nombre;
		this.codigoCa = codigoCa;
		this.nombreCa = nombreCa;
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

	public Long getCodigoCa() {
		return codigoCa;
	}

	public void setCodigoCa(Long codigoCa) {
		this.codigoCa = codigoCa;
	}

	public String getNombreCa() {
		return nombreCa;
	}

	public void setNombreCa(String nombreCa) {
		this.nombreCa = nombreCa;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public Long getCodigoProvincia() {
		return codigoProvincia;
	}

	public void setCodigoProvincia(Long codigoProvincia) {
		this.codigoProvincia = codigoProvincia;
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
