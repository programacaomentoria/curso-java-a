package exercicios.grupo6.rightway.model.io;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import exercicios.grupo6.rightway.model.Account;
import exercicios.grupo6.rightway.model.AccountMovement;
import exercicios.grupo6.rightway.model.exception.AccountNotFoundException;

public class AccountFileManager {
    private static final String NOME_DO_ARQUIVO_DE_CONTAS = "contas.txt";

    public AccountFileManager(){
    }

    private Map<String, Account> carregarContas() {
        Map<String, Account> contas = new HashMap<>();
        // Lógica para ler o arquivo e popular o mapa de contas
        // System.out.println("Carregando contas do arquivo: " + NOME_DO_ARQUIVO_DE_CONTAS);
        String[] linhasDoArquivo = FileUtil.obterLinhasDoArquivo(NOME_DO_ARQUIVO_DE_CONTAS);
        for (String linha : linhasDoArquivo) {
            Account conta = this.criarContaInstanceComDadosArquivo(linha);
            contas.put(conta.getCpf(), conta);
        }
        return contas;
    }

    public boolean salvarConta(Account conta) {
        boolean salvoComSucesso = false;
        String linhaNoArquivo = conta.getCpf() + "$$" + conta.getNomeDaConta() + "$$" + conta.getNumeroAgencia() + "$$" + conta.getNumeroConta() + "$$" + conta.getSaldo() + "$$";
        for(AccountMovement movimentacao : conta.getHistoricoMovimentacoes()){
            linhaNoArquivo += movimentacao.getTipoMovimentacao() + "__" + movimentacao.getValor() + "__" + movimentacao.getDataMovimentacao() + "_$_";
        }

        try{
            FileUtil.adicionarDadosNoArquivo(NOME_DO_ARQUIVO_DE_CONTAS, linhaNoArquivo);
            salvoComSucesso = true;
        }
        catch(IOException ex){
            salvoComSucesso = false;
        }
        return salvoComSucesso;
    }

    public Account carregarContaEGerarInstancia(String cpf) throws AccountNotFoundException {
        Map<String, Account> contas = carregarContas();
        if (contas.containsKey(cpf)) {
            return contas.get(cpf);
        }
        else{
            throw new AccountNotFoundException(cpf);
        }
    }

    public boolean existeContaNoArquivo(String cpf){
        boolean existeConta = false;
        try{
           existeConta = (this.carregarContaEGerarInstancia(cpf) != null);
        }
        catch (AccountNotFoundException e){
            existeConta = false;            
        }
        return existeConta;
    }

    public Account criarContaInstanceComDadosArquivo(String linhaArquivo){
        // System.out.println("Carregando conta a partir da linha do arquivo: " + linhaArquivo);
        String[] dadosIniciais = linhaArquivo.split("\\$\\$");

        Account conta = new Account(dadosIniciais[1], dadosIniciais[0], Double.parseDouble(dadosIniciais[4]), false);
        conta.setNumeroAgencia(Integer.parseInt(dadosIniciais[2]));
        conta.setNumeroConta(dadosIniciais[3]);

        if(dadosIniciais.length < 6){
            return conta;
        }

        String[] movimentacoes = dadosIniciais[5].split("_\\$_");
        for(String movimentacao : movimentacoes){
            String[] dadosMovimentacao = movimentacao.split("__");
            conta.getHistoricoMovimentacoes().add(new AccountMovement(dadosMovimentacao[0], Double.parseDouble(dadosMovimentacao[1]), dadosMovimentacao[2]));
        }
        return conta;
    }
}
