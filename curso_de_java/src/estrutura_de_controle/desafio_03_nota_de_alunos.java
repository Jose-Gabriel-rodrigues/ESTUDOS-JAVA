package estrutura_de_controle;

import java.util.Scanner;

public class desafio_03_nota_de_alunos {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.print("qual a nota do aluno: ");
        double nota = numero.nextDouble();
        double soma = 0;
        double total = 0;
        while (nota != -1) {
            if (nota >= 0 || nota <= 10) {
                System.out.print("qual a nota do aluno: ");
                total += nota;
                nota = numero.nextDouble();
                soma++;
            } else {
                break;
            }
            numero.close();
        }
        total /= soma;
        System.out.println("o total de notas digitado foi: " + soma);
        System.out.println(" a media dos alunos é: " + total);
    }
}
