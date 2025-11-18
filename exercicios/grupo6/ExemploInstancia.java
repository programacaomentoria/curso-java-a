package exercicios.grupo6;

public class ExemploInstancia {
    public static void main(String[] args) {
        // Account contaRodrigo = new Account();
        // Account contaEudimar = new Account(500.0);



        // contaRodrigo.depositar(200.0);
        // contaEudimar.sacar(100.0);


        // System.out.println("Saldo da conta Rodrigo: " + contaRodrigo.getSaldo());
        // System.out.println("Saldo da conta Eudimar: " + contaEudimar.getSaldo());

        // Banco itau = new Banco();
        // // itau.nomeBanco = "Banco Itaú";

        // Banco bradesco = new Banco("Banco Bradesco", "237");
        


        String linhaArquivo = "12345678900__João Silva$##$1001$##$00012345$##$1500.0$##$Depósito$$500.0$$2024-01-01_$_Saque$$200.0$$2024-01-02_$_";

        String codificacao = "CPF$NOME$SALDO$MOVIMENTAÇÕES";
        String[] coding1 = codificacao.split("\\$");

        String linha1 = "65465465$RODRIGO $ FISCHER$R$ 1500";
        String[] coding2 = linha1.split("\\$");
        
        // String[] campos = codificacao.split("\\$");

        System.out.println(coding1[0]);
        System.out.println(coding1[1]);
        System.out.println(coding1[2]);
        System.out.println(coding1[3]);

        System.out.println(coding2[0]);
        System.out.println(coding2[1]);
        System.out.println(coding2[2]);
        System.out.println(coding2[3]);
        System.out.println(Integer.valueOf(coding2[4].trim()));


        //trazer exemplo de vantagens de uso do JSON versus XML
        // {
        //     "CPF": "",
        //     "NomeDoCliente": "",
        //     "NúmeroDaAgência": "",
        //     "NúmeroDaConta": "",
        //     "Saldo": "",
        //     "Movimentacoes": [
        //         {
        //             "Tipo": "",
        //             "Valor": "",
        //             "Data": ""
        //         },
        //         {
        //             "Tipo": "",
        //             "Valor": "",
        //             "Data": ""
        //         }
        //     ]
        // }
        // String[] partes = linhaArquivo.split("\\$##\\$");
        // System.out.println(partes[0].split("__")[0]); // CPF
        // System.out.println(partes[0].split("__")[1]); // CPF
        // System.out.println(partes[1]); // Número da Agência
        // System.out.println(partes[2]); // Número da Conta
        // System.out.println(partes[3]); // Saldo
        // for(String movimento : partes[4].split("_\\$_")) {
        //     if (movimento.isEmpty()) continue;
        //     String[] detalhesMovimento = movimento.split("\\$\\$");
        //     System.out.println("Tipo: " + detalhesMovimento[0]);
        //     System.out.println("Valor: " + detalhesMovimento[1]);
        //     System.out.println("Data: " + detalhesMovimento[2]);


        // }
        // System.out.println(partes[4]); // Movimentações





    }
}
