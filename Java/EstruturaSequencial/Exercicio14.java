// João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
// Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.
// João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.
// Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar.
// Imprima os dados do programa com as mensagens adequadas.
package EstruturaSequencial;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso de peixes (em quilos): ");
        double pesoPeixes = scanner.nextDouble();

        double limitePeso = 50.0;
        double excesso = pesoPeixes - limitePeso;

        double valorMultaPorQuiloExcedente = 4.0;
        double multa = excesso * valorMultaPorQuiloExcedente;

        if (excesso > 0) {
            System.out.printf("Excesso de peso: %.2f kg%n", excesso);
            System.out.printf("Valor da multa a pagar: R$ %.2f%n", multa);
        } else {
            System.out.println("Não houve excesso de peso. Nenhuma multa será aplicada.");
        }

        scanner.close();
    }
}
