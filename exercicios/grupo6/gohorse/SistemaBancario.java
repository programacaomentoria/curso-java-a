package exercicios.grupo6.gohorse;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arquivoContas = "contas1.txt";
        
        while (true) {
            System.out.println("\n=== SISTEMA BANCÁRIO ===");
            System.out.println("1 - Cadastro de Conta");
            System.out.println("2 - Login no Sistema");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer
            
            if (opcao == 0) {
                System.out.println("Obrigado por usar nosso sistema!");
                break;
            }
            
            if (opcao == 1) {
                // CADASTRO DE CONTA
                System.out.println("\n=== CADASTRO DE CONTA ===");
                System.out.print("Digite o CPF: ");
                String cpf = scanner.nextLine();
                
                // Verificar se CPF já existe
                boolean cpfExiste = false;
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(arquivoContas));
                    String linha;
                    while ((linha = reader.readLine()) != null) {
                        if (linha.startsWith("CPF:" + cpf + ";")) {
                            cpfExiste = true;
                            break;
                        }
                    }
                    reader.close();
                } catch (IOException e) {
                    // Arquivo não existe ainda, tudo bem
                }

                if (cpfExiste) {
                    System.out.println("CPF já cadastrado no sistema!");
                    continue;
                }

                System.out.print("Digite o nome: ");
                String nome = scanner.nextLine();

                boolean contemPontoVirgula = false;
                contemPontoVirgula = cpf.contains(";") || nome.contains(";");
                if (contemPontoVirgula) {
                    System.out.println("CPF ou nome inválido! Não utilize o caractere ';' ");
                    continue;
                }

                // Gravar no arquivo
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoContas, true));
                    writer.write("CPF:" + cpf.trim() + ";NOME:" + nome.trim() + ";SALDO:0.00\n");
                    writer.close();
                    System.out.println("Conta cadastrada com sucesso!");

                    writer = new BufferedWriter(new FileWriter("extrato_" + cpf + ".txt", true));
                    LocalDateTime agora = LocalDateTime.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm");
                    writer.write(agora.format(formatter) + "  ABERTURA CONTA  " + String.format("%.2f", 0.00) + "+\n");
                    writer.close();

                } catch (IOException e) {
                    System.out.println("Erro ao cadastrar conta: " + e.getMessage());
                }
                
            } else if (opcao == 2) {
                // LOGIN NO SISTEMA
                System.out.println("\n=== LOGIN NO SISTEMA ===");
                System.out.print("Digite o CPF: ");
                String cpfLogin = scanner.nextLine();
                
                // Verificar se CPF existe e obter dados
                String nomeCliente = "";
                double saldoAtual = 0.0;
                boolean clienteEncontrado = false;
                
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(arquivoContas));
                    String linha;
                    while ((linha = reader.readLine()) != null) {

                        // System.out.println(linha);

                        // CPF:012345
                        // NOME: Rodrigo Fischer
                        // SALDO:56.99
                        if (linha.startsWith("CPF:" + cpfLogin + ";")) {
                            clienteEncontrado = true;
                            String[] partes = linha.split(";");
                            nomeCliente = partes[1].substring(5).trim(); // Remove "NOME:"
                            saldoAtual = Double.parseDouble(partes[2].substring(6).trim()); // Remove "SALDO:"
                            break;
                        }
                    }
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Erro ao acessar arquivo: " + e.getMessage());
                    continue;
                }
                
                if (!clienteEncontrado) {
                    System.out.println("CPF não encontrado no sistema!");
                    continue;
                }
                
                System.out.println("Bem-vindo, " + nomeCliente + "!");
                
                // MENU PÓS-LOGIN
                while (true) {
                    System.out.println("\n=== MENU PRINCIPAL ===");
                    System.out.println("1 - Realizar Depósito");
                    System.out.println("2 - Realizar Saque");
                    System.out.println("3 - Verificar Saldo");
                    System.out.println("4 - Emitir Extrato");
                    System.out.println("0 - Voltar ao menu inicial");
                    System.out.print("Escolha uma opção: ");
                    
                    int opcaoMenu = scanner.nextInt();
                    scanner.nextLine(); // Limpar buffer
                    
                    if (opcaoMenu == 0) {
                        break;
                    }
                    
                    if (opcaoMenu == 1) {
                        // REALIZAR DEPÓSITO
                        System.out.println("\n=== REALIZAR DEPÓSITO ===");
                        System.out.print("Digite o valor a ser depositado: R$ ");
                        double valorDeposito = scanner.nextDouble();
                        scanner.nextLine(); // Limpar buffer
                        
                        if (valorDeposito <= 0) {
                            System.out.println("Valor inválido! O depósito deve ser maior que zero.");
                            continue;
                        }
                        
                        saldoAtual += valorDeposito;
                        
                        // Atualizar arquivo de contas
                        try {
                            List<String> linhas = new ArrayList<>();
                            BufferedReader reader = new BufferedReader(new FileReader(arquivoContas));
                            String linha;
                            while ((linha = reader.readLine()) != null) {
                                if (linha.startsWith("CPF:" + cpfLogin + ";")) {
                                    linha = "CPF:" + cpfLogin + ";NOME:" + nomeCliente + ";SALDO:" + String.format("%.2f", saldoAtual);
                                }
                                linhas.add(linha);
                            }
                            reader.close();
                            
                            BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoContas));
                            for (String l : linhas) {
                                writer.write(l + "\n");
                            }
                            writer.close();
                        } catch (IOException e) {
                            System.out.println("Erro ao atualizar arquivo: " + e.getMessage());
                            continue;
                        }
                        
                        // Registrar movimentação
                        try {
                            BufferedWriter writer = new BufferedWriter(new FileWriter("extrato_" + cpfLogin + ".txt", true));
                            LocalDateTime agora = LocalDateTime.now();
                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm");
                            writer.write(agora.format(formatter) + "     DEPOSITO     " + String.format("%.2f", valorDeposito) + "+\n");
                            writer.close();
                        } catch (IOException e) {
                            System.out.println("Erro ao registrar movimentação: " + e.getMessage());
                        }
                        
                        System.out.println("Depósito realizado com sucesso! Novo saldo: R$ " + String.format("%.2f", saldoAtual));
                        
                    } else if (opcaoMenu == 2) {
                        // REALIZAR SAQUE
                        while (true) {
                            System.out.println("\n=== REALIZAR SAQUE ===");
                            System.out.println("Saldo atual: R$ " + String.format("%.2f", saldoAtual));
                            System.out.print("Digite o valor a ser sacado: R$ ");
                            double valorSaque = scanner.nextDouble();
                            scanner.nextLine(); // Limpar buffer
                            
                            if (valorSaque <= 0) {
                                System.out.println("Valor inválido! O saque deve ser maior que zero.");
                                continue;
                            }
                            
                            if (valorSaque > saldoAtual) {
                                System.out.println("Saldo insuficiente!");
                                System.out.print("Deseja realizar saque de outro valor? (s/n): ");
                                String resposta = scanner.nextLine();
                                if (!resposta.equalsIgnoreCase("s")) {
                                    break;
                                }
                                continue;
                            }
                            
                            saldoAtual -= valorSaque;
                            
                            // Atualizar arquivo de contas
                            try {
                                List<String> linhas = new ArrayList<>();
                                BufferedReader reader = new BufferedReader(new FileReader(arquivoContas));
                                String linha;
                                while ((linha = reader.readLine()) != null) {
                                    if (linha.startsWith("CPF:" + cpfLogin + ";")) {
                                        linha = "CPF:" + cpfLogin + ";NOME:" + nomeCliente + ";SALDO:" + String.format("%.2f", saldoAtual);
                                    }
                                    linhas.add(linha);
                                }
                                reader.close();
                                
                                BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoContas));
                                for (String l : linhas) {
                                    writer.write(l + "\n");
                                }
                                writer.close();
                            } catch (IOException e) {
                                System.out.println("Erro ao atualizar arquivo: " + e.getMessage());
                                break;
                            }
                            
                            // Registrar movimentação
                            try {
                                BufferedWriter writer = new BufferedWriter(new FileWriter("extrato_" + cpfLogin + ".txt", true));
                                LocalDateTime agora = LocalDateTime.now();
                                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm");
                                writer.write(agora.format(formatter) + "     SAQUE         " + String.format("%.2f", valorSaque) + "-\n");
                                writer.close();
                            } catch (IOException e) {
                                System.out.println("Erro ao registrar movimentação: " + e.getMessage());
                            }
                            
                            System.out.println("Saque realizado com sucesso! Novo saldo: R$ " + String.format("%.2f", saldoAtual));
                            break;
                        }
                        
                    } else if (opcaoMenu == 3) {
                        // VERIFICAR SALDO
                        System.out.println("\n=== VERIFICAR SALDO ===");
                        System.out.println("Saldo atual: R$ " + String.format("%.2f", saldoAtual));
                        System.out.print("Pressione Enter para voltar ao menu...");
                        scanner.nextLine();
                        
                    } else if (opcaoMenu == 4) {
                        // EMITIR EXTRATO
                        System.out.println("\n=== EXTRATO BANCÁRIO ===");
                        System.out.println("Cliente: " + nomeCliente);
                        System.out.println("CPF: " + cpfLogin);
                        System.out.println("==========================================");
                        
                        try {
                            BufferedReader reader = new BufferedReader(new FileReader("extrato_" + cpfLogin + ".txt"));
                            String linha;
                            while ((linha = reader.readLine()) != null) {
                                System.out.println(linha);
                            }
                            reader.close();
                        } catch (IOException e) {
                            System.out.println("Nenhuma movimentação encontrada.");
                        }
                        
                        System.out.println("==========================================");
                        System.out.println("                            SALDO     " + String.format("%.2f", saldoAtual) + "+");
                        System.out.print("Pressione Enter para voltar ao menu...");
                        scanner.nextLine();
                        
                    } else {
                        // System.out.println("Opção inválida!");
                        System.err.println("opcao inválida");
                    }
                }
                
            } else {
                System.out.println("Opção inválida!");
            }
        }
        
        scanner.close();
    }
}