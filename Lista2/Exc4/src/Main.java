import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
        public class Main {
        public static void main(String[] args) {

            double n1,n2,n3,media1,media2;

            Scanner in = new Scanner(System.in);
            System.out.println("Digite a primeira nota:");
            n1 = in.nextDouble();

            System.out.println("Digite a segunda nota:");
            n2 = in.nextDouble();
            media1 = (n1 + n2) / 2;
            if (media1>50)
                System.out.println("APROVADO");
            else
                System.out.println("Digite a nota da prova de recuperação");
            n3 = in.nextDouble();

            media2 = (n3 + media1) / 2;

            if (media2>50)
                System.out.println("APROVADO");
            else
                System.out.println("REPROVADO");
    }
}