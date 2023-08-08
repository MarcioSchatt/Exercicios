// Numa eleição existem três candidatos. Faça um programa que peça o número total de eleitores.
// Peça para cada eleitor votar e ao final mostrar o número de votos de cada candidato.
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;

        for (int i = 1; i <= totalEleitores; i++) {
            System.out.println("Eleitor " + i + ", escolha o seu candidato:");
            System.out.println("1 - Candidato 1");
            System.out.println("2 - Candidato 2");
            System.out.println("3 - Candidato 3");
            int voto = scanner.nextInt();

            switch (voto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                default:
                    System.out.println("Voto inválido! Por favor, escolha um candidato válido.");
            }
        }

        System.out.println("Resultado da eleição:");
        System.out.println("Candidato 1: " + votosCandidato1 + " votos.");
        System.out.println("Candidato 2: " + votosCandidato2 + " votos.");
        System.out.println("Candidato 3: " + votosCandidato3 + " votos.");

        scanner.close();
    }
}
