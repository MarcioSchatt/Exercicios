// Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
package EstruturaSequencial;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do arquivo para download (em MB): ");
        double tamanhoArquivoMB = scanner.nextDouble();

        System.out.print("Digite a velocidade do link de Internet (em Mbps): ");
        double velocidadeInternetMbps = scanner.nextDouble();

        double tamanhoArquivoBits = tamanhoArquivoMB * 8 * 1024 * 1024;

        double velocidadeInternetBytesPorSegundo = velocidadeInternetMbps * 1024 * 1024 / 8;

        double tempoDownloadSegundos = tamanhoArquivoBits / velocidadeInternetBytesPorSegundo;

        double tempoDownloadMinutos = tempoDownloadSegundos / 60;

        System.out.printf("O tempo aproximado de download do arquivo é de %.2f minutos.%n", tempoDownloadMinutos);

        scanner.close();
    }
}
