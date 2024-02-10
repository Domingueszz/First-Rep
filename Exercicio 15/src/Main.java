import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {

        double number1,number2,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o raio do cilindro:");
        number1 = in.nextDouble();

        System.out.println("Digite a altura do cilindro:");
        number2 = in.nextDouble();
        result =  3.14159265359 * (number1 * number1) * number2;
        System.out.println("O volume do cilindro é: " + result);
    }
}