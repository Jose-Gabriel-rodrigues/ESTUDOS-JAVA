package POO.herança;

import POO.herança.teste.Esporte; // aqui pode ficar, mas é estranho ter interface no pacote "teste"

public class Ferrari extends Carro implements Esporte {
    public Ferrari() {
        super(320);
    }

    public Ferrari(int velocidademaxima) {
        super(velocidademaxima);
        super.delta = 15;
    }
    @Override
    public void ligarTurbo() {
        delta = 35;

    }
    @Override
    public void desligarTurbo() {
        delta = 15;

    }

}