package Logica;

public class Factorial {

    public static void main(String[] args) {

        for (int j = 0; j < 10; j++) {
            System.out.println(esFactorial(j));
        }
    }

    static int esFactorial(int numero) {

        int factorial = 0;
        if (numero >= 0) {
            factorial = 1;
        }
        for (int i = 2; i < numero; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
