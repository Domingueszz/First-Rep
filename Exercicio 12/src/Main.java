import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
    public static void main(String[] args) {

        double number1,number2,result1,result2;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número real:");
        number1 = in.nextDouble();

        System.out.println("Digite outro número real:");
        number2 = in.nextDouble();
        result1 = number1 * 2;
        result2 = (result1 + number2) / 3;
        System.out.println("A média dos números digitados é: " + result2);
    }
}
