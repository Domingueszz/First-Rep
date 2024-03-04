import java.util.Scanner;


    public class Main {
    public static void main(String[] args) {

        double a,b,c, x1, x2, delta;
        Scanner in = new Scanner(System.in);

        System.out.println("Sendo ax² + bx + c = 0, digite o coeficiente 'a':");
        a = in.nextDouble();

        System.out.println("Agora digite o coeficiente 'b':");
        b = in.nextDouble();

        System.out.println("Agora digite o coeficiente 'c':");
        c = in.nextDouble();

        delta = Math.pow(b,2) - 4*a*c;

        if(delta<0){
            System.out.println("Equação sem raiz");
        }else {
            x1 = (b * -1 + Math.sqrt(delta)) / (2 * a);
            x2 = (b * -1 - Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 = " + x1 + " e x2 = " + x2);

        }
    }
}