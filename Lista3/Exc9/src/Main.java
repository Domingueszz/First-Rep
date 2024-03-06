import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {
            System.out.println("\nTabuada do: " + i);
            for (int j = 1; j <= 10; j++) {
                int resultado;
                Scanner in = new Scanner(System.in);
                System.out.println(i + " x " + j + " = ");
                resultado = in.nextInt();

                if (resultado == i * j)
                    System.out.println("PARABÉNS!");
                else {
                    System.out.println("GAME OVER!");
                    do {
                        if (resultado != i * j)
                            System.out.println("Tente Novamente");
                        System.out.println(i + " x " + j + " = ");
                        resultado = in.nextInt();
                        if (resultado == i * j)
                            System.out.println("PARABÉNS!");


                    } while (resultado != i*j);
                  }
                }
            }
        }
    }
