package Logica;

/*
 * Escribe un programa que imprima los 10 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */
public class Fibonacci {

    public static void main(String[] args) {

        int a = sucesionFibo(7);
        System.out.println(a);

        for (int i = 0; i < 10; i++) {
            System.out.println("Número: " + i + " es: " + sucesionFibo(i));
        }
    }

    static int sucesionFibo(int fibo) {
        return (fibo <= 2) ? 1 : sucesionFibo(fibo - 1) + sucesionFibo(fibo - 2);
    }
}
