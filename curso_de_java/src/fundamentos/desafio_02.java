package fundamentos;
import java.util.Scanner;

public class desafio_02 {
    public static void main(String[] args) throws Exception {
        Scanner informe_o_salario = new Scanner(System.in);
        System.out.print("digite o primeiro salario! ");
        String valor1 = informe_o_salario.next().replace(",", ".");
        System.out.print("digite o segundo salario! ");
        String valor2 = informe_o_salario.next().replace(",", ".");
        System.out.print("digite o teceiro salario! ");
        String valor3 = informe_o_salario.next().replace(",", ".");

        double salario_1 = Double.parseDouble(valor1);
        double salario_2 = Double.parseDouble(valor2);
        double salario_3 = Double.parseDouble(valor3);
        double media = (salario_1 + salario_2 + salario_3) / 3;
        System.out.println("a media do salario é " + media);
        informe_o_salario.close();

    }
}
