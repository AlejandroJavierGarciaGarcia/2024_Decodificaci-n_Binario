package uvg.edu.binario.system;
/**
 * author Alejandro García
 * version 1.0
 */

import uvg.edu.binario.view.ConsoleUI;

/**
 * Clase principal que contiene el método main para iniciar la aplicación.
 */
public class Main {
    /**
     * Método principal que inicia la aplicación.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        ConsoleUI consoleUI = new ConsoleUI();
        consoleUI.welcome();
    }
}