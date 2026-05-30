import java.util.Scanner;

public class ex6 {
    public static int converterHora(int hora24, char[] periodo) {

        if (hora24 == 0) {
            periodo[0] = 'A';
            return 12;
        } else if (hora24 < 12) {
            periodo[0] = 'A';
            return hora24;
        } else if (hora24 == 12) {
            periodo[0] = 'P';
            return 12;
        } else {
            periodo[0] = 'P';
            return hora24 - 12;
        }
    }

    public static void mostrarHora(int hora12, int minuto, char periodo) {
        System.out.println(hora12 + ":" + minuto + " " + periodo + ".M.");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {

            System.out.print("Digite a hora (0 a 23): ");
            int hora = scanner.nextInt();

            System.out.print("Digite os minutos: ");
            int minuto = scanner.nextInt();

            char[] periodo = new char[1];

            int horaConvertida = converterHora(hora, periodo);

            mostrarHora(horaConvertida, minuto, periodo[0]);

            System.out.print("Deseja converter outro horário? (s/n): ");
            resposta = scanner.next();

        } while (resposta.equalsIgnoreCase("s"));

        scanner.close();
    }
}