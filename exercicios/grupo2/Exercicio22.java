/**
 Login com Credenciais: Crie um algoritmo que verifique se um nome de usuário (ex: "admin") E uma
senha (ex: "1234") estão corretos para conceder acesso.
 * @author Rodrigo Fischer (programacao.mentoria)
 */
package exercicios.grupo2;

import java.util.Scanner;

public class Exercicio22 {

    public static boolean isCredencialValida(String usuario, String senha) {
        return (usuario.equals("admin") && senha.equals("1234"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o usuário: ");
        String usuarioInput = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senhaInput = scanner.nextLine();

        if (isCredencialValida(usuarioInput, senhaInput)) {
            System.out.println("Usuário autenticado!");
        }
        else {
            System.out.println("Dados Inválidos!");
        }
        scanner.close();
    }
}
