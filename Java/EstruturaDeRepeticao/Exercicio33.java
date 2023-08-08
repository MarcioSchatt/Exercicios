// O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa que leia as um conjunto indeterminado de temperaturas, e informe ao final a menor e a maior temperaturas informadas, bem como a média das temperaturas.
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as temperaturas (digite um valor negativo para encerrar):");

        double temperatura;
        double somaTemperaturas = 0;
        double maiorTemperatura = Double.MIN_VALUE;
        double menorTemperatura = Double.MAX_VALUE;
        int contador = 0;

        do {
            System.out.print("Temperatura " + (contador + 1) + ": ");
            temperatura = scanner.nextDouble();

            if (temperatura >= 0) {
                somaTemperaturas += temperatura;
                contador++;

                if (temperatura > maiorTemperatura) {
                    maiorTemperatura = temperatura;
                }

                if (temperatura < menorTemperatura) {
                    menorTemperatura = temperatura;
                }
            }
        } while (temperatura >= 0);

        if (contador > 0) {
            double mediaTemperaturas = somaTemperaturas / contador;

            System.out.println("Maior temperatura: " + maiorTemperatura);
            System.out.println("Menor temperatura: " + menorTemperatura);
            System.out.println("Média das temperaturas: " + mediaTemperaturas);
        } else {
            System.out.println("Nenhuma temperatura informada.");
        }

        scanner.close();
    }
}
