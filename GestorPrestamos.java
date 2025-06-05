package gestionprestamos;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorPrestamos {
    private ArrayList<EstudianteIngenieria> ingenieria = new ArrayList<>();
    private ArrayList<EstudianteDiseño> diseno = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void menuPrincipal() {
        int opcion;
        do {
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("1. Estudiantes de Ingenieria");
            System.out.println("2. Estudiantes de Diseño");
            System.out.println("3. Imprimir Inventario Total");
            System.out.println("4. Salir del programa");
            System.out.print("Seleccione una opción: ");
            opcion = Validaciones.leerEntero(sc);

            switch (opcion) {
                case 1 -> menuIngenieria();
                case 2 -> menuDiseno();
                case 3 -> imprimirInventario();
                case 4 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        } while (opcion != 4);
    }

    private void menuIngenieria() {
        int opcion;
        do {
            System.out.println("\nESTUDIANTES DE INGENIERIA");
            System.out.println("1.1 Registrar préstamo de equipo");
            System.out.println("1.2 Modificar préstamo de equipo");
            System.out.println("1.3 Devolución de equipo");
            System.out.println("1.4 Buscar equipo");
            System.out.println("1.5 Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = Validaciones.leerEntero(sc);

            switch (opcion) {
                case 1 -> Metodos.registrarPrestamoIngenieria(sc, ingenieria);
                case 2 -> Metodos.modificarPrestamoIngenieria(sc, ingenieria);
                case 3 -> Metodos.devolverEquipoIngenieria(sc, ingenieria);
                case 4 -> Metodos.buscarEquipoIngenieria(sc, ingenieria);
                case 5 -> System.out.println("Volviendo...");
                default -> System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        } while (opcion != 5);
    }

    private void menuDiseno() {
        int opcion;
        do {
            System.out.println("\nESTUDIANTES DE DISEÑO");
            System.out.println("2.1 Registrar préstamo de equipo");
            System.out.println("2.2 Modificar préstamo de equipo");
            System.out.println("2.3 Devolución de equipo");
            System.out.println("2.4 Buscar equipo");
            System.out.println("2.5 Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = Validaciones.leerEntero(sc);

            switch (opcion) {
                case 1 -> Metodos.registrarPrestamoDiseno(sc, diseno);
                case 2 -> Metodos.modificarPrestamoDiseno(sc, diseno);
                case 3 -> Metodos.devolverEquipoDiseno(sc, diseno);
                case 4 -> Metodos.buscarEquipoDiseno(sc, diseno);
                case 5 -> System.out.println("Volviendo...");
                default -> System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        } while (opcion != 5);
    }

    private void imprimirInventario() {
        System.out.println("\n--- INVENTARIO TOTAL ---");
        System.out.println("Ingenieria:");
        for (EstudianteIngenieria est : ingenieria) {
            System.out.println(est);
        }
        System.out.println("Diseño:");
        for (EstudianteDiseño est : diseno) {
            System.out.println(est);
        }
    }
}