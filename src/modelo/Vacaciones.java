package modelo;

import java.util.Date;

public class Vacaciones {

	// 1. Atributos
	private String dniTrabajador;
	private int idVacacion;
	private String tipo;
	private Date fechaInicio;
	private Date fechaFin;
	private String observacion;


	public Vacaciones() {
	}

	// 3. Constructor con parametros
	public Vacaciones(String dniTrabajador, int idVacacion, String tipo, Date fechaInicio, Date fechaFin,
			String observacion) {
		this.dniTrabajador = dniTrabajador;
		this.idVacacion = idVacacion;
		this.tipo = tipo;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.observacion = observacion;
	}

	// 4. Métodos Getters y Setters
	public String getDniTrabajador() {
		return dniTrabajador;
	}

	public void setDniTrabajador(String dniTrabajador) {
		this.dniTrabajador = dniTrabajador;
	}

	public int getIdVacacion() {
		return idVacacion;
	}

	public void setIdVacacion(int idVacacion) {
		this.idVacacion = idVacacion;
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
}
