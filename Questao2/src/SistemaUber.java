import java.util.Scanner;

public class SistemaUber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância percorrida (em km):");
        double distancia = scanner.nextDouble();

        System.out.println("Digite o tempo de espera (em minutos):");
        int tempoEspera = scanner.nextInt();

        System.out.println("Digite a tarifa base da corrida:");
        double tarifaBase = scanner.nextDouble();

        System.out.println("Digite o fator de demanda (alta demanda aumenta o valor):");
        double fatorDemanda = scanner.nextDouble();

        Corrida corrida = new Corrida(distancia, tempoEspera, tarifaBase, fatorDemanda);

        corrida.exibirDetalhesCorrida();

        scanner.close();
    }
}
