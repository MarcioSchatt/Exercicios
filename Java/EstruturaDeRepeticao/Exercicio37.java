// Uma academia deseja fazer um senso entre seus clientes para descobrir o mais alto, o mais baixo, a mais gordo e o mais magro, para isto você deve fazer um programa que pergunte a cada um dos clientes da academia seu código, sua altura e seu peso.
// O final da digitação de dados deve ser dada quando o usuário digitar 0 (zero) no campo código.
// Ao encerrar o programa também deve ser informados os códigos e valores do cliente mais alto, do mais baixo, do mais gordo e do mais magro, além da média das alturas e dos pesos dos clientes.
package EstruturaDeRepeticao;
import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo, codigoMaisAlto = 0, codigoMaisBaixo = 0, codigoMaisGordo = 0, codigoMaisMagro = 0;
        double altura, peso, alturaTotal = 0, pesoTotal = 0;
        double alturaMaisAlto = 0, alturaMaisBaixo = Double.MAX_VALUE;
        double pesoMaisGordo = 0, pesoMaisMagro = Double.MAX_VALUE;
        int totalClientes = 0;

        while (true) {
            System.out.print("Digite o código do cliente (ou 0 para encerrar): ");
            codigo = scanner.nextInt();
            if (codigo == 0) {
                break;
            }

            System.out.print("Digite a altura do cliente (em metros): ");
            altura = scanner.nextDouble();
            System.out.print("Digite o peso do cliente (em quilogramas): ");
            peso = scanner.nextDouble();

            if (altura > alturaMaisAlto) {
                alturaMaisAlto = altura;
                codigoMaisAlto = codigo;
            }

            if (altura < alturaMaisBaixo) {
                alturaMaisBaixo = altura;
                codigoMaisBaixo = codigo;
            }

            if (peso > pesoMaisGordo) {
                pesoMaisGordo = peso;
                codigoMaisGordo = codigo;
            }

            if (peso < pesoMaisMagro) {
                pesoMaisMagro = peso;
                codigoMaisMagro = codigo;
            }

            alturaTotal += altura;
            pesoTotal += peso;
            totalClientes++;
        }

        double mediaAlturas = alturaTotal / totalClientes;
        double mediaPesos = pesoTotal / totalClientes;

        System.out.println("Cliente mais alto: Código " + codigoMaisAlto + ", Altura " + alturaMaisAlto + "m");
        System.out.println("Cliente mais baixo: Código " + codigoMaisBaixo + ", Altura " + alturaMaisBaixo + "m");
        System.out.println("Cliente mais gordo: Código " + codigoMaisGordo + ", Peso " + pesoMaisGordo + "kg");
        System.out.println("Cliente mais magro: Código " + codigoMaisMagro + ", Peso " + pesoMaisMagro + "kg");
        System.out.println("Média das alturas: " + mediaAlturas + "m");
        System.out.println("Média dos pesos: " + mediaPesos + "kg");

        scanner.close();
    }
}
