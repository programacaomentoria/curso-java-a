package exercicios.grupo6.rightway.model;

public class AccountMovement {
    private String tipoMovimentacao; // "Depósito" ou "Saque"
    private double valor;
    private String dataMovimentacao;

    protected enum TipoMovimentacao {
        DEPOSITO,
        SAQUE,
        TRANSFERENCIA_ENVIADA,
        TRANSFERENCIA_RECEBIDA,
        ABERTURA_CONTA
    }

    public AccountMovement(String tipoMovimentacao, double valor, String dataMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
        this.valor = valor;
        this.dataMovimentacao = dataMovimentacao;
    }

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public double getValor() {
        return valor;
    }

    public String getDataMovimentacao() {
        return dataMovimentacao;
    }
}
