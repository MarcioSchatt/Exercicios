// Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeUsuario, senha;

        do {
            System.out.print("Digite o nome de usuário: ");
            nomeUsuario = scanner.nextLine().toLowerCase();

            System.out.print("Digite a senha: ");
            senha = scanner.nextLine().toLowerCase();

            if (senha.equals(nomeUsuario)) {
                System.out.println("A senha não pode ser igual ao nome de usuário. Tente novamente.");
            }
        } while (senha.equals(nomeUsuario));

        System.out.println("Cadastro realizado com sucesso!");

        scanner.close();
    }
}
