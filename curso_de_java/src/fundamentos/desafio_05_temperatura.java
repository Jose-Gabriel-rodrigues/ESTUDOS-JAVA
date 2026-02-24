package fundamentos;

import java.util.Scanner;

public class desafio_05_temperatura {
    public static void main(String[] args) {
        // Criar um programa que leia a Criar um programa que leia a temperatura em
        // Fahrenheit e converta para Celsius..//
        Scanner pertgunta = new Scanner(System.in);
        System.out.print("informe a temperatura em Fahrenheit: ");
        double Fahrenheit = pertgunta.nextDouble();
        double soma = (Fahrenheit - 32) * 5 / 9;
        System.out.println(soma);
        pertgunta.close();
    }
}
