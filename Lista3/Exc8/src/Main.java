import java.util.Scanner;


    public class Main {
    public static void main(String[] args) {

        int numero;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número para verificar se é primo ou não:");
        numero = in.nextInt();
        boolean primo = true;

        if (numero <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }

            }
        }

        if (primo)
            System.out.println( "É um número primo." );
        else
            System.out.println( "Não é um número primo." );

        }
    }