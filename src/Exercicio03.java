import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, contador_mult = 0, processamento = 0, total, resp;

        while (processamento == 0) {
            if (contador_mult == 0) {
                System.out.printf("Digite o número: ");
                n1 = sc.nextInt();
                System.out.println("------------------------------------");

                while (contador_mult <= 10) {
                    total = n1 * contador_mult;
                    System.out.println(n1 + " * " + contador_mult + " = " + total);
                    contador_mult++;
                }
            }
            System.out.println("------------------------------------");
            System.out.println("Deseja imprimir mais?");

            System.out.println("1 --> Sim");
            System.out.println("2 --> Não");
            resp = sc.nextInt();

            if (resp == 2) {
                processamento++;
            } else if (resp == 1) {
                contador_mult = 0;
            }


        }
    }
}
