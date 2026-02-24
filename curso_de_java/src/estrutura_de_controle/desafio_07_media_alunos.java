package estrutura_de_controle;

import java.util.Scanner;

public class desafio_07_media_alunos {
    // 3. Criar um programa que receba duas notas parciais, calcular a média final.
    // Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", se
    // a nota for menor que 7.0 e maior do que 4.0 imprime no console
    // "Recuperação", caso contrário imprime no console "Reprovado".
    public static void main(String[] args) {
        Scanner entScanner = new Scanner(System.in);
        System.out.print("digite a primeira nota:");
        double nota = entScanner.nextDouble();
        System.out.print("digite a primeira nota:");
        double nota1 = entScanner.nextDouble();
        double média = (nota + nota1) / 2;
        entScanner.close();
        if (média >= 7) {
            System.out.printf("com a media %.2f o aluno esta APROVADO", média);
        } else if (média < 7 && média >= 4) {
            System.out.printf("com a media %.2f o aluno esta a Recuperação :(", média);
        } else {
            System.out.printf("com a media %.2f o aluno esta a Reprovado", média);
        }

    }
}
