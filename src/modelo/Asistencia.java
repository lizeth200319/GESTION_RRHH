package modelo;

public class Asistencia {

	private int idAsistencia;
    private String horaEntrada;
    private String horaSalida;
    private double horasTrabajadas;
    private String tardanza;
    private String inasistencia;
    
    public Asistencia(int idAsistencia, String horaEntrada, String horaSalida, double horasTrabajadas, String tardanza, String inasistencia) {
        this.idAsistencia = idAsistencia;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.horasTrabajadas = horasTrabajadas;
        this.tardanza = tardanza;
        this.inasistencia = inasistencia;
    }
}
