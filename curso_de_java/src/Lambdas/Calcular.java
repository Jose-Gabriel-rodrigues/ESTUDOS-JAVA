package Lambdas;

public interface Calcular {
    // passo 1
    public double executar(double a, double b);

    // passo 2
    // essa maneiras abaixo pode ser usando nas instanciar quando vc esta usando
    // funções lambdas
    default String legal() {
        return "legal";
    }

    static String muitolegal() {
        return "muito legal";
    }

}
