package POO.herança;

public class Carro {
    final int VELOCIDADE_MAXIMA;
    int velocidade;
    int delta = 5;
    
    Carro(int velocidademaxima) {
        VELOCIDADE_MAXIMA = velocidademaxima;
    }

    public void acelerar() {
        if (velocidade + delta > VELOCIDADE_MAXIMA) {
            velocidade = VELOCIDADE_MAXIMA;
        } else {
            velocidade += delta;
        }
    }

    public void frear() {
        if (velocidade >= 5) {
            velocidade -= 5;
        } else {
            velocidade = 0;
        }

    }

    public String toString() {
        return "velociade atual é " + velocidade + " KM/H";
    }
}
