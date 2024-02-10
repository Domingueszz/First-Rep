import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {

        double number1,number2,result;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número real:");
        number1 = in.nextDouble();

        System.out.println("Digite outro número real:");
        number2 = in.nextDouble();
        result = (number1 + number2) / 2;
        System.out.println("A média dos números digitados é: " + result);
    }
}