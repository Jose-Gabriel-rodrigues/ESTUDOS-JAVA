package estrutura_de_controle;

import java.util.Scanner;

public class desafio_05_ano_bissexto {
    // Criar um programa informa se o ano atual é um ano bissexto;
    public static void main(String[] args) {
        Scanner entScanner = new Scanner(System.in);
        while (true) {
            System.out.println("caso deseje parar digite 999.");
            System.out.print("digite o ano que deseja ver que bisexto: ");
            int ano = entScanner.nextInt();
            entScanner.close();
            if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                System.out.println("o ano e bisexto");
            }
            if (ano == 999) {
                break;
            } else {
                System.out.println("o ano nao é bisexto");
            }

        }
        System.out.println("FIM...");
    }
}
