import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(somarNumber(Receber()));
    }


    //Funções aqui:
    static int Receber() {
        Scanner in = new Scanner(System.in);
        int n;
        do {
            System.out.println("Digite um numero maior que 0:");
            n = in.nextInt();
        } while (n <= 0);
        return n;
    }

    static int somarNumber(int n) {
        int soma = 0;
        for (int i = 0; i <= n; i++) {
            soma += i;
        }
        return soma;
    }
}


