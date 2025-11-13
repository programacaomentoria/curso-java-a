package exercicios.grupo6;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AccountFileManager {
    private static final String NOME_DO_ARQUIVO_DE_CONTAS = "contas.txt";
    public AccountFileManager(){
    }

    private Map<String, AccountRecord> carregarContasDoArquivo() {
        Map<String, AccountRecord> contas = new HashMap<>();
        // Lógica para ler o arquivo e popular o mapa de contas
        System.out.println("Carregando contas do arquivo: " + NOME_DO_ARQUIVO_DE_CONTAS);
        // Aqui você implementaria a lógica real de leitura de arquivo
        // String[] linhasDoArquivo = {
        //     "12345678900__João Silva$##$1001$##$00012345$##$1500.0$##$Depósito$$500.0$$2024-01-01_$_Saque$$200.0$$2024-01-02_$_",
        //     "98765432100__Maria Oliveira$##$1002$##$00054321$##$2500.0$##$Depósito$$1000.0$$2024-02-01_$_"
        // };
        String[] linhasDoArquivo = FileUtil.loadLinesFromFile(NOME_DO_ARQUIVO_DE_CONTAS);
        for (String linha : linhasDoArquivo) {
            AccountRecord conta = this.criarContaInstanceComDadosArquivo(linha);
            contas.put(conta.cpf, conta);
        }
        return contas;
    }

    public boolean salvarContaEmArquivo(AccountRecord conta) {
        // Lógica para salvar os dados da conta em um arquivo
        // System.out.println("Salvando dados da conta no arquivo: " + nomeDoArquivo);
        // Aqui você implementaria a lógica real de escrita em arquivo
        boolean salvoComSucesso = false;
        String lineInFile = conta.cpf + "__" + conta.nomeDaConta + "$##$" + conta.numeroAgencia + "$##$" + conta.numeroConta + "$##$" + conta.saldo + "$##$";
        for(AccountMovement movimentacao : conta.historicoMovimentacoes){
            lineInFile += movimentacao.getTipoMovimentacao() + "$$" + movimentacao.getValor() + "$$" + movimentacao.getDataMovimentacao() + "_$_";
        }

        try{
            FileUtil.appendLineToFile(NOME_DO_ARQUIVO_DE_CONTAS, lineInFile);
            salvoComSucesso = true;
        }
        catch(IOException ex){
            salvoComSucesso = false;
        }

        // System.out.println("Linha a ser salva no arquivo: " + lineInFile);
        return salvoComSucesso;
    }

    public AccountRecord carregarContaDeArquivo(String cpf) throws AccountNotFoundException {
        Map<String, AccountRecord> contas = carregarContasDoArquivo();
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
           existeConta = (this.carregarContaDeArquivo(cpf) != null);
        }
        catch (AccountNotFoundException e){
            existeConta = false;            
        }
        return existeConta;
    }

    public AccountRecord criarContaInstanceComDadosArquivo(String linhaArquivo){
        // Lógica para converter uma linha do arquivo em um objeto Conta
        System.out.println("Carregando conta a partir da linha do arquivo: " + linhaArquivo);
        // Aqui você implementaria a lógica real de conversão
        String[] dadosIniciais = linhaArquivo.split("__");
        String[] dados = dadosIniciais[1].split("$##$");

        AccountRecord conta = new AccountRecord();
        conta.cpf = dadosIniciais[0];
        conta.nomeDaConta = dados[0];
        conta.numeroAgencia = Integer.parseInt(dados[1]);
        conta.numeroConta = dados[2];
        conta.saldo = Double.parseDouble(dados[3]);
        String[] movimentacoes = dados[4].split("_$_");
        for(String movimentacao : movimentacoes){
            String[] dadosMovimentacao = movimentacao.split("$$");
            conta.historicoMovimentacoes.add(new AccountMovement(dadosMovimentacao[0], Double.parseDouble(dadosMovimentacao[1]), dadosMovimentacao[2]));
        }

        return conta; // Retorna uma nova conta como exemplo
    }
}
