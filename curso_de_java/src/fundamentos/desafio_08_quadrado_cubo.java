package fundamentos;
import java.util.Scanner;

public class desafio_08_quadrado_cubo {
    // Criar um programa que leia um valor e apresente os resultados ao quadrado e
    // ao cubo do valor.

    public static void main(String[] args) {
        Scanner entradScanner = new Scanner(System.in);
        System.err.print(" digite o numero para jogar ao quadrado: ");
        double quadrado = entradScanner.nextDouble();
        double soma = Math.pow(quadrado, 2);
        Double soma_cubo = (soma * 4);
        System.out.print("A SOMA AO QUADRADO É:" + soma + "\n" + "O RESULTADO AO CUBO É: " + soma_cubo);
        entradScanner.close();
    }
}
