package Logica;

import java.util.HashMap;
import java.util.Map;

/*
 * Crea un programa que cuente cuantas veces se repite cada palabra
 * y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que
 *   lo resuelvan automáticamente.
 */
public class ContarCaracteres {

    public static void main(String[] args) {
        // Texto de prueba
        String texto = "aaaabbbccc";

        // Mapa para contar caracteres
        Map<Character, Integer> contador = new HashMap<>();

        // Contar cada carácter
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            contador.put(caracter, contador.getOrDefault(caracter, 0) + 1);
        }

        // Mostrar resultados
        for (Map.Entry<Character, Integer> entry : contador.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
