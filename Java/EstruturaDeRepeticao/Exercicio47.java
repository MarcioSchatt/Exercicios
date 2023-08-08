// Em uma competição de ginástica, cada atleta recebe votos de sete jurados.
// A melhor e a pior nota são eliminadas.
// A sua nota fica sendo a média dos votos restantes.
// Você deve fazer um programa que receba o nome do ginasta e as notas dos sete jurados alcançadas pelo atleta em sua apresentação e depois informe a sua média, conforme a descrição acima informada (retirar o melhor e o pior salto e depois calcular a média com as notas restantes).
// As notas não são informados ordenadas.
// Um exemplo de saída do programa deve ser conforme o exemplo abaixo:

// Atleta: Aparecido Parente
// Nota: 9.9
// Nota: 7.5
// Nota: 9.5
// Nota: 8.5
// Nota: 9.0
// Nota: 8.5
// Nota: 9.7

// Resultado final:
// Atleta: Aparecido Parente
// Melhor nota: 9.9
// Pior nota: 7.5
// Média: 9,04
package EstruturaDeRepeticao;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Exercicio47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do ginasta: ");
        String nomeGinasta = scanner.nextLine();

        ArrayList<Double> notas = new ArrayList<>();

        for (int i = 1; i <= 7; i++) {
            System.out.print("Nota " + i + ": ");
            double nota = scanner.nextDouble();
            notas.add(nota);
        }

        Collections.sort(notas);

        double melhorNota = notas.get(6);
        double piorNota = notas.get(0);

        double somaNotas = 0.0;
        for (int i = 1; i < 6; i++) {
            somaNotas += notas.get(i);
        }

        double media = somaNotas / 5;

        System.out.println("Resultado final:");
        System.out.println("Atleta: " + nomeGinasta);
        System.out.println("Melhor nota: " + melhorNota);
        System.out.println("Pior nota: " + piorNota);
        System.out.println("Média: " + media);

        scanner.close();
    }
}
