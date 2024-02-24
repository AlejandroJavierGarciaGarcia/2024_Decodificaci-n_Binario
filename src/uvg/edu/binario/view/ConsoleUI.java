package uvg.edu.binario.view;

import uvg.edu.binario.controller.DecodificadorController;

import java.util.Scanner;
/**
 * author Alejandro García
 * version 1.0
 */

public class ConsoleUI {
    Scanner scanner = new Scanner(System.in);
    DecodificadorController decodificadorController = new DecodificadorController();

    public void welcome(){
        System.out.println(" - - - - - - - - - - - - - - - - - - ");
        System.out.println("             BIENVENIDO ");
        System.out.println(" - - - - - - - - - - - - - - - - - - ");
        System.out.println("    * Decodificación Hexadecimal*");
        run();
    }
    /**
     * Método que contiene la lógica principal del programa.
     * Muestra un menú de opciones y realiza la acción seleccionada por el usuario.
     */
    private void run() {
        boolean repeat = true;
        while (repeat) {
            System.out.println("\n\n * MENÚ: *");
            System.out.println(" Selecciones la opción que desee:");
            System.out.println("  1. Decimal a Hexadecimal ");
            System.out.println("  2. Hexadecimal a Decimal");
            System.out.println("  3. Decimal a Binario");

            String op = scanner.nextLine();
            switch (op) {
                case "1":
                    System.out.println("\n * DECIMAL A HEXADECIMAL*");
                    System.out.println(" - Ingrese un número decimal:");
                    String decimal = scanner.nextLine();
                    decodificadorController.decimalToHex(decimal);
                    break;

                case "2":
                    System.out.println("\n * HEXADECIMAL A DECIMAL *");
                    System.out.println(" - Ingrese un número hexadecimal de 3 dígitos:");
                    String hex = scanner.nextLine();
                    decodificadorController.hexToDecimal(hex);
                    break;

                case "3":
                    System.out.println("\n * DECIMAL A BINARIO *");
                    decimalBinary();
                    break;

                default:
                    System.out.println(" - Opción no válido -");
                    repeat = false;
                    break;
            }
        }
    }

    /**
     * Método que permite al usuario ingresar un número decimal y muestra su equivalente en binario de 8 bits.
     */
    public void decimalBinary(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Ingrese un número entero : ");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("q")) {
                    break;
                }
                int entero = Integer.parseInt(input);
                String binario = enteroABinario(entero);
                System.out.println("  * Binario: " + binario);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número entero válido.");
            }
        }
        scanner.close();
    }
    /**
     * Método estático que convierte un número entero en su representación binaria de 8 bits.
     * @param num El número entero a convertir.
     * @return La representación binaria de 8 bits del número entero.
     */
    public static String enteroABinario(int num) {
        String binario = Integer.toBinaryString(num);
        binario = String.format("%8s", binario).replace(' ', '0');
        return binario;
    }

}
