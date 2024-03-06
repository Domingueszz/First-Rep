import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {

        int number;
        int fatorial = 1;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número:");
        number = in.nextInt();

        for (int i = ; i <= number; i++) {
            fatorial *= i;

        }
        System.out.println("O fatorial do número digitado é: "+fatorial);
    }
}
