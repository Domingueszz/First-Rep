import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double nota1,nota2,media1;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        nota1= in.nextDouble();

        System.out.println("Digite a segunda nota:");
        nota2 = in.nextDouble();
        media1 = (nota1 + nota2) / 2;

        if (media1>=8.5)
            System.out.println("A");
        else if (media1>=7)
            System.out.println("B");
        else if (media1>=5)
            System.out.println("C");
        else
            System.out.println("D");
    }
}