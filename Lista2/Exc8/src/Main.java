import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {

        int number1;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro :");
        number1 = in.nextInt();

        if (number1 % 2 == 0)
        System.out.println("O algorismo digitado é um número par");
        else
        System.out.println("O algorismo digitado é um número ímpar");

    }
}