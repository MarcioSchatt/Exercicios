// Faça um programa que peça uma nota, entre zero e dez.
// Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota;

        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido! A nota deve estar entre 0 e 10.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Você digitou a nota: " + nota);
        
        scanner.close();
    }
}
