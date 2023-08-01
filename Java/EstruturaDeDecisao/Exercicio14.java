// Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média.
// A atribuição de conceitos obedece à tabela abaixo:

//   Média de Aproveitamento  Conceito
//   Entre 9.0 e 10.0        A
//   Entre 7.5 e 9.0         B
//   Entre 6.0 e 7.5         C
//   Entre 4.0 e 6.0         D
//   Entre 4.0 e zero        E

// O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.
package EstruturaDeDecisao;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 9.0 && media <= 10.0) {
            System.out.println("Conceito: A");
        } else if (media >= 7.5 && media < 9.0) {
            System.out.println("Conceito: B");
        } else if (media >= 6.0 && media < 7.5) {
            System.out.println("Conceito: C");
        } else if (media >= 4.0 && media < 6.0) {
            System.out.println("Conceito: D");
        } else if (media >= 0.0 && media < 4.0) {
            System.out.println("Conceito: E");
        } else {
            System.out.println("Valor inválido para a média.");
            System.exit(0);
        }
        
        if (media >= 6.0) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
        
        System.out.println("Notas: " + nota1 + " e " + nota2);
        System.out.println("Média: " + media);

        scanner.close();
    }
}
