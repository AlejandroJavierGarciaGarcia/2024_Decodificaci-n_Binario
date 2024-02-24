package uvg.edu.binario.controller;
/**
 * author Alejandro García
 * version 1.0
 */

public class DecodificadorController {
    /**
     * Convierte un número hexadecimal de 3 dígitos en su equivalente decimal.
     * @param hex El número hexadecimal de 3 dígitos a convertir.
     */
    public void hexToDecimal(String hex){
        if(hex.length() == 3){
            try {
                int decimalInt = Integer.parseInt(hex, 16);
                System.out.println("El número en decimal es: " + decimalInt);
            } catch (NumberFormatException e) {
                System.out.println("Formato hexadecimal inválido.");
            }
        } else {
            System.out.println("El número ingresado no cumple con los 3 dígitos.");
        }


    }
    /**
     * Convierte un número decimal en su equivalente hexadecimal.
     * @param decimal El número decimal a convertir.
     */
    public void decimalToHex(String decimal){
        try {
            int decimalInt = Integer.parseInt(decimal);
            if (decimalInt >= 0 && decimalInt <= 4095) {
                String hexadecimal = Integer.toHexString(decimalInt).toUpperCase();
                System.out.println("El número en hexadecimal es: " + hexadecimal);
            } else {
                System.out.println("El número ingresado está fuera del rango permitido (0 a 4095).");
            }
        } catch (NumberFormatException e) {
            System.out.println("Formato decimal inválido.");
        }

    }



}
