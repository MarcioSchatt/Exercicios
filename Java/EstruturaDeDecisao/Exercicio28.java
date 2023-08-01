// O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:

//                       Até 5 Kg           Acima de 5 Kg
// File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
// Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
// Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg

// Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, porém não há limites para a quantidade de carne por cliente.
// Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total da compra.
// Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal,
// contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.
package EstruturaDeDecisao;
import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double descontoCartaoTabajara = 0.05;

        System.out.println("Tipos de carne disponíveis:");
        System.out.println("1 - File Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        System.out.print("Digite o número correspondente ao tipo de carne que deseja comprar: ");
        int tipoCarne = scanner.nextInt();

        if (tipoCarne < 1 || tipoCarne > 3) {
            System.out.println("Opção inválida. Saindo do programa.");
            scanner.close();
            return;
        }

        System.out.print("Digite a quantidade (em Kg) de carne que deseja comprar: ");
        double quantidadeCarne = scanner.nextDouble();

        double precoPorKg = 0;
        String tipoCarneDescricao = "";

        switch (tipoCarne) {
            case 1:
                tipoCarneDescricao = "File Duplo";
                if (quantidadeCarne <= 5) {
                    precoPorKg = 4.90;
                } else {
                    precoPorKg = 5.80;
                }
                break;
            case 2:
                tipoCarneDescricao = "Alcatra";
                if (quantidadeCarne <= 5) {
                    precoPorKg = 5.90;
                } else {
                    precoPorKg = 6.80;
                }
                break;
            case 3:
                tipoCarneDescricao = "Picanha";
                if (quantidadeCarne <= 5) {
                    precoPorKg = 6.90;
                } else {
                    precoPorKg = 7.80;
                }
                break;
            default:
                System.out.println("Opção inválida. Saindo do programa.");
                scanner.close();
                return;
        }

        double valorTotal = quantidadeCarne * precoPorKg;

        System.out.print("Deseja pagar com o cartão Tabajara? (S/N): ");
        String cartaoTabajara = scanner.next().toUpperCase();

        double valorDesconto = 0;
        String formaPagamento = "";
        if (cartaoTabajara == "S") {
            valorDesconto = valorTotal * descontoCartaoTabajara;
            valorTotal -= valorDesconto;
            formaPagamento = "Cartão Tabajara";
        } else if (cartaoTabajara == "N") {
            formaPagamento = "Dinheiro";
        } else {
            System.out.println("Forma de pagamento inválida.");
            scanner.close();
            return;
        }

        System.out.println("Cupom Fiscal:");
        System.out.println("Tipo de carne: " + tipoCarneDescricao);
        System.out.println("Quantidade: " + quantidadeCarne + " Kg");
        System.out.printf("Preço total: R$ %.2f%n", valorTotal);
        System.out.println("Tipo de pagamento: " + formaPagamento);
        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Valor a pagar: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}
