import java.util.Scanner;


    public class Main {
    public static void main(String[] args) {

        int n1;
        int n2;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número:");
        n1 = in.nextInt();

        System.out.println("Digite outro número:");
        n2 = in.nextInt();

        for (int i = n1+1 ; i < n2; i++) {
            System.out.println(i);
        }
    }
}