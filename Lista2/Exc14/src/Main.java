import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {

        int option;
        double valor;
        double descontoD, descontoP;
        double parcela, juros1, juros2;


        Scanner in = new Scanner(System.in);
        System.out.println("Insira o valor da compra:");;
        valor = in.nextDouble();

        System.out.println("1-Débito\n2-PIX\n3-Crédito\n\nEscolha a forma de pagamento:");
        option = in.nextInt();

        switch (option) {
            case 1:
                System.out.println("Débito selecionado");

                descontoD = valor - (valor * 0.05);

                System.out.println("Valor final da compra: "+descontoD);
                break;

            case 2:
                System.out.println("PIX selecionado");

                descontoP = valor - (valor * 0.10);

                System.out.println("Valor final da compra: "+descontoP);
                break;

            case 3:
                System.out.println("Crédito selecionado");
                System.out.println("Escolha o número de parcelas para efetuar sua compra:");
                parcela = in.nextDouble();

                juros1 = valor + (valor * 0.02 * parcela);
                juros2 = valor + (valor * 0.05 * parcela);

                if (parcela == 0)
                    System.out.println("Valor final da compra: "+valor);
                else if (parcela <= 4)
                    System.out.println("Valor final da compra: "+juros1);
                else
                    System.out.println("Valor final da compra: "+juros2);
                break;

            default:
                System.out.println("Opção inválido");}
    }
}