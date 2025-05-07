import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.printf("Digite 1º número: ");
        n1 = sc.nextInt();

        System.out.printf("Digite 2º número: ");
        n2 = sc.nextInt();

        if (n2 > n1){
            while (n1 <= n2){
                System.out.printf(n1 + " ");
                n1++;
            }
        }

    }
}
