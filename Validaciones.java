package gestionprestamos;

import java.util.Scanner;

public class Validaciones {

    public static int leerEntero(Scanner sc) {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ingrese un número válido.");
            return leerEntero(sc);
        }
    }

    public static float leerFloat(Scanner sc) {
        try {
            return Float.parseFloat(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ingrese un número decimal válido.");
            return leerFloat(sc);
        }
    }

    public static String leerTextoSinNumeros(Scanner sc) {
        String input = sc.nextLine().trim();
        if (input.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\s]+$")) {
            return input;
        }
        System.out.println("Texto inválido. Solo letras.");
        return leerTextoSinNumeros(sc);
    }

    public static String leerTextoGeneral(Scanner sc) {
        String input = sc.nextLine().trim();
        if (input.matches("^[a-zA-Z0-9\s]+$")) {
            return input;
        }
        System.out.println("Texto inválido. Sin caracteres especiales.");
        return leerTextoGeneral(sc);
    }
    
    public static boolean validarModalidad(String modalidad) {
    return modalidad.equalsIgnoreCase("Presencial") || modalidad.equalsIgnoreCase("Virtual");
}
    
}