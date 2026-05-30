import java.util.Scanner;

public class ex1 {

    public static void imprimirPadrao(int n) {

        for (int linha = 1; linha <= n; linha++) {

            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.print(linha + " ");
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

