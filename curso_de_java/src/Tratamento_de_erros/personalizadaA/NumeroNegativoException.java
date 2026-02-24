package personalizadaA;

@SuppressWarnings("serial")
public class NumeroNegativoException extends RuntimeException {
    private String nomeDoAtributo;

    public NumeroNegativoException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMesage() {
        return String.format("O atributo %s esta negativo", nomeDoAtributo);
    }

}
