public class Checada_VS_NaoChecada {
    public static void main(String[] args) {
        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            geraErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :");
    }

    static void geraErro1() throws RuntimeException {
        throw new RuntimeException("Ocorreu um erro bem legal #01!");
    }

    static void geraErro2() throws Exception {
        throw new Exception("ocorreu um erro bem legal #02!");
    }

}
