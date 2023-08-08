// O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e agora possui uma loja de conveniências.
// Faça um programa que implemente uma caixa registradora rudimentar.
// O programa deverá receber um número desconhecido de valores referentes aos preços das mercadorias.
// Um valor zero deve ser informado pelo operador para indicar o final da compra.
// O programa deve então mostrar o total da compra e perguntar o valor em dinheiro que o cliente forneceu, para então calcular e mostrar o valor do troco.
// Após esta operação, o programa deverá voltar ao ponto inicial, para registrar a próxima compra. A saída deve ser conforme o exemplo abaixo:

// Lojas Tabajara 
// Produto 1: R$ 2.20
// Produto 2: R$ 5.80
// Produto 3: R$ 0
// Total: R$ 9.00
// Dinheiro: R$ 20.00
// Troco: R$ 11.00
// ...
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroProduto = 1;
        boolean continuarCompras = true;

        while (continuarCompras) {
            double totalCompra = 0;

            System.out.println("Lojas Tabajara - Compra " + numeroProduto);
            int contador = 1;

            while (true) {
                System.out.print("Produto " + contador + " (ou 0 para finalizar): R$");
                double preco = scanner.nextDouble();
                if (preco == 0) {
                    break;
                }
                totalCompra += preco;
                contador++;
            }

            System.out.println("Total: R$ " + totalCompra);

            System.out.print("Dinheiro fornecido pelo cliente: R$");
            double dinheiroFornecido = scanner.nextDouble();

            double troco = dinheiroFornecido - totalCompra;
            System.out.println("Troco: R$ " + troco);

            System.out.print("Deseja continuar com outra compra? (S/N): ");
            String opcao = scanner.next();
            if (opcao.equalsIgnoreCase("N")) {
                continuarCompras = false;
            } else if (opcao.equalsIgnoreCase("S")) {
                continuarCompras = true;
            } else {
                while (!(opcao.equalsIgnoreCase("N") || opcao.equalsIgnoreCase("S"))) {
                    System.out.println("Erro! Digite uma letra válida.");
                    System.out.print("Deseja continuar com outra compra? (S/N): ");
                    opcao = scanner.next();
                }
                if (opcao.equalsIgnoreCase("N")) {
                    continuarCompras = false;
                }
            }

            numeroProduto++;
        }

        scanner.close();
    }
}
