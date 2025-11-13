package exercicios.grupo6;

public class ExemploInstancia {
    public static void main(String[] args) {
        Account contaRodrigo = new Account();
        Account contaEudimar = new Account(500.0);



        contaRodrigo.depositar(200.0);
        contaEudimar.sacar(100.0);


        System.out.println("Saldo da conta Rodrigo: " + contaRodrigo.getSaldo());
        System.out.println("Saldo da conta Eudimar: " + contaEudimar.getSaldo());

        Banco itau = new Banco();
        // itau.nomeBanco = "Banco Itaú";

        Banco bradesco = new Banco("Banco Bradesco", "237");
        

    }
}
