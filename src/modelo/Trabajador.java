package modelo;

public class Trabajador extends Persona {

	// 1. Atributos propios clase hija
	private int dniTrabajador;
	private String codigo;
	private String afp;
	private String tipoCuenta;
	private String numeroCuenta;
	private String cci;
	private String condicionLaboral;
	private String cargo;
	private String direccion;
	private String contactoEmergencia;
	private String telefonoEmergencia; 
	private String observacion;

	// 2. Constructor vacío
	public Trabajador() {
		super(); // Invoca al constructor de la clase padre
	}

	// 3. Constructor con parámetros hijo y heredados padre
	public Trabajador(String dni, String primerNombre, String segundoNombre, String apellidoPaterno,
			String apellidoMaterno, String sexo, String paisNacimiento, String estadoCivil, String telefono,
			int dniTrabajador, String codigo, String afp, String tipoCuenta, String numeroCuenta, String cci,
			String condicionLaboral, String cargo, String direccion, String contactoEmergencia,
			String telefonoEmergencia, String observacion) {

		// Pasa los atributos de la clase padre
		super(dni, primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno, sexo, paisNacimiento, estadoCivil,
				telefono);

		// Asigna los atributos propios de Trabajador
		this.dniTrabajador = dniTrabajador;
		this.codigo = codigo;
		this.afp = afp;
		this.tipoCuenta = tipoCuenta;
		this.numeroCuenta = numeroCuenta;
		this.cci = cci;
		this.condicionLaboral = condicionLaboral;
		this.cargo = cargo;
		this.direccion = direccion;
		this.contactoEmergencia = contactoEmergencia;
		this.telefonoEmergencia = telefonoEmergencia;
		this.observacion = observacion;
	}

	// 4. Métodos Getters y Setters de clase hija
	public int getDniTrabajador() {
		return dniTrabajador;
	}

	public void setDniTrabajador(int dniTrabajador) {
		this.dniTrabajador = dniTrabajador;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getCci() {
		return cci;
	}

	public void setCci(String cci) {
		this.cci = cci;
	}

	public String getCondicionLaboral() {
		return condicionLaboral;
	}

	public void setCondicionLaboral(String condicionLaboral) {
		this.condicionLaboral = condicionLaboral;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getContactoEmergencia() {
		return contactoEmergencia;
	}

	public void setContactoEmergencia(String contactoEmergencia) {
		this.contactoEmergencia = contactoEmergencia;
	}

	public String getTelefonoEmergencia() {
		return telefonoEmergencia;
	}

	public void setTelefonoEmergencia(String telefonoEmergencia) {
		this.telefonoEmergencia = telefonoEmergencia;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
}