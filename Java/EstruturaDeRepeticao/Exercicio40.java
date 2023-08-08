// Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes de trânsito.
// Foram obtidos os seguintes dados:

// a) Código da cidade;
// b) Número de veículos de passeio (em 1999);
// c) Número de acidentes de trânsito com vítimas (em 1999). Deseja-se saber:
// d) Qual o maior e menor índice de acidentes de transito e a que cidade pertence;
// e) Qual a média de veículos nas cinco cidades juntas;
// f) Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoCidade, veiculosPasseio, acidentesTransito;
        int maiorIndiceAcidentes = 0, menorIndiceAcidentes = Integer.MAX_VALUE;
        String cidadeMaiorIndice = "", cidadeMenorIndice = "";
        int totalVeiculos = 0, totalAcidentesMenos2kVeiculos = 0;
        int cidadesMenos2000Veiculos = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o código da cidade " + i + ": ");
            codigoCidade = scanner.nextInt();
            System.out.print("Digite o número de veículos de passeio na cidade: ");
            veiculosPasseio = scanner.nextInt();
            System.out.print("Digite o número de acidentes de trânsito com vítimas na cidade: ");
            acidentesTransito = scanner.nextInt();

            totalVeiculos += veiculosPasseio;

            if (veiculosPasseio < 2000) {
                totalAcidentesMenos2kVeiculos += acidentesTransito;
                cidadesMenos2000Veiculos++;
            }

            double indiceAcidentes = (double) acidentesTransito / veiculosPasseio;

            if (indiceAcidentes > maiorIndiceAcidentes) {
                maiorIndiceAcidentes = (int) Math.round(indiceAcidentes * 100);
                cidadeMaiorIndice = "Cidade " + codigoCidade;
            }

            if (indiceAcidentes < menorIndiceAcidentes) {
                menorIndiceAcidentes = (int) Math.round(indiceAcidentes * 100);
                cidadeMenorIndice = "Cidade " + codigoCidade;
            }
        }

        double mediaVeiculos = (double) totalVeiculos / 5;
        double mediaAcidentesMenos2kVeiculos = (double) totalAcidentesMenos2kVeiculos / cidadesMenos2000Veiculos;

        System.out.println("Maior índice de acidentes de trânsito: " + maiorIndiceAcidentes / 100.0 + " em " + cidadeMaiorIndice);
        System.out.println("Menor índice de acidentes de trânsito: " + menorIndiceAcidentes / 100.0 + " em " + cidadeMenorIndice);
        System.out.println("Média de veículos nas cidades: " + mediaVeiculos);
        System.out.println("Média de acidentes de trânsito nas cidades com menos de 2000 veículos de passeio: " + mediaAcidentesMenos2kVeiculos);

        scanner.close();
    }
}
