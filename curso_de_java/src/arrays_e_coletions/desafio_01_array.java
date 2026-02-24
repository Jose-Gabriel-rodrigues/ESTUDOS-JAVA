package arrays_e_coletions;

import java.util.Arrays;
import java.util.Scanner;

public class desafio_01_array {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("digite a quantidade de nota! ");
        double numero = entrada.nextDouble();

      
        double[] notas = new double[(int) numero]; // declara fora do for
        double somar = 0.0;

        for (int i = 0; i < numero; i++) {
            System.out.printf(" %d - digite a nota do aluno: ", i + 1);
            double nota = entrada.nextDouble();
            notas[i] = nota; // armazena no array
            somar += nota;
        }

        double media = somar / numero;
        System.out.println(Arrays.toString(notas));
        System.out.printf("a media do aluno foi: %.2f", media);
        entrada.close();
    }
}
