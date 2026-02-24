package personalizadaA;

@SuppressWarnings("serial")
public class Stringvazia extends RuntimeException {

    private String nomeDoAtributo;

    public Stringvazia(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMesage() {
        return String.format("O atributo %s esta vazia", nomeDoAtributo);
    }

}
