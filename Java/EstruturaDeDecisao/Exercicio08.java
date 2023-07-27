// Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
package EstruturaDeDecisao;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do primeiro produto: ");
        double produto1 = scanner.nextDouble();
        
        System.out.print("Digite o preço do segundo produto: ");
        double produto2 = scanner.nextDouble();

        System.out.print("Digite o preço do terceiro produto: ");
        double produto3 = scanner.nextDouble();

        double produtoMaisBarato = produto1;
        String nomeProdutoMaisBarato = "Produto 1";
        if (produto2 < produtoMaisBarato) {
            produtoMaisBarato = produto2;
            nomeProdutoMaisBarato = "Produto 2";
        }
        if (produto3 < produtoMaisBarato) {
            produtoMaisBarato = produto3;
            nomeProdutoMaisBarato = "Produto 3";
        }

        System.out.println("Você deve comprar o " + nomeProdutoMaisBarato);

        scanner.close();
    }
}
