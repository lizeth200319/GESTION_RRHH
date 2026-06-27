package modelo;

public class Permiso {
	// Atributos privados
    private int idPermiso;
    private String tipo;
    private String fechaInicio;
    private String fechaFin;
    private String observacion;
    
 // Constructor
    public Permiso(int idPermiso, String tipo, String fechaInicio, String fechaFin, String observacion) {
        this.idPermiso = idPermiso;
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.observacion = observacion;
    }

}
