package uvg.edu.binario.controller;

public class DecodificadorController {

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
