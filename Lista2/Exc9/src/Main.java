import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {

        double valor1, valor2, valor3;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeiro medida(a) :");
        valor1 = in.nextInt();

        System.out.println("Digite a segunda medida(b) :");
        valor2 = in.nextInt();

        System.out.println("Digite a terceira medida(c) :");
        valor3 = in.nextInt();

        if (valor1<valor2+valor3 && valor1>Math.abs(valor2-valor1)
            && valor1<valor1+valor3 && valor2>Math.abs(valor1-valor3)
            && valor1<valor1+valor2 && valor3>Math.abs(valor1-valor2)){

        if (valor1 == valor2 && valor2 == valor3)
            System.out.println("É um triângulo Equílatero ");

        else if ((valor1 == valor2 && valor2 != valor3) || (valor2 == valor3 && valor3 != valor1) || valor3 == valor1 && valor1 != valor2)
            System.out.println("É um triângulo Isósceles ");

        else
            System.out.println("É um triângulo Escaleno ");

        }else
            System.out.println("-- Valores inválidos -- Não formam um triângulo -- ");


        }
    }
