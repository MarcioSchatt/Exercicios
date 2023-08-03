// Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%.
// Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.

// Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais.
// Valide a entrada e permita repetir a operação.
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Digite a população do país A: ");
            int populacaoA = lerInteiroPositivo(scanner);

            System.out.print("Digite a taxa de crescimento anual do país A (em decimal): ");
            double crescimentoA = lerDoublePositivo(scanner);

            System.out.print("Digite a população do país B: ");
            int populacaoB = lerInteiroPositivo(scanner);

            System.out.print("Digite a taxa de crescimento anual do país B (em decimal): ");
            double crescimentoB = lerDoublePositivo(scanner);

            int anos = 0;

            while (populacaoA < populacaoB) {
                populacaoA += (int) (populacaoA * crescimentoA);
                populacaoB += (int) (populacaoB * crescimentoB);
                anos++;
            }

            System.out.println("Serão necessários " + anos + " anos para que a população do país A ultrapasse ou iguale a população do país B.");
            System.out.println("População do país A: " + populacaoA);
            System.out.println("População do país B: " + populacaoB);

            System.out.println("Deseja repetir a operação? (s/n)");
            String opcao = scanner.next().toLowerCase();
            if (!opcao.equals("s")) {
                break;
            }
        } while (true);

        System.out.println("Programa encerrado.");
    }

    public static int lerInteiroPositivo(Scanner scanner) {
        int numero;
        while (true) {
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                if (numero > 0) {
                    break;
                } else {
                    System.out.println("Digite um número inteiro positivo válido.");
                }
            } else {
                System.out.println("Digite um número inteiro positivo válido.");
                scanner.next();
            }
        }
        return numero;
    }

    public static double lerDoublePositivo(Scanner scanner) {
        double numero;
        while (true) {
            if (scanner.hasNextDouble()) {
                numero = scanner.nextDouble();
                if (numero > 0) {
                    break;
                } else {
                    System.out.println("Digite um número positivo válido.");
                }
            } else {
                System.out.println("Digite um número positivo válido.");
                scanner.next();
            }
        }
        return numero;
    }
}
