// Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs e o valor médio gasto em cada um deles.
// O usuário deverá informar a quantidade de CDs e o valor para em cada um.
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de CDs na coleção: ");
        int quantidadeCds = scanner.nextInt();

        double totalInvestido = 0;

        for (int i = 1; i <= quantidadeCds; i++) {
            System.out.print("Digite o valor do CD " + i + ": R$");
            double valorCd = scanner.nextDouble();
            totalInvestido += valorCd;
        }

        double mediaValorCd = totalInvestido / quantidadeCds;

        System.out.println("Valor total investido na coleção: R$ " + totalInvestido);
        System.out.println("Valor médio gasto em cada CD: R$ " + mediaValorCd);

        scanner.close();
    }
}
