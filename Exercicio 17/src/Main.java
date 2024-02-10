import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {

        double number1,number2,number3,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a velocidade inicial do percurso:");
        number1 = in.nextDouble();

        System.out.println("Digite a aceleração do percurso:");
        number2 = in.nextDouble();

        System.out.println("Digite o tempo do percurso:");
        number3 = in.nextDouble();

        result = number1 + (number2 * number3) ;
        System.out.println("A velocidde é: " + result);
    }
}