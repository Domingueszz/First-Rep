import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {

        double number1,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma quilolmetragem:");
        number1 = in.nextDouble();
        result = (number1 * 1000) / 3.6;
        System.out.println("O Km/h em m/s é: " + result);
    }
}