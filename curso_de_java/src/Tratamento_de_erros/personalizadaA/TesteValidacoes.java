package personalizadaA;

public class TesteValidacoes {
    public static void main(String[] args) throws IllegalAccessException {

        try {
            Aluno aluno = new Aluno("", -7);
            validar.aluno(aluno);
        } catch (Stringvazia e) {
            System.out.println(e.getMesage());
        } catch (NumeroNegativoException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Fim :");

    }
}