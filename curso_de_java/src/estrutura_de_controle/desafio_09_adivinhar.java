package estrutura_de_controle;

import java.util.Random;
import java.util.Scanner;

public class desafio_09_adivinhar {
    public static void main(String[] args) {
        Random aleatoriRandom = new Random();
        int numero_aleatorio = aleatoriRandom.nextInt(10);
        Scanner numeroScanner = new Scanner(System.in);
        System.out.println("=========================================================");
        System.out.println("se deseja sair digite 999:");
        System.out.print("escolar  um numero de 0 a 10: ");
        int numero = numeroScanner.nextInt();
        System.out.println("=========================================================");
        while (true) {

            if (numero == numero_aleatorio) {
                System.out.println("\u001B[32m parabens vc acertou\u001B[m");
            } else if (numero == 999) {
                System.out.println("Saindo...");
                try {
                    Thread.sleep(2000); // pausa o programa por 2 segundos
                } catch (InterruptedException e) {
                    e.printStackTrace(); // se algo interromper o sleep, mostra o erro
                }

                break;
            } else if (numero != numero_aleatorio) {
                System.out.println(" \u001B[31mvoce errou \u001B[m");
                System.out.println(" tente mais uma vez ");

            }

            numero_aleatorio = aleatoriRandom.nextInt(10);

            System.out.println("=========================================================");

            System.out.println("se deseja sair digite 999:");
            System.out.print("escolar  um numero de 0 a 10: ");
            numero = numeroScanner.nextInt();

            System.out.println("=========================================================");
        }
        System.out.println("FIM");

    }
}
