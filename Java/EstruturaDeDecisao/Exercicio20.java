// Faça um Programa para leitura de três notas parciais de um aluno.
// O programa deve calcular a média alcançada por aluno e presentar:

// a) A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
// b) A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
// c) A mensagem "Aprovado com Distinção", se a média for igual a 10.
package EstruturaDeDecisao;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Média alcançada: %.2f%n", media);

        if (media == 10) {
            System.out.println("Aprovado com Distinção!");
        } else if (media >= 7) {
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado.");
        }

        scanner.close();
    }
}
