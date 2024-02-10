import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
    public static void main(String[] args) {

        double number1,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma distância em milhas:");
        number1 = in.nextDouble();
        result = (number1 /  0.62131) ;
        System.out.println("A distância em Km/h é: " + result);
    }
}