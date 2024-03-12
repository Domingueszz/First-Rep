import java.util.Scanner;


    public class Main {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int sequencia;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite quantos elementos haverá na sequência:");
        sequencia = in.nextInt();

        System.out.println("Sequência de Fibonacci com " + sequencia + " elementos:");
        for (int i = 0; i < sequencia; i++) {
            System.out.println(a);
            int soma = a + b;
            a = b;
            b = soma;

        }
    }
}