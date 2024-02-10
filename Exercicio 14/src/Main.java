import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {

        double number1,number2,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a base do triângulo retângulo:");
        number1 = in.nextDouble();

        System.out.println("Digite a altura do triângulo retângulo:");
        number2 = in.nextDouble();
        result = (number1 * number2) / 2 ;
        System.out.println("A área do triângulo retângulo é: " + result);
    }
}