import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {

        double number1,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma medida em milímetro :");
        number1 = in.nextDouble();
        result = number1 * 0.0394;
        System.out.println("A medida em polegadas é: " + result);
    }
}