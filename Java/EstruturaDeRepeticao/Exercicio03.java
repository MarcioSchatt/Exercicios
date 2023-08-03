// Faça um programa que leia e valide as seguintes informações:
// - Nome: maior que 3 caracteres;
// - Idade: entre 0 e 150;
// - Salário: maior que zero;
// - Sexo: 'f' ou 'm';
// - Estado Civil: 's', 'c', 'v', 'd';
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        do {
            System.out.print("Digite o nome (maior que 3 caracteres): ");
            nome = scanner.nextLine();
        } while (nome.length() <= 3);

        do {
            System.out.print("Digite a idade (entre 0 e 150): ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);

        do {
            System.out.print("Digite o salário (maior que zero): ");
            salario = scanner.nextDouble();
        } while (salario <= 0);

        do {
            System.out.print("Digite o sexo ('f' para feminino ou 'm' para masculino): ");
            sexo = scanner.next().toLowerCase();
        } while (!sexo.equals("f") && !sexo.equals("m"));

        do {
            System.out.print("Digite o estado civil ('s' para solteiro(a), 'c' para casado(a), 'v' para viúvo(a) ou 'd' para divorciado(a)): ");
            estadoCivil = scanner.next().toLowerCase();
        } while (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v") && !estadoCivil.equals("d"));

        System.out.println("Informações validadas com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        scanner.close();
    }
}
