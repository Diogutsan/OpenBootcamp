
//Ejercicios tema 4
//introduccion a la programacion
//OpenBootcamp

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ingrese un nuemro Negativo o Positivo: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        scanner.close();

        funcionIf(numero);
        funcionWhile(numero);
        funcionDo(numero);

    }

    public static void funcionIf(int numero) {
        System.out.println("Esta es la funcion if");
        if (numero < 0) {

            System.out.println(numero + " -Es negativo");

        }
        if (numero == 0) {

            System.out.println(numero + " Es cero");

        } else {

            System.out.println(numero + "Es positivo");

        }

    }

    public static void funcionWhile(int numero) {
        System.out.println("Esta es la funcion While");
        while (numero < 3) {

            System.out.println(numero);
            numero = numero += 1;
        }
    }

    public static void funcionDo(int numero) {
        System.out.println("Esta es la funcion Do-02-");
        do {
            System.out.println(numero);
            numero = numero += 1;

        } while (numero < 3);

    }
}