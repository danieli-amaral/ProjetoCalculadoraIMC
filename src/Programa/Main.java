package Programa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o peso do usuário");
        double peso = sc.nextDouble();
        System.out.println("Entre com a altura do usuário");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("O IMC do usuário é %.2f:\n", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");

        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso ideal (Parabens!)");

        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");

        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade grau 1");

        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade grau 2 (severa)");

        } else {
            System.out.println("Obesidade grau 3 (mórbida)");
        }

        sc.close();
    }
}
