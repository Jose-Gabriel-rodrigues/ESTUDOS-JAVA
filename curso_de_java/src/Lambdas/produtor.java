package Lambdas;

public class produtor extends Object {

    // passo da aula 182 //

    String nome;
    double preço;
    double desconto;
    double imposto;
    double frete;

    public produtor(String nome, double preço, double desconto, double imposto) {
        this.nome = nome;
        this.preço = preço;
        this.desconto = desconto;
        this.imposto = imposto;
    }

    // passo da aula 183 //
    public String toString() {
        double resultadofinal = preço * (1 - desconto);

        return nome + " esta custando " + resultadofinal;
    }

    public Double descontDouble(double preço) {
        this.preço = preço * (1 - desconto);
        this.desconto = this.preço;
        return this.preço;
    }

    public double impostovalor() {
        this.imposto = this.preço - (this.preço - (this.imposto * this.preço));
        this.preço += imposto;
        return this.imposto;
    }

    public double frete() {
        if (preço >= 3000) {
            this.frete = 100;
            this.preço += frete;

        } else {
            this.frete = 50;
            this.preço += frete;
        }
        return this.frete;
    }

    public double valor() {
        return this.preço;

    }
}
