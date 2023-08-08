// O cardápio de uma lanchonete é o seguinte:

// Especificação   Código  Preço
// Cachorro Quente 100     R$ 1,20
// Bauru Simples   101     R$ 1,30
// Bauru com ovo   102     R$ 1,50
// Hambúrguer      103     R$ 1,20
// Cheeseburguer   104     R$ 1,30
// Refrigerante    105     R$ 1,00

// Faça um programa que leia o código dos itens pedidos e as quantidades desejadas.
// Calcule e mostre o valor a ser pago por item (preço * quantidade) e o total geral do pedido.
// Considere que o cliente deve informar quando o pedido deve ser encerrado.
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] precos = {
            1.20, 1.30, 1.50, 1.20, 1.30, 1.00};
        String[] itens = {
            "Cachorro Quente", "Bauru Simples", "Bauru com ovo", "Hambúrguer", "Cheeseburguer", "Refrigerante"};

        System.out.println("Cardápio da Lanchonete:");
        for (int i = 0; i < precos.length; i++) {
            System.out.println(i + 100 + " - " + itens[i] + " - R$" + precos[i]);
        }

        double totalGeral = 0;

        while (true) {
            System.out.print("Digite o código do item (-1 para encerrar): ");
            int codigo = scanner.nextInt();

            if (codigo == -1) {
                break;
            }

            if (codigo >= 100 && codigo <= 105) {
                System.out.print("Digite a quantidade desejada: ");
                int quantidade = scanner.nextInt();

                double precoItem = precos[codigo - 100] * quantidade;
                totalGeral += precoItem;

                System.out.println("Item: " + itens[codigo - 100]);
                System.out.println("Quantidade: " + quantidade);
                System.out.println("Valor a pagar: R$" + precoItem);
            } else {
                System.out.println("Código inválido!");
            }
        }

        System.out.println("Total geral do pedido: R$ " + totalGeral);

        scanner.close();
    }
}
