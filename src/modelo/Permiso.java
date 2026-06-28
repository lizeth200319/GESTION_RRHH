package modelo;
import java.util.Date;
public class Permiso {
	// Atributos privados
	private int idPermiso;
	private int idTrabajador;
	private String tipo;
	private Date fechaInicio;
	private Date fechaFin;
	private String observacion;
    
 // Constructor
	public Permiso(int idPermiso, int idTrabajador, String tipo,
            Date fechaInicio, Date fechaFin, String observacion) {
		this.idPermiso = idPermiso;
        this.idTrabajador = idTrabajador;
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.observacion = observacion;
	}
	
	//Get/Set
	public int getIdTrabajador() {
	    return idTrabajador;
	}

	public void setIdTrabajador(int idTrabajador) {
	    this.idTrabajador = idTrabajador;
	}

	public String getTipo() {
	    return tipo;
	}

	public void setTipo(String tipo) {
	    this.tipo = tipo;
	}

	public Date getFechaInicio() {
	    return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
	    this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
	    return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
	    this.fechaFin = fechaFin;
	}

	public String getObservacion() {
	    return observacion;
	}

	public void setObservacion(String observacion) {
	    this.observacion = observacion;
	}
	
	public int getIdPermiso() {
	    return idPermiso;
	}

	public void setIdPermiso(int idPermiso) {
	    this.idPermiso = idPermiso;
	}

}
