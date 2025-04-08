package Logica;

import java.util.HashSet;
import java.util.Set;

public class Isograma {

    public static void main(String[] args) {

        String palabra = "murcielago";
        System.out.println(esIsograma(palabra));
        if (esIsograma(palabra) == true) {
            System.out.println("Es Isograma");
        } else {
            System.out.println("No es Isograma");
        }

    }

    static boolean esIsograma(String palabra) {
        palabra = palabra.toLowerCase();

        Set<Character> cadena = new HashSet<>();
        for (char comprobar : palabra.toCharArray()) {
            if (cadena.contains(comprobar)) {
                return false;
            }
            cadena.add(comprobar);
        }
        return true;
    }
}
