import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {

        double number,result;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número real:");
        number = in.nextInt();
        result = number / 5;
        System.out.println("A quinta parte do número digitado é: " + result);
    }
}