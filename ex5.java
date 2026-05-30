import java.util.Scanner;

public class ex5 {
    public static double somaImposto(double taxaImposto, double custo) {

        double imposto = custo * (taxaImposto / 100);
        custo = custo + imposto;

        return custo;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo do produto: ");
        double custo = scanner.nextDouble();

        System.out.print("Digite a taxa de imposto (%): ");
        double taxaImposto = scanner.nextDouble();

        double valorFinal = somaImposto(taxaImposto, custo);

        System.out.println("Valor com imposto: R$ " + valorFinal);

        scanner.close();
    }
}
