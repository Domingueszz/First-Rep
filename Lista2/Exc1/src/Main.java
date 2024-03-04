import java.util.Scanner;


    public class Main {
    public static void main(String[] args) {

        double number,result;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número real:");
        number = in.nextInt();
        if (number >= 0)
        System.out.println(Math.sqrt(number));
        else
        System.out.println("Valor inválido!");
    }
}