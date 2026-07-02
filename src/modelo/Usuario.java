package modelo;

public class Usuario {
	// Atributos privados 
    private String dniTrabajador;
    private String usuario;
    private String contrasena;
    private String rol;

    // 2. Constructor
    public Usuario() {
    }

    
    // 3. Constructor con parámetros
    public Usuario(String dniTrabajador, String usuario, String contrasena, String rol) {
        this.dniTrabajador = dniTrabajador;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    // 4. Métodos Getters y Setters
    public String getDniTrabajador() {
        return dniTrabajador;
    }

    public void setDniTrabajador(String dniTrabajador) {
        this.dniTrabajador = dniTrabajador;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

}
