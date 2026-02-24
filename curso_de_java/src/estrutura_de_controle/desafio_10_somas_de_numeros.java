package estrutura_de_controle;

import java.util.Scanner;

public class desafio_10_somas_de_numeros {
    // 1-Criar um programa que enquanto estiver recebendo números positivos,
    // 2-imprime no console a soma dos números inseridos,
    // 3-caso receba um número negativo, encerre o programa. Tente utilizar a
    // estrutura do while.

    public static void main(String[] args) {
        Scanner entradaScanner = new Scanner(System.in);
        while (true) {
            System.out.print("digite um numero: ");
            double numero = entradaScanner.nextDouble();
            if (numero < 0) {
                break;
            }
            System.out.print("digite mais um numero: ");
            double numero2 = entradaScanner.nextDouble();
            if (numero < 0) {
                break;
            }
            if (numero >= 0) {
                double soma = numero + numero2;
                System.out.printf(" a soma de %.2f + %.2f = %.2f ", numero, numero2, soma);
                System.err.println();
            }
        }
    }
}