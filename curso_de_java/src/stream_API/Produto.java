package stream_API;

public class Produto {
    final String nome;
    final double preço;
    final double desconto;
    final double valorfrete;

    public Produto(String nome, double preço, double desconto, double valorfrete) {
        this.nome = nome;
        this.preço = preço;
        this.desconto = desconto;
        this.valorfrete = valorfrete;
    }
}
