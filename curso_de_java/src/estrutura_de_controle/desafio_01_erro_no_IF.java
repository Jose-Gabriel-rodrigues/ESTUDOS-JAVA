package estrutura_de_controle;

// problema é que colo ; apos o if esse fpi o erro

public class desafio_01_erro_no_IF {
    public static void main(String[] args) {
        double entrada = 1.5;

        if (entrada >= 9) {
            System.out.println("Quadro de Honra!");
            System.out.println("Você e ferra!");
        } else {
            System.out.println("você n foi para o Quadro de Honra! ");
        }
    }

}
