// Faça um programa que peça para n pessoas a sua idade, ao final o programa devera verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas na turma: ");
        int n = scanner.nextInt();

        int somaIdades = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = scanner.nextInt();
            somaIdades += idade;
        }

        double mediaIdade = (double) somaIdades / n;

        String classificacao;
        if (mediaIdade >= 0 && mediaIdade <= 25) {
            classificacao = "jovem";
        } else if (mediaIdade <= 60) {
            classificacao = "adulta";
        } else {
            classificacao = "idosa";
        }

        System.out.println("Média de idade da turma: " + mediaIdade);
        System.out.println("A turma é " + classificacao + ".");

        scanner.close();
    }
}
