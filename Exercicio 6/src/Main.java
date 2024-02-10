import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {

        double number1,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma velocidade em m/s :");
        number1 = in.nextDouble();
        result = (number1) * 3.6;
        System.out.println("O m/s em Km/h é: " + result);
    }
}