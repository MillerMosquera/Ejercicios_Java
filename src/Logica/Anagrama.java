package Logica;

import java.util.Arrays;


/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */
public class Anagrama {

    public static void main(String[] args) {

        System.out.println(esAnagrama("amor", "roma"));
        System.out.println(esAnagrama("amor", "amor"));

    }

    static boolean esAnagrama(String palabra1, String palabra2) {

        //Si las palabras son iguales, entonces no son anagrama
        if (palabra1.equals(palabra2)) {
            return false;
        }

        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        char[] array1 = palabra1.toLowerCase().toCharArray();
        char[] array2 = palabra2.toLowerCase().toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }
}
