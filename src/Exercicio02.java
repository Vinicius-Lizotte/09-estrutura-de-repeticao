import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y = 0, contador = 1;

        while (contador <= 10){
            System.out.printf("Digite o Valor " + contador + ":  ");
            x = sc.nextInt();

            if (x > y) {
                y = x;
            }

            contador++;
        }

        System.out.println("Maior valor é " + y);

    }
}
