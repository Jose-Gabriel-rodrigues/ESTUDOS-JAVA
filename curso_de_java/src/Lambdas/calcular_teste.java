package Lambdas;

public class calcular_teste {
    public static void main(String[] args) {

        Soma soma = new Soma();
        System.out.println(soma.executar(2, 3));


        Calcular multiplicar = new Multiplicador();
        System.out.println(multiplicar.executar(2,3));

    }

}
