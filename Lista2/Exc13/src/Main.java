import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {

        int option;
        double diametro,areaC,perimetroC;
        double baseT,alturaT,areaT,perimetroT;
        double baseR,alturaR,areaR,perimetroR;

        Scanner in = new Scanner(System.in);
        System.out.println("1-Círculo\n2-Triângulo Retângulo \n3-Retângulo\n\nEscolha uma opção:");
        option = in.nextInt();

        switch (option) {
            case 1:
                System.out.println("Informe o diâmetro da Circuferência:");
                diametro = in.nextDouble();

                areaC = Math.pow(diametro/2,2) * Math.PI;
                perimetroC = Math.pow(diametro/2,2) * 2 * Math.PI;

                System.out.println("A área da Circuferência é: " + areaC);
                System.out.println("O perímetro da Circuferência é: " + perimetroC);
                break;

            case 2:
                System.out.println("Informe a base do Triângulo Retângulo:");
                baseT = in.nextDouble();
                System.out.println("Informe a altura do Triângulo Retângulo:");
                alturaT = in.nextDouble();

                areaT = (baseT * alturaT) / 2;
                perimetroT = Math.sqrt ((baseT * baseT) + (alturaT * alturaT));

                System.out.println("A área do Triângulo Retângulo é: " + areaT);
                System.out.println("O perímetro do Triângulo Retângulo é: " + perimetroT);
                break;

            case 3:
                System.out.println("Informe a base do Retângulo:");
                baseR = in.nextDouble();
                System.out.println("Informe a altura do Retângulo:");
                alturaR = in.nextDouble();

                areaR = baseR * alturaR;
                perimetroR = 2*(baseR + alturaR);

                System.out.println("A área do Retângulo é: " + areaR);
                System.out.println("O perímetro do Retângulo é: " + perimetroR);
                break;

            default:
                System.out.println("Inválido");}

    }
}