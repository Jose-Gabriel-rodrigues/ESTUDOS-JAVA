package fundamentos;
public class desafio_03_operadores {
    public static void main(String[] args) {

        boolean trabalho_terça = true;
        boolean trabalho_quinta = true;

        boolean tv_32 = trabalho_terça ^ trabalho_quinta;
        ;
        boolean tv_50 = trabalho_terça && trabalho_quinta;
        ;
        boolean familia_toma_sorvete = trabalho_terça || trabalho_quinta;

        boolean saudavel = !familia_toma_sorvete;

        System.out.println("foi trabalhar na terça: " + trabalho_terça);
        System.out.println("foi  trabalhar  na quinta: " + trabalho_quinta);
        System.out.println("a familia vai compra a TV 32: " + tv_32);
        System.out.println("a familia vai compra a TV 50 : " + tv_50);
        System.out.println("a familia vai toma sorvete: " + familia_toma_sorvete);
        System.out.println("a familia mais saudavel: " + saudavel);
        
    }
}
