import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {

        int number;
        int maior, menor;
        Scanner in = new Scanner(System.in);

        maior = Integer.MIN_VALUE;
        menor = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {

            System.out.println("Digite um número:");
            number = in.nextInt();


            if (number > maior) { // se o número digitado for maior que o valor máximo...
                maior = number;   // o número é o maior valor
            }

            if (number < menor) { // se o número digitado for menor que o valor mínimo...
                menor = number; // o número digitado é menor valor
            }
        }
                System.out.println("O maior número digitado é: " + maior);
                System.out.println("O menor número digitado é: " + menor);

            }
        }

