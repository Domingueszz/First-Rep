import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {

        double number1, number2, number3;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        number1 = in.nextInt();

        System.out.println("Digite o segundo número:");
        number2 = in.nextInt();

        System.out.println("Digite o terceiro número:");
        number3 = in.nextInt();

        if (number1 < number2 && number2 < number3 && number1 < number3)
            System.out.println("Os números em ordem crescente são dados:" + number1  + number2  + number3);

        else if (number1 > number2 && number2 > number3 && number1 > number3)
            System.out.println("Os números em ordem crescente são dados:" + number3  + number2  + number1);

        else if (number1 > number2 && number2 < number3 && number1 < number3)
            System.out.println("Os números em ordem crescente são dados:" + number2  + number1  + number3);

        else if (number1 > number2 && number2 < number3 && number1 > number3)
            System.out.println("Os números em ordem crescente são dados:" + number2  + number3  + number1);

        else if (number1 < number2 && number2 > number3 && number1 < number3)
            System.out.println("Os números em ordem crescente são dados:" + number1  + number3  + number2);

        else
            System.out.println("Os números em ordem crescente são dados:" + number3  + number1  + number2);
    }
}