package POO.um_para_um;

public class motor {
    boolean ligado = false;
    double fatorinjecao = 1;

    int giros() {
        if (!ligado) {
            return 0;
        } else {
            return (int) Math.round(fatorinjecao * 3000);
        }
    }

}
