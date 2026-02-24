package Lambdas;

public class Multiplicador implements Calcular {

    @Override
    public double executar(double a, double b) {
        return a * b;
    }
}
