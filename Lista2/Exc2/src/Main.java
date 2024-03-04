import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {

    int number1,number2;
    Scanner in = new Scanner(System.in);

      System.out.println("Digite um número inteiro:");
      number1 = in.nextInt();

      System.out.println("Digite outro número inteiro:");
      number2 = in.nextInt();

      if (number1>number2)
      System.out.println("O primeio número digitado é maior que o segundo");
      if (number1<number2)
      System.out.println("O segundo número digitado é maior que o primeiro");
      if (number1 == number2)
      System.out.println("Os números digitados são iguais");
    }
}