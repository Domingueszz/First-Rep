import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {

                double number1,number2,x,result;
                Scanner in = new Scanner(System.in);
                System.out.println("Sendo ax + b = 0, digite o coeficiente 'a':");
                number1 = in.nextDouble();

                System.out.println("Agora digite o coeficiente 'b':");
                number2 = in.nextDouble();
                x= -number2/ number1;

                result= x;
                System.out.println("O valor de 'x' é: " + result);
    }
}