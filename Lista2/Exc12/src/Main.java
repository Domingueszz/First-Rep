import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {

        double number1,number2 = 0,result1,result2,result3,result4;
        int option;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número:");
        number1 = in.nextDouble();

        System.out.println("Digite outro número:");
        number2 = in.nextDouble();

        result1 = number1 + number2;
        result2 = number1 - number2;
        result3 = number1 * number2;
        result4 = number1 / number2;


        System.out.println("1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\nEscolha uma opção:");
        option = in.nextInt();

        switch (option) {
            case 1:
                System.out.println("Resultado:" + result1);
                break;
            case 2:
                System.out.println("Resultado:" + result2);
                break;
            case 3:
                System.out.println("Resultado:" + result3);
                break;
            case 4:
                System.out.println("Resultado:" + result4);
                break;
            default:
                System.out.println("Inválido");}

    }
}