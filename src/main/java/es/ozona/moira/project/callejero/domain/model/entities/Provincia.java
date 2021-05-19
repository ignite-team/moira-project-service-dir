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

	@Column(name = "codigo_provincia")
	@NotNull
	private Long codigoProvincia;
	
	@Column
	@NotEmpty
	private String nombre;

	@Column(name = "codigo_ca")
	private Long codigoCa;
	
	@Column(name = "nombre_ca")
	private String nombreCa;

	@Column(name = "fecha_creacion")
	private Date fechaCreacion;

	@Column(name = "fecha_modificacion")
	private Date fechaModificacion;

	public Provincia() {
		super();
	}

	public Provincia(@NotNull Long codigoProvincia, @NotEmpty String nombre, Long codigoCa, String nombreCa,
			Date fechaCreacion, Date fechaModificacion) {
		super();
		this.codigoProvincia = codigoProvincia;
		this.nombre = nombre;
		this.codigoCa = codigoCa;
		this.nombreCa = nombreCa;
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

	public Long getCodigoProvincia() {
		return codigoProvincia;
	}

	public void setCodigoProvincia(Long codigoProvincia) {
		this.codigoProvincia = codigoProvincia;
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
