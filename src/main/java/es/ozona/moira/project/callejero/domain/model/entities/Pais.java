package es.ozona.moira.project.callejero.domain.model.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "dir_pais")
public class Pais implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_pais")
	private Long id;
	
	@NotEmpty
	@Column
	private String nombre;
	
	@NotEmpty
	@Column(name = "codigo_iso2")
	private String codigoIso2;
	
	@NotEmpty
	@Column(name = "codigo_iso3")
	private String codigoIso3;
	
	@NotEmpty
	@Column(name = "codigo_uni")
	private String codigoUni;
	
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;

	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;


	public Pais() {
		super();
	}

	public Pais(@NotEmpty String nombre, @NotEmpty String codigoIso2, @NotEmpty String codigoIso3,
			@NotEmpty String codigoUni, Date fechaCreacion, Date fechaModificacion) {
		super();
		this.nombre = nombre;
		this.codigoIso2 = codigoIso2;
		this.codigoIso3 = codigoIso3;
		this.codigoUni = codigoUni;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
	}

	public Pais(Long id) {
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
