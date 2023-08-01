// Faça um programa que faça 5 perguntas para uma pessoa sobre um crime.
// As perguntas são:
// - "Telefonou para a vítima?"
// - "Esteve no local do crime?"
// - "Mora perto da vítima?"
// - "Devia para a vítima?"
// - "Já trabalhou com a vítima?"

// O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
// Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
// Caso contrário, ele será classificado como "Inocente".
package EstruturaDeDecisao;
import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Responda SIM ou NÃO para as perguntas a seguir:");

        int pontos = 0;

        System.out.print("Telefonou para a vítima? ");
        String resposta1 = scanner.next().toUpperCase();
        if (resposta1.equals("SIM")) {
            pontos++;
        }

        System.out.print("Esteve no local do crime? ");
        String resposta2 = scanner.next().toUpperCase();
        if (resposta2.equals("SIM")) {
            pontos++;
        }

        System.out.print("Mora perto da vítima? ");
        String resposta3 = scanner.next().toUpperCase();
        if (resposta3.equals("SIM")) {
            pontos++;
        }

        System.out.print("Devia para a vítima? ");
        String resposta4 = scanner.next().toUpperCase();
        if (resposta4.equals("SIM")) {
            pontos++;
        }

        System.out.print("Já trabalhou com a vítima? ");
        String resposta5 = scanner.next().toUpperCase();
        if (resposta5.equals("SIM")) {
            pontos++;
        }

        String classificacao = "";
        if (pontos == 2) {
            classificacao = "Suspeita";
        } else if (pontos >= 3 && pontos <= 4) {
            classificacao = "Cúmplice";
        } else if (pontos == 5) {
            classificacao = "Assassino";
        } else {
            classificacao = "Inocente";
        }

        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}
