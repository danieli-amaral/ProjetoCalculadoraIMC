package Programa;

import javax.swing.JOptionPane;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double peso = Double.parseDouble(JOptionPane.showInputDialog("Entre com o peso do usuário"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Entre com a altura do usuário"));

        double imc = peso / (altura * altura);
        String formatado = String.format("%.2f", imc);

        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null, "O IMC do usuário é " + formatado + " - Abaixo do peso");

        } else if (imc >= 18.5 && imc <= 24.9) {
            JOptionPane.showMessageDialog(null, "O IMC do usuário é " + formatado + " - Peso ideal (Parabens!)");

        } else if (imc >= 25 && imc <= 29.9) {
            JOptionPane.showMessageDialog(null, "O IMC do usuário é " + formatado + " - Levemente acima do peso!");

        } else if (imc >= 30 && imc <= 34.9) {
            JOptionPane.showMessageDialog(null, "O IMC do usuário é " + formatado + " - Obesidade grau 1");

        } else if (imc >= 35 && imc <= 39.9) {
            JOptionPane.showMessageDialog(null, "O IMC do usuário é " + formatado + " - Obesidade grau 2 (severa)");

        } else {
            JOptionPane.showMessageDialog(null, "O IMC do usuário é " + formatado + " - Obesidade grau 3 (mórbida)");
        }
    }
}