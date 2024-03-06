import java.util.Scanner;


    public class Main {
    public static void main(String[] args) {
        int number1;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número para saber a tabuada do próprio:");
        number1 = in.nextInt();
        for (int i = 0; i <= number1*10; i+=number1) {
            System.out.println(i);
        }
    }
}