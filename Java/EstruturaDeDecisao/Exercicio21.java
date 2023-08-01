// Faça um Programa para um caixa eletrônico.
// O programa deverá perguntar ao usuário a valor do saque e depois informar quantas notas de cada valor serão fornecidas.
// As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 reais.
// O programa não deve se preocupar com a quantidade de notas existentes na máquina.

// Ex1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota de 5 e uma nota de 1;
// Ex2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.
package EstruturaDeDecisao;
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do saque (entre 10 e 600 reais): ");
        int valorSaque = scanner.nextInt();

        if (valorSaque < 10 || valorSaque > 600) {
            System.out.println("Valor de saque inválido. O valor deve estar entre 10 e 600 reais.");
            scanner.close();
            return;
        }

        int[] notas = {100, 50, 10, 5, 1};
        int[] quantidadeNotas = new int[notas.length];

        int valorRestante = valorSaque;
        for (int i = 0; i < notas.length; i++) {
            quantidadeNotas[i] = valorRestante / notas[i];
            valorRestante %= notas[i];
        }

        System.out.println("Notas fornecidas:");

        for (int i = 0; i < notas.length; i++) {
            if (quantidadeNotas[i] > 0) {
                if (quantidadeNotas[i] == 1 && notas[i] == 1) {
                    System.out.println(quantidadeNotas[i] + " nota de " + notas[i] + " real");
                } else if (quantidadeNotas[i] == 1 && notas[i] > 1) {
                    System.out.println(quantidadeNotas[i] + " nota de " + notas[i] + " reais");
                } else if (quantidadeNotas[i] > 1 && notas[i] == 1) {
                    System.out.println(quantidadeNotas[i] + " notas de " + notas[i] + " real");
                } else if (quantidadeNotas[i] > 1 && notas[i] > 1) {
                    System.out.println(quantidadeNotas[i] + " notas de " + notas[i] + " reais");
                }
            }
        }

        scanner.close();
    }
}
