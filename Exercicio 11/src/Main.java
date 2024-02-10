import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number1,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma temperatura em graus Celsius(Cº):");
        number1 = in.nextDouble();
        result = (number1 * 9/5) + 32 ;
        System.out.println("A temperatura em Fahrenheit é: " + result);
    }
}