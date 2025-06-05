package gestionprestamos;

public abstract class Estudiante {
    protected String cedula;
    protected String nombre;
    protected String apellido;
    protected String telefono;

    public Estudiante(String cedula, String nombre, String apellido, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public abstract String toString();
}