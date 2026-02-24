package estrutura_de_controle;

import javax.swing.JOptionPane;

public class desafio_02_Desafio_Dia_da_Semana {
    public static void main(String[] args) {
        String dia = JOptionPane.showInputDialog("Informe o dia da semana:");
        String semana = dia;

        if (semana.equalsIgnoreCase("domingo")) {
            System.out.println(semana + " = 1");
        } else if (semana.equalsIgnoreCase("segunda")) {
            System.out.println(semana + " = 2");
        } else if (semana.equalsIgnoreCase("terça")) {
            System.out.println(semana + " = 3");
        } else if (semana.equalsIgnoreCase("quarta")) {
            System.out.println(semana + " = 4");
        } else if (semana.equalsIgnoreCase("quinta")) {
            System.out.println(semana + " = 5");
        } else if (semana.equalsIgnoreCase("sexta")) {
            System.out.println(semana + " = 6");
        } else if (semana.equalsIgnoreCase("sábado")) { // ou "sabado"
            System.out.println(semana + " = 7");
        } else {
            System.out.println("Ops... dia não encontrado. Verificar a ortografia.");
        }
    }
}
