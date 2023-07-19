// Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
// Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
// Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
// a) comprar apenas latas de 18 litros;
// b) comprar apenas galões de 3,6 litros;
// c) misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.
package EstruturaSequencial;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da área a ser pintada em metros quadrados: ");
        double tamanhoAreaPintada = scanner.nextDouble();

        double tamanhoAreaComFolga = tamanhoAreaPintada * 1.1;

        double litrosTintaNecessarios = tamanhoAreaComFolga / 6.0;

        int latasTinta = (int) Math.ceil(litrosTintaNecessarios / 18);
        int galoesTinta = (int) Math.ceil(litrosTintaNecessarios / 3.6);

        double precoPorLata = 80.00;
        double precoPorGalao = 25.00;
        double precoTotalLatas = latasTinta * precoPorLata;
        double precoTotalGaloes = galoesTinta * precoPorGalao;

        int latasParaMistura = (int) (litrosTintaNecessarios / 18);
        double litrosRestantes = litrosTintaNecessarios % 18;
        int galoesParaMistura = (int) Math.ceil(litrosRestantes / 3.6);

        double precoTotalMistura = (latasParaMistura * precoPorLata) + (galoesParaMistura * precoPorGalao);

        System.out.println("a) Comprar apenas latas de 18 litros:");
        System.out.println("   Quantidade de latas de tinta a serem compradas: " + latasTinta);
        System.out.printf("   Preço total: R$ %.2f%n", precoTotalLatas);

        System.out.println("\nb) Comprar apenas galões de 3,6 litros:");
        System.out.println("   Quantidade de galões de tinta a serem comprados: " + galoesTinta);
        System.out.printf("   Preço total: R$ %.2f%n", precoTotalGaloes);

        System.out.println("\nc) Misturar latas e galões:");
        System.out.println("   Quantidade de latas de tinta a serem compradas: " + latasParaMistura);
        System.out.println("   Quantidade de galões de tinta a serem comprados: " + galoesParaMistura);
        System.out.printf("   Preço total: R$ %.2f%n", precoTotalMistura);

        scanner.close();
    }
}
