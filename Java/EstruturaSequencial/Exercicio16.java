// Faça um programa para uma loja de tintas.
// O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
// Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
// Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
package EstruturaSequencial;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da área a ser pintada em metros quadrados: ");
        double tamanhoAreaPintada = scanner.nextDouble();

        double litrosTintaNecessarios = tamanhoAreaPintada / 3.0;

        int latasTinta = (int) Math.ceil(litrosTintaNecessarios / 18);

        double precoPorLata = 80.00;
        double precoTotal = latasTinta * precoPorLata;

        System.out.println("Quantidade de latas de tinta a serem compradas: " + latasTinta);
        System.out.printf("Preço total: R$ %.2f%n", precoTotal);

        scanner.close();
    }
}
