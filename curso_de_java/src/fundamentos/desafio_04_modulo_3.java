package fundamentos;
import java.util.Scanner;

public class desafio_04_modulo_3 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.print("DIGITE O PRIMEIRO NUMERO PARA SEU  CALCULO: ");
        double numero1 = numero.nextDouble();
        System.out.print("qual dessas * // + - operacao você deseja realisar: ");
        String operação = numero.next();
        System.out.print("DIGITE O segundo NUMERO PARA SEU  CALCULO: ");
        double numero2 = numero.nextDouble();
        numero.close(); 
     
        double resultado = "+".equals(operação) ? numero1 + numero2 : 0;
         resultado = "-".equals(operação) ? numero1 - numero2 : resultado;
         resultado = "*".equals(operação) ? numero1 * numero2 : resultado;
         resultado = "%".equals(operação) ? numero1 % numero2 : resultado;

        System.out.printf("%.2f %s %.2f = %f ", numero1, operação, numero2, resultado);

      
    }

}
