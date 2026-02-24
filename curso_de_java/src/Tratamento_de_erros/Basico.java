public class Basico {
    public static void main(String[] args) {
        Aluno1 a1 = null;

        try {
            imprimirNomeDoAluno(a1);
        } catch (Exception excecao) {
            System.out.println("Ocorreu um erro no momento de imprimir o nome do usuario");
        }
        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu o erro:" + e.getMessage());
        }

        System.out.println("Fim :)");
    }

    public static void imprimirNomeDoAluno(Aluno1 aluno) {
        System.out.println(aluno.nome);

    }
}