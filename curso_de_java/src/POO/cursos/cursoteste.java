package POO.cursos;

public class cursoteste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("java completo");
        Curso curso2 = new Curso("web 2023");
        Curso curso3 = new Curso("React Native");

        curso1.adicionaraluno(aluno1);
        curso1.adicionaraluno(aluno2);

        curso2.adicionaraluno(aluno1);
        curso2.adicionaraluno(aluno3);

        aluno1.adicionarcurso(curso3);
        aluno2.adicionarcurso(curso3);
        aluno3.adicionarcurso(curso3);

        for(Aluno aluno: curso1.alunos) {
            System.out.println("Estau  matriculado no curso ... " + curso3.nome + "..." );
            System.out.println("... e o meu nome é " + aluno.nome);
            System.out.println();
        }
        System.out.println(aluno1.cursos.get(0).alunos);
    }

}
