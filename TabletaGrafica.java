package gestionprestamos;

public class TabletaGrafica {
    private final int serial;
    private String marca;
    private float tamano;
    private float precio;
    private String almacenamiento;
    private float peso;

    public TabletaGrafica(int serial, String marca, float tamano, float precio, String almacenamiento, float peso) {
        this.serial = serial;
        this.marca = marca;
        this.tamano = tamano;
        this.precio = precio;
        this.almacenamiento = almacenamiento;
        this.peso = peso;
    }

    public int getSerial() {
        return serial;
    }

    @Override
    public String toString() {
        return "[" + serial + "] " + marca + " - " + tamano + "'' - " + almacenamiento;
    }
}