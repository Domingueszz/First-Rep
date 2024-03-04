import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {

        int number1;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro de 5 a 9:");
        number1 = in.nextInt();

        if (number1 > 9)
        System.out.println("Inválido");
        else if (number1 < 5)
        System.out.println("Inválido");
        else
        System.out.println("Número escolhido: "+number1);

        //ou if(number1 > 9 || number1 < 5)
        //   System.out.println("Inválido");
        //   else
        //   System.out.println("Número escolhido: "+number1);

    }
}