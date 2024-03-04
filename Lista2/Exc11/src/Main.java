import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
    public static void main(String[] args) {

        int option;
        Scanner in = new Scanner(System.in);

        System.out.println("\n1-Domingo\n2-Segunda-Feira\n3-Terça-Feia\n4-Quarta-Feira\n5-Quinta-Feira\n6-Sexta-Feira\n7-Sábado\nEscolha algum dia da semana: ");
        option = in.nextInt();

        switch (option) {
            case 1:
                System.out.println("Voce escolheu Domingo");
                break;
            case 2:
                System.out.println("Voce escolheu Segunda-Feira");
                break;
            case 3:
                System.out.println("Você escolheu Terça-Feia ");
                break;
            case 4:
                System.out.println("Você escolheu Quarta-Feira");
                break;
            case 5:
                System.out.println("Você escolheu Quinta-Feira");
                break;
            case 6:
                System.out.println("Você escolheu Sexta-Feira");
                break;
            case 7:
                System.out.println("Você escolheu Sábado");
                break;
            default:
                System.out.println("inválido!");
                break;
        }

    }
}