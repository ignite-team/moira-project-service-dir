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
	@Column
	private String codigo_iso2;
	
	@NotEmpty
	@Column
	private String codigo_iso3;
	
	@NotEmpty
	@Column
	private String codigo_uni;
	
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;

	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;


	public Pais() {
		super();
	}

	public Pais(@NotEmpty String nombre, @NotEmpty String codigo_iso2, @NotEmpty String codigo_iso3,
			@NotEmpty String codigo_uni, Date fechaCreacion, Date fechaModificacion) {
		super();
		this.nombre = nombre;
		this.codigo_iso2 = codigo_iso2;
		this.codigo_iso3 = codigo_iso3;
		this.codigo_uni = codigo_uni;
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
