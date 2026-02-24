package classes_e_metodos.desafio_01_classe_da_data;

public class data {
    // Cria variaveis que vai receber dia, mes , e ano.
    int dia;
    int mes;
    int ano;

    data() {
        dia = 1;
        mes = 1;
        ano = 1970;

    }

    data(int dia_atual, int mes_atual, int ano_atual) {
        dia = dia_atual;
        mes = mes_atual;
        ano = ano_atual;
    }

    String dataformatada() {
        return String.format("%d/%d/%d\n", dia, mes, ano);
    }

}
