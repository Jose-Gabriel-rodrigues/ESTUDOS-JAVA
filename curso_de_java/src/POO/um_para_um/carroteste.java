package POO.um_para_um;

public class carroteste {
    public static void main(String[] args) {
        carro c1 = new carro();
        System.out.println(c1.estaligado());
        c1.ligar();
        System.out.println(c1.estaligado());
        c1.acelerar();
        System.out.println(c1.motor.giros());
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        System.out.println(c1.motor.giros());

    }
}
