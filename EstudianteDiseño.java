package gestionprestamos;

public class EstudianteDiseño extends Estudiante {
    private String modalidad;
    private int asignaturas;
    private TabletaGrafica tableta;

    public EstudianteDiseño(String cedula, String nombre, String apellido, String telefono, String modalidad, int asignaturas, TabletaGrafica tableta) {
        super(cedula, nombre, apellido, telefono);
        this.modalidad = modalidad;
        this.asignaturas = asignaturas;
        this.tableta = tableta;
    }

    public int getSerial() {
        return tableta.getSerial();
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " - Tableta: " + tableta.getSerial();
    }
}