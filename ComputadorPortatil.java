package gestionprestamos;

public class ComputadorPortatil {
    private final String serial;
    private String marca;
    private float tamano;
    private float precio;
    private String sistemaOperativo;
    private String procesador;

    public ComputadorPortatil(String serial, String marca, float tamano, float precio, String sistemaOperativo, String procesador) {
        this.serial = serial;
        this.marca = marca;
        this.tamano = tamano;
        this.precio = precio;
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
    }

    public String getSerial() {
        return serial;
    }

    @Override
    public String toString() {
        return "[" + serial + "] " + marca + " - " + tamano + "'' - " + sistemaOperativo + " - " + procesador;
    }
}