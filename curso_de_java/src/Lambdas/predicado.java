package Lambdas;

import java.util.function.Predicate;

public class predicado {

    // passo da aula 182//

    public static void main(String[] args) {

        Predicate<produtor> isCaro = prod -> (prod.preço * (1 - prod.desconto)) >= 950;

        produtor produtor = new produtor("notebook", 2700.00, 0.70,0);
        System.out.println(isCaro.test(produtor));
        double p = produtor.preço * (1 - produtor.desconto);
        System.out.println(p);

    }
}