package modelo;

public class Contrato {
	// Atributos privados
    private int idContrato;
    private String tipoContrato;
    private String fechaInicio;
    private String fechaFin;
    private double sueldo;
    private String regimenLaboral;
    
 // Constructor
    public Contrato(int idContrato, String tipoContrato, String fechaInicio, String fechaFin, double sueldo, String regimenLaboral) {
        this.idContrato = idContrato;
        this.tipoContrato = tipoContrato;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.sueldo = sueldo;
        this.regimenLaboral = regimenLaboral;
    }

}
