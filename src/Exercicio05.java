import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador, termo;
        int x1 = 1, x2 = 1, x3;

        System.out.printf("Termo: ");
        termo = sc.nextInt();

        if (termo == 1){
            System.out.print(x1);
        } else if (termo == 2){
            System.out.print(x1 + " " + x2);
        } else if (termo >= 3){

            System.out.print(x1 + " " + x2);
            contador = 3;
            while (contador <= termo){
                x3 = x1 + x2;
                System.out.print(" " + x3);
                x1 = x2;
                x2 = x3;
                contador++;

            }
        }
    }
}
