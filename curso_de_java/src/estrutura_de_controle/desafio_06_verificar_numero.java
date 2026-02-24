package estrutura_de_controle;

import java.util.Scanner;

public class desafio_06_verificar_numero {
    // Criar um programa que receba um número e verifique se ele está entre 0 e 10
    // e é par;
    public static void main(String[] args) {
        Scanner numero1Scanner = new Scanner(System.in);
        System.out.print("digite o numero: ");
        int numero = numero1Scanner.nextInt();
        numero1Scanner.close();
        switch (numero) {
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
                System.out.printf("O NUMERO %d ESTA SIM ENTRE 0 A 10 ELE E PAR \n", numero);
                break;
            case 9:
            case 7:
            case 5:
            case 3:
            case 0:
                System.out.printf("O NUMERO %d  ESTA SIM ENTRE 0 A 10 ELE E impar \n", numero);
                break;
            default:
                break;
        }
    }
}
