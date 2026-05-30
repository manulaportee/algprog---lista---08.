import java.util.Scanner;

public class ex3 {

    public static int somar(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        int resultado = somar(num1, num2, num3);

        System.out.println("A soma dos três números é: " + resultado);

        scanner.close();
    }
}
