package uvg.edu.binario.view;

import uvg.edu.binario.controller.DecodificadorController;

import java.util.Scanner;

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

    private void run(){
        boolean repeat = true;
        while (repeat){
            System.out.println("\n\n * MENÚ: *");
            System.out.println(" Selecciones la opción que desee:");
            System.out.println("  1. Decimal a Hexadecimal ");
            System.out.println("  2. Hexadecimal a Decimal");

            String op = scanner.nextLine();
            switch (op){
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

                default:
                    System.out.println(" - Opción no válido -");
                    repeat = false;
                    break;
            }
        }
    }
}
