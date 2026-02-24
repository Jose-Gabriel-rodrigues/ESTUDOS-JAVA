package fundamentos;

import java.util.Scanner;

public class desafio_06_celsius {
    // Criar um programa que leia a temperatura em Celsius e converta para
    // Fahrenheit.
    public static void main(String[] args) {
        Scanner entradScanner = new Scanner(System.in);
        System.out.print("Qual temperatura em celsius: ");
        double celsius = entradScanner.nextDouble();
        double soma = (celsius * 9) / 5 + 32;
        System.out.println("TEMPERATURA EM Fahrenheit: " + soma);
        entradScanner.close();
    }
}
