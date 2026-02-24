package  POO.um_para_um;
public class carro {

    motor motor = new motor();

    void acelerar() {
        if (motor.fatorinjecao < 2.6) {

        }
        motor.fatorinjecao += 0.4;
    }

    void frear() {
        if (motor.fatorinjecao > 0.5) {
            motor.fatorinjecao -= 0.4;

        }

    }

    void ligar() {
        motor.ligado = true;
    }

    void desligado() {
        motor.ligado = false;
    }

    boolean estaligado() {
        return motor.ligado;
    }
}
