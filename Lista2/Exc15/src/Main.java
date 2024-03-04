import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
    public static void main(String[] args) {

        int option;
        double valor;
        double troco1, troco2, troco3, troco4;


        Scanner in = new Scanner(System.in);
        System.out.println("Insira a quantia em dinheiro R$:");;
        valor = in.nextDouble();

        System.out.println("1-Café Expresso R$0,50\n2-Café Longo R$1,00\n3-Capuccino R$2,50\n4-Chocolate R$2,00\n\nEscolha alguma das opções:");
        option = in.nextInt();

        switch (option) {
            case 1:
                troco1 = valor - 0.50;

                if (valor == 0.50)
                    System.out.println("Café Expresso selecionado");
                else if (valor>0.50)
                    System.out.println("Seu troco R$: "+troco1);
                else
                    System.out.println("Dinheiro insuficiente");
                break;

            case 2:
                troco2 = valor - 1;

                if (valor == 1)
                    System.out.println("Café LOngo selecionado");
                else if (valor > 1)
                    System.out.println("Seu troco R$: "+troco2);
                else
                    System.out.println("Dinheiro insuficiente");
                break;

            case 3:
                troco3 = valor - 2.50;

                if (valor == 2.50)
                    System.out.println("Capuccino selecionado");
                else if (valor > 2.50)
                    System.out.println("Seu troco R$: "+troco3);
                else
                    System.out.println("Dinheiro insuficiente");
                break;

            case 4:
                troco4 = valor - 2;

                if (valor == 2)
                    System.out.println("Chocolate selecionado");
                else if (valor > 2)
                    System.out.println("Seu troco R$: "+troco4);
                else
                    System.out.println("Dinheiro insuficiente");
                break;

            default:
                System.out.println("Inválido");}
    }
}