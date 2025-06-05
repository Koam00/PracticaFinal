package gestionprestamos;

import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {

    public static void registrarPrestamoIngenieria(Scanner sc, ArrayList<EstudianteIngenieria> lista) {
        System.out.println("Cedula:");
        String cedula = Validaciones.leerTextoGeneral(sc);
        if (existeCedulaIng(cedula, lista)) {
            System.out.println("Ya existe un préstamo registrado con esa cédula.");
            return;
        }

        System.out.println("Nombre:");
        String nombre = Validaciones.leerTextoSinNumeros(sc);

        System.out.println("Apellido:");
        String apellido = Validaciones.leerTextoSinNumeros(sc);

        System.out.println("Teléfono:");
        String telefono = Validaciones.leerTextoGeneral(sc);

        System.out.println("Semestre:");
        int semestre = Validaciones.leerEntero(sc);

        System.out.println("Promedio:");
        float promedio = Validaciones.leerFloat(sc);

        System.out.println("Serial del portátil:");
        String serial = Validaciones.leerTextoGeneral(sc);
        if (existeSerialIng(serial, lista)) {
            System.out.println("Ya existe un préstamo registrado con ese serial.");
            return;
        }

        System.out.println("Marca:");
        String marca = Validaciones.leerTextoSinNumeros(sc);

        System.out.println("Tamaño (pulgadas):");
        float tamano = Validaciones.leerFloat(sc);

        System.out.println("Precio:");
        float precio = Validaciones.leerFloat(sc);

       String so = "";
int opcion;

do {
    System.out.println("Sistema operativo (1. Windows 7, 2. Windows 10, 3. Windows 11):");
    opcion = Validaciones.leerEntero(sc);

    switch (opcion) {
        case 1:
            so = "Windows 7";
            break;
        case 2:
            so = "Windows 10";
            break;
        case 3:
            so = "Windows 11";
            break;
        default:
            System.out.println("Opción no válida. Intente de nuevo.");
    }

} while (opcion < 1 || opcion > 3);
        
    String procesador = "";

do {
    System.out.println("Procesador (1. Intel Core i3, 2. Intel Core i5, 3. Intel Core i7):");
    opcion = Validaciones.leerEntero(sc);

    switch (opcion) {
        case 1:
            procesador = "Intel Core i3";
            break;
        case 2:
            procesador = "Intel® Core™ i5";
            break;
        case 3:
            procesador = "Intel Core i7";
            break;
        default:
            System.out.println("Opción no válida. Intente de nuevo.");
    }

} while (opcion < 1 || opcion > 3);


        ComputadorPortatil pc = new ComputadorPortatil(serial, marca, tamano, precio, so, procesador);
        EstudianteIngenieria estudiante = new EstudianteIngenieria(cedula, nombre, apellido, telefono, semestre, promedio, pc);
        lista.add(estudiante);
        System.out.println("Préstamo registrado con éxito.");
    }

    public static void registrarPrestamoDiseno(Scanner sc, ArrayList<EstudianteDiseño> lista) {
        System.out.println("Cedula:");
        String cedula = Validaciones.leerTextoGeneral(sc);
        if (existeCedulaDis(cedula, lista)) {
            System.out.println("Ya existe un préstamo registrado con esa cédula.");
            return;
        }

        System .out.println("Nombre:");
        String nombre = Validaciones.leerTextoSinNumeros(sc);

        System.out.println("Apellido:");
        String apellido = Validaciones.leerTextoSinNumeros(sc);

        System.out.println("Teléfono:");
        String telefono = Validaciones.leerTextoGeneral(sc);

        
        String modalidad;
        do {
            System.out.print("Ingrese la modalidad (Presencial o Virtual): ");
            modalidad = sc.nextLine();
            if (!Validaciones.validarModalidad(modalidad)) {
                System.out.println("Modalidad inválida. Debe ser 'Presencial' o 'Virtual'.");
            }
        } while (!Validaciones.validarModalidad(modalidad));

        System.out.println("Cantidad de asignaturas:");
        int asignaturas = Validaciones.leerEntero(sc);

        System.out.println("Serial (entero):");
        int serial = Validaciones.leerEntero(sc);
        if (existeSerialDis(serial, lista)) {
            System.out.println("Ya existe un préstamo registrado con ese serial.");
            return;
        }

        System.out.println("Marca:");
        String marca = Validaciones.leerTextoSinNumeros(sc);

        System.out.println("Tamaño (pulgadas):");
        float tamano = Validaciones.leerFloat(sc);

        System.out.println("Precio:");
        float precio = Validaciones.leerFloat(sc);

        String almacenamiento = "";
        int opcion;
        do {
        System.out.println("Almacenamiento (1. 256 GB, 2. 512 GB, 3. 1 TB):");
        opcion = Validaciones.leerEntero(sc);

        switch (opcion) {
        case 1:
            almacenamiento = "256 GB";
            break;
        case 2:
            almacenamiento = "512 GB";
            break;
        case 3:
            almacenamiento = "1 TB";
            break;
        default:
            System.out.println("Opción no válida. Intente nuevamente.");
    }
    } while (opcion < 1 || opcion > 3);


        System.out.println("Peso (kg):");
        float peso = Validaciones.leerFloat(sc);

        TabletaGrafica tab = new TabletaGrafica(serial, marca, tamano, precio, almacenamiento, peso);
        EstudianteDiseño estudiante = new EstudianteDiseño(cedula, nombre, apellido, telefono, modalidad, asignaturas, tab);
        lista.add(estudiante);
        System.out.println("Préstamo registrado con éxito.");
    }

    public static void modificarPrestamoIngenieria(Scanner sc, ArrayList<EstudianteIngenieria> lista) {
        System.out.println("Ingrese cedula:");
        String cedula = sc.nextLine();
        for (EstudianteIngenieria e : lista) {
            if (e.getCedula().equals(cedula)) {
                System.out.println("Nuevo nombre:");
                e.nombre = Validaciones.leerTextoSinNumeros(sc);
                System.out.println("Nuevo apellido:");
                e.apellido = Validaciones.leerTextoSinNumeros(sc);
                System.out.println("Nuevo teléfono:");
                e.telefono = Validaciones.leerTextoGeneral(sc);
                System.out.println("Modificado con éxito.");
                return;
            }
        }
        System.out.println("Estudiante no encontrado.");
    }

    public static void modificarPrestamoDiseno(Scanner sc, ArrayList<EstudianteDiseño> lista) {
        System.out.println("Ingrese cedula:");
        String cedula = sc.nextLine();
        for (EstudianteDiseño e : lista) {
            if (e.getCedula().equals(cedula)) {
                System.out.println("Nuevo nombre:");
                e.nombre = Validaciones.leerTextoSinNumeros(sc);
                System.out.println("Nuevo apellido:");
                e.apellido = Validaciones.leerTextoSinNumeros(sc);
                System.out.println("Nuevo teléfono:");
                e.telefono = Validaciones.leerTextoGeneral(sc);
                System.out.println("Modificado con éxito.");
                return;
            }
        }
        System.out.println("Estudiante no encontrado.");
    }

    
   public static void devolverEquipoIngenieria(Scanner sc, ArrayList<EstudianteIngenieria> lista) {
        System.out.println("Ingrese cédula:");
        String cedula = sc.nextLine();
        boolean eliminado = lista.removeIf(e -> e.getCedula().equals(cedula));
    
            if (eliminado) {
            System.out.println("Equipo del estudiante con cédula " + cedula + " devuelto correctamente.");
        }   else {
        System.out.println("No se encontró un estudiante con la cédula " + cedula + ".");
        }
    }


    public static void devolverEquipoDiseno(Scanner sc, ArrayList<EstudianteDiseño> lista) {
        System.out.println("Ingrese cédula:");
        String cedula = sc.nextLine();
        boolean eliminado = lista.removeIf(e -> e.getCedula().equals(cedula));

            if (eliminado) {
            System.out.println("Equipo del estudiante con cédula " + cedula + " devuelto correctamente.");
        }   else {
        System.out.println("No se encontró un estudiante con la cédula " + cedula + ".");
        }
    }


    public static void buscarEquipoIngenieria(Scanner sc, ArrayList<EstudianteIngenieria> lista) {
        System.out.println("Ingrese cedula:");
        String cedula = sc.nextLine();
        for (EstudianteIngenieria e : lista) {
            if (e.getCedula().equals(cedula)) {
                System.out.println(e);
                return;
            }
        }
        System.out.println("No encontrado.");
    }

    public static void buscarEquipoDiseno(Scanner sc, ArrayList<EstudianteDiseño> lista) {
        System.out.println("Ingrese cedula:");
        String cedula = sc.nextLine();
        for (EstudianteDiseño e : lista) {
            if (e.getCedula().equals(cedula)) {
                System.out.println(e);
                return;
            }
        }
        System.out.println("No encontrado.");
    }

    private static boolean existeCedulaIng(String cedula, ArrayList<EstudianteIngenieria> lista) {
        for (EstudianteIngenieria e : lista) {
            if (e.getCedula().equals(cedula)) return true;
        }
        return false;
    }

    private static boolean existeCedulaDis(String cedula, ArrayList<EstudianteDiseño> lista) {
        for (EstudianteDiseño e : lista) {
            if (e.getCedula().equals(cedula)) return true;
        }
        return false;
    }

    private static boolean existeSerialIng(String serial, ArrayList<EstudianteIngenieria> lista) {
        for (EstudianteIngenieria e : lista) {
            if (e.getSerial().equals(serial)) return true;
        }
        return false;
    }

    private static boolean existeSerialDis(int serial, ArrayList<EstudianteDiseño> lista) {
        for (EstudianteDiseño e : lista) {
            if (e.getSerial() == serial) return true;
        }
        return false;
    }
}