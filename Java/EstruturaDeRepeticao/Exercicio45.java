// Desenvolver um programa para verificar a nota do aluno em uma prova com 10 questões, o programa deve perguntar ao aluno a resposta de cada questão e ao final comparar com o gabarito da prova e assim calcular o total de acertos e a nota (atribuir 1 ponto por resposta certa).
// Após cada aluno utilizar o sistema deve ser feita uma pergunta se outro aluno vai utilizar o sistema.
// Após todos os alunos terem respondido informar:
// Maior e Menor Acerto;
// Total de Alunos que utilizaram o sistema;
// A Média das Notas da Turma.

// Gabarito da Prova:
// 01 - A
// 02 - B
// 03 - C
// 04 - D
// 05 - E
// 06 - E
// 07 - D
// 08 - C
// 09 - B
// 10 - A

// Após concluir isto você poderia incrementar o programa permitindo que o professor digite o gabarito da prova antes dos alunos usarem o programa.
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String gabarito = "ABCDEEDCBA"; // Gabarito da prova

        int maiorAcerto = 0, menorAcerto = 10;
        int totalAlunos = 0;
        double totalNotas = 0;

        boolean continuar = true;

        while (continuar) {
            int acertos = 0;

            System.out.println("Responda às 10 questões (A, B, C, D ou E):");
            for (int i = 1; i <= 10; i++) {
                System.out.print("Questão " + i + ": ");
                String resposta = scanner.next().toUpperCase();

                if (resposta.equals(String.valueOf(gabarito.charAt(i - 1)))) {
                    acertos++;
                }
            }

            totalNotas += acertos;
            totalAlunos++;

            if (acertos > maiorAcerto) {
                maiorAcerto = acertos;
            }

            if (acertos < menorAcerto) {
                menorAcerto = acertos;
            }

            System.out.println("Total de acertos: " + acertos);
            System.out.println("Nota: " + acertos + " pontos");

            System.out.print("Outro aluno vai utilizar o sistema? (S/N): ");
            String respostaContinuar = scanner.next().toUpperCase();

            if (!respostaContinuar.equals("S")) {
                continuar = false;
            }
        }

        double mediaNotas = totalNotas / totalAlunos;

        System.out.println("Maior acerto: " + maiorAcerto);
        System.out.println("Menor acerto: " + menorAcerto);
        System.out.println("Total de alunos que utilizaram o sistema: " + totalAlunos);
        System.out.println("Média das notas da turma: " + mediaNotas);

        scanner.close();
    }
}
