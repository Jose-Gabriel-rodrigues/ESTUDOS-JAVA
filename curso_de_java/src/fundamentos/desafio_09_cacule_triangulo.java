package fundamentos;

import java.util.Scanner;
//Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
public class desafio_09_cacule_triangulo {
    public static void main(String[] args) {
        Scanner entScanner = new Scanner(System.in);
        System.out.print("digite a altura: ");
        double altura = entScanner.nextDouble();
        System.out.println("digite a base: ");
        double base = entScanner.nextDouble();
        double soma = (altura * base) / 2;
        System.out.print(soma);
        entScanner.close();
    }
}
