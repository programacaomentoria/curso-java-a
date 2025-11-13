package exercicios.grupo6;

public class Agencia {
    private int numeroAgencia;
    private String nomeAgencia;
    private Account[] contas;

    private Double saldoTotalAgencia;

    public Agencia(int numeroAgencia, String nomeAgencia) {
        this.numeroAgencia = numeroAgencia;
        this.nomeAgencia = nomeAgencia;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }
}
