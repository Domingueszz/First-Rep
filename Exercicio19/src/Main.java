import java.util.Scanner;


    public class Main {
    public static void main(String[] args) {

        double number1,number2,number3,x1,x2,x3,x4,x5,x6,result1,result2;
        Scanner in = new Scanner(System.in);

        System.out.println("Sendo ax² + bx + c = 0, digite o coeficiente 'a':");
        number1 = in.nextDouble();

        System.out.println("Agora digite o coeficiente 'b':");
        number2 = in.nextDouble();

        System.out.println("Agora digite o coeficiente 'c':");
        number3 = in.nextDouble();

        x1= (Math.pow(number2, 2)) -4 * number1 * number3;
        x2= Math.sqrt(x1);
        x3= -number2 + x2;
        x4= x3 / (2 * number1);
        if (x4 < 0 == Boolean.parseBoolean(null));

        x5= -number2 - x2;
        x6= x5 / (2 * number1);
        if (x6 < 0 == Boolean.parseBoolean(null));

        result1= x4;
        result2= x6;
        System.out.println("O valor de 'x' para solução é: " +  result1);


        System.out.println("                            e: " +  result2);
    }
}