package classes_e_metodos.desafio_01_classe_da_data;

public class desafio_01_testa_data {
    public static void main(String[] args) {

        data p1 = new data();

        var p2 = new data();
        p2.dia = 2;
        p2.mes = 2;
        p2.ano = 2005;

        System.out.printf("a data digitadaa foi %d/%d/%d\n", p1.dia, p1.mes, p1.ano);
        System.out.printf("a data digitadaa foi %d/%d/%d\n", p2.dia, p2.mes, p2.ano);
        System.out.println(p1.dataformatada());
    }
}
