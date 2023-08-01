// Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.
package EstruturaDeDecisao;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String dataString = scanner.nextLine();

        String[] partesData = dataString.split("/");

        if (partesData.length != 3) {
            System.out.println("A data " + dataString + " não é válida.");
            scanner.close();
            return;
        }

        int dia = Integer.parseInt(partesData[0]);
        int mes = Integer.parseInt(partesData[1]);
        int ano = Integer.parseInt(partesData[2]);

        if (ano < 1) {
            System.out.println("A data " + dataString + " não é válida.");
            scanner.close();
            return;
        }

        if (mes < 1 || mes > 12) {
            System.out.println("A data " + dataString + " não é válida.");
            scanner.close();
            return;
        }

        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            diasPorMes[1] = 29;
        }

        if (dia < 1 || dia > diasPorMes[mes - 1]) {
            System.out.println("A data " + dataString + " não é válida.");
            scanner.close();
            return;
        }

        System.out.println("A data " + dataString + " é válida.");

        scanner.close();
    }
}
