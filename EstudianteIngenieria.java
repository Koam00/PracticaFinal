package gestionprestamos;

public class EstudianteIngenieria extends Estudiante {
    private int semestre;
    private float promedio;
    private ComputadorPortatil portatil;

    public EstudianteIngenieria(String cedula, String nombre, String apellido, String telefono, int semestre, float promedio, ComputadorPortatil portatil) {
        super(cedula, nombre, apellido, telefono);
        this.semestre = semestre;
        this.promedio = promedio;
        this.portatil = portatil;
    }

    public String getSerial() {
        return portatil.getSerial();
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " - Portatil: " + portatil.getSerial();
    }
}