import java.util.Scanner;

public class ex2 {

    public static void imprimirPadrao(int n) {

        for (int linha = 1; linha <= n; linha++) {

            for (int numero = 1; numero <= linha; numero++) {
                System.out.print(numero + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor para n: ");
        int n = scanner.nextInt();

        imprimirPadrao(n);

        scanner.close();
    }
}
