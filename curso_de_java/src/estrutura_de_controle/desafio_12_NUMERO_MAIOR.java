package estrutura_de_controle;

import java.util.Scanner;

public class desafio_12_NUMERO_MAIOR {
public static void main(String[] args) {
    Scanner netrdScanner = new Scanner(System.in);
    int maior = 0;
        for(int numero = 0; numero < 10;  numero++ ){
            System.out.print("digite um numero");
            int numero1 = netrdScanner.nextInt();
            if (numero1 > maior) {
                maior = numero1;   
            }
            
        }
    System.out.println(maior);
}
}
