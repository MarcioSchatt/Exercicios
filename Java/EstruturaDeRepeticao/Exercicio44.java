// Em uma eleição presidencial existem quatro candidatos.
// Os votos são informados por meio de código. Os códigos utilizados são:

// 1 , 2, 3, 4  - Votos para os respectivos candidatos 
// (você deve montar a tabela ex: 1 - Jose/ 2- João/etc)
// 5 - Voto Nulo
// 6 - Voto em Branco

// Faça um programa que calcule e mostre:
// - O total de votos para cada candidato;
// - O total de votos nulos;
// - O total de votos em branco;
// - A percentagem de votos nulos sobre o total de votos;
// - A percentagem de votos em branco sobre o total de votos. Para finalizar o conjunto de votos tem-se o valor zero.
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] votosCandidatos = new int[4];
        int votosNulos = 0, votosBranco = 0, totalVotos = 0;

        while (true) {
            System.out.println("Códigos:");
            System.out.println("1 - Candidato 1");
            System.out.println("2 - Candidato 2");
            System.out.println("3 - Candidato 3");
            System.out.println("4 - Candidato 4");
            System.out.println("5 - Voto Nulo");
            System.out.println("6 - Voto em Branco");
            System.out.println("0 - Encerrar a votação");

            System.out.print("Digite o código do voto: ");
            int codigoVoto = scanner.nextInt();

            if (codigoVoto == 0) {
                break;
            }

            if (codigoVoto >= 1 && codigoVoto <= 4) {
                votosCandidatos[codigoVoto - 1]++;
            } else if (codigoVoto == 5) {
                votosNulos++;
            } else if (codigoVoto == 6) {
                votosBranco++;
            } else {
                System.out.println("Código inválido!");
            }

            totalVotos++;
        }

        System.out.println("Total de votos para cada candidato:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + votosCandidatos[i] + " votos");
        }

        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosBranco);

        double percentagemNulos = (double) votosNulos / totalVotos * 100;
        double percentagemBranco = (double) votosBranco / totalVotos * 100;

        System.out.println("Percentagem de votos nulos sobre o total de votos: " + percentagemNulos + "%");
        System.out.println("Percentagem de votos em branco sobre o total de votos: " + percentagemBranco + "%");

        scanner.close();
    }
}
