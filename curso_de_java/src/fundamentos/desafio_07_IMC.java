package fundamentos;

import java.util.Scanner;

public class desafio_07_IMC {
    // Criar um programa que leia o peso e a altura do usuário e imprima no console
    // o IMC.
    public static void main(String[] args) {
        Scanner entScanner = new Scanner(System.in);
        System.out.print(" INFORME SUA ALTURA: ");
        Double altura = entScanner.nextDouble();
        System.out.print("INFROME SEU PESO ATUAL: ");
        Double peso = entScanner.nextDouble();
        double soma = peso / (Math.pow(altura, 2));
        System.out.printf("O IMC É:" + " %.2f", soma);
        entScanner.close();

    }
}
