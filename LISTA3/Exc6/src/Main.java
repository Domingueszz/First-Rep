import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
    public static void main(String[] args) {

        int n1;
        int n2;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número:");
        n1 = in.nextInt();

        System.out.println("Digite outro número:");
        n2 = in.nextInt();

        if (n1>n2) {
            int aux = n1;
            n1 = n2;
            n2 = aux;
        }
        for (int i = n1+1 ; i < n2; i++) {
            System.out.println(i);
        }
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }
    }
}