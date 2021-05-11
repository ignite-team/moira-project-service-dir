package es.ozona.moira.project.callejero.domain.model.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "dir_provincia")
public class Provincia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_provincia")
	private Long id;

	@Column
	@NotNull
	private Long codigo_provincia;
	
	@Column
	@NotEmpty
	private String nombre;

	@Column
	private Long codigo_ca;
	
	@Column
	private String nombre_ca;

	@Column(name = "fecha_creacion")
	private Date fechaCreacion;

	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;

	public Provincia() {
		super();
	}

	public Provincia(@NotNull Long codigo_provincia, @NotEmpty String nombre, Long codigo_ca, String nombre_ca,
			Date fechaCreacion, Date fechaModificacion) {
		super();
		this.codigo_provincia = codigo_provincia;
		this.nombre = nombre;
		this.codigo_ca = codigo_ca;
		this.nombre_ca = nombre_ca;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
	}

	public Provincia(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodigo_provincia() {
		return codigo_provincia;
	}

	public void setCodigo_provincia(Long codigo_provincia) {
		this.codigo_provincia = codigo_provincia;
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
