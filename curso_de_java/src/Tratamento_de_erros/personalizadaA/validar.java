package personalizadaA;

 // ajuste o pacote correto do Aluno

public class validar {

    private validar() {}

    public static void aluno(Aluno aluno) {

        if (aluno == null) {
            throw new IllegalArgumentException("Aluno está nulo!");
        }
        if (aluno.nome == null || aluno.nome.trim().isEmpty()) {
            throw new Stringvazia("nome");
        }
        if (aluno.nota < 0 || aluno.nota > 10) {
            throw new IllegalArgumentException("Nota inválida: " + aluno.nota);
        }
    }
}
