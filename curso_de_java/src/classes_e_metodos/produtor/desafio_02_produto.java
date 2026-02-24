package classes_e_metodos.produtor;

public class desafio_02_produto {
    String nome;
    double valor;
    static double descontor = 0.25;

    desafio_02_produto() {
        descontor = 0.25;

    }

    desafio_02_produto(String nomeinicial, double valorinicial, double descontoinicial) {
        nome = nomeinicial;
        valor = valorinicial;
        descontor = descontoinicial;

    }

    double Soma() {
        return valor - (valor * descontor);

    };
}
