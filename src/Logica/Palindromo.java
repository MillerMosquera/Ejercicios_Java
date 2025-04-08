package Logica;

/*
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */
public class Palindromo {

    public static void main(String[] args) {

        System.out.println("Manera 1");
        String cadena = "Hola Mundo";
        cadena = cadena.toLowerCase();
        String cadenaInvertida = "";

        for (char invert : cadena.toCharArray()) {
            cadenaInvertida = invert + cadenaInvertida;
        }
        System.out.println(cadenaInvertida);

        //Otra manera
        System.out.println("Manera 2");
        String palabra = "Oso";
        palabra = palabra.toLowerCase();
        String invertirCadena = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertirCadena += palabra.charAt(i);
        }
        System.out.println(invertirCadena);

        //Para validar que es palindromo sería
        if (palabra.equals(invertirCadena)) {
            System.out.println("Es palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }
    }

}
