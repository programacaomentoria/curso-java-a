
ESCREVER UM PROGRAMA EM JAVA OU EM PYTHON, ONDE:
GERENCIAMENTO DE UM SISTEMA BANCARIO (SUPER ALTO NIVEL)
    - TENHO OPCOES DE:
        1 - CADASTRO DE CONTA
          1.1  - CADASTRE UM CPF E NOME
        2 - UMA VEZ CADASTRADO OU RECONHECIDO NO SISTEMA (ATRAVES DE UM CPF INFORMADO)
          2.1  - TENHO OPCOES DE:
             2.1.x   - REALIZAR DEPOSITO DE QUALQUER VALOR
                - REALIZAR SAQUES
                -(ficará para opcao 2) SOLICITAR LIMITE DE CHEQUE ESPECIAL - repensar opcao
                - VERIFICAR SALDO
                - EMITIR EXTRATO MOSTRANDO AS MOVIMENTAÇÕES

UX - User experience
2 MENUS
    - primeiro menu
        2 opcoes:
            - cadastro do cliente
                - uma vez cadastrado através de cpf e nome informados, gravar os dados, e uma vez gravados, voltar para o primeiro menu
            - login no sistema
                uma vez o cpf reconhecido ou seja, o cliente estando no arquivo e reconhecido oferecer as opcoes de menu
                -- menu pós-login
                    - realizar deposito
                        - solicitar a quantia a ser depositada e confirmar que o mesmo foi inserido no sistema e voltar para o menu pós-login
                    - realizar saques
                        - solicitar a quantia a ser sacada. Para tanto, é necessário verificar o saldo atual. Caso, tenha saldo suficiente, o saque será liberado. 
                        caso não tenha saldo suficiente, informar o cliente de que não há saldo suficiente. Deseja realizar saque de outro valor? Se sim, volta
                        para a opcao de realizar saques ou sair para o menu pós-login. 
                        Atualizar valor do saldo no arquivo após o saque. Voltar para o menu pós-login.
                    - verificar saldo
                        - imprimir saldo atual. mostrar opcao para voltar ao menu pós-login
                    - emitir extrato
                        - imprimir todas as movimentações, com data e hora, ação realizada (saque ou deposito), e o valor movimentado
                        Exemplo:
                        06-11-2025  19:34   DEPOSITO    1000.00+
                        06-11-2025  20:04   SAQUE        300.00-
                        06-11-2025  20:04   SAQUE        250.00-
                        ==========================================
                                            SALDO        450.00+

                    - fazer logout. Voltar para o primeiro menu

UTILIZAR COMANDOS DE CONDICIONAL, LOOPS, ESTRUTURAS DE ROTINA E FUNÇÕES, SALVAR E RECUPERAR DADOS EM ARQUIVOS (DADOS CADASTRAIS DAS PESSOAS E SEUS SALDOS E MOVIMENTOS)

arquivos
    lendo
    escrevendo (sempre escrevendo do zero ou fazendo o tal do append - anexo - incrementar - adicionando dados no final do arquivo )


banco de dados - formas de interacao
comandos sql
    consultas
    insert (criar dados)
    updates (atualizar dados)
    delete (excluir dados)
