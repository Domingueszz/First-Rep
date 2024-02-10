import java.util.Scanner;


    public class Main {
    public static void main(String[] args) {

        double number1,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o raio da circunferência:");
        number1 = in.nextDouble();
        result = 3.14159265359 * (number1 * number1) ;
        System.out.println("A área da circunferência é: " + result);
    }
}