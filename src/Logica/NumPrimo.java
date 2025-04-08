package Logica;

/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */
public class NumPrimo {

    public static void main(String[] args) {

        int num = 10;
        System.out.println(esPrimo(20));
        if (esPrimo(num) == true) {
            System.out.println(num + "Es número primo");
        } else {
            System.out.println(num + "No es un número primo");
        }

        System.out.println("Número primos hasta el 100");
        for (int i = 2; i < 100; i++) {
            if (esPrimo(i) == true) {
                System.out.println(i);
            }
        }

    }

    static boolean esPrimo(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;

            }
        }
        return true;
    }
}
