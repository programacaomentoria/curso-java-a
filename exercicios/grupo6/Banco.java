package exercicios.grupo6;

public class Banco {
    private String nomeBanco;
    private String codigoBanco;
    private Agencia[] agencias;
    private String codigoBancoCentral;
    protected String enderecoBanco;
    public String telefoneBanco;

    public Banco(){
        
    }

    public Banco(String nomeBanco, String codigoBanco) {
        this.nomeBanco = nomeBanco;
        this.codigoBanco = codigoBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public String getCodigoBanco() {
        return codigoBanco;
    }
}
