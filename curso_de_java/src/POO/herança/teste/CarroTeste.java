package POO.herança.teste;

import POO.herança.Carro;
import POO.herança.Civic;
import POO.herança.Ferrari;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Civic();
        c1.acelerar();
        System.out.println(c1);

        Ferrari f = new Ferrari();
        f.ligarTurbo();
        f.acelerar();
        System.out.println(f);
        f.ligarTurbo();
        f.acelerar();
        System.out.println(f);
        f.ligarTurbo();
        f.acelerar();
        System.out.println(f);
        f.ligarTurbo();
        f.acelerar();
        System.out.println(f);
         f.acelerar();
        System.out.println(f);
        f.acelerar();
        System.out.println(f); 
        f.acelerar();
        System.out.println(f);
        f.desligarTurbo();
        f.acelerar();
        System.out.println(f);
        

    }
}
