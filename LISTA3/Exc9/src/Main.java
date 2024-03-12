import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
    public static void main(String[] args) {

        int resposta, op;
        resposta = 0;
        Scanner in = new Scanner(System.in);
        do{
            for(int i=1;i<=10;i++){
                int j;
                for(j=0;j<=10;j++){
                    System.out.println("Tabuada do "+i+"\n"+i+" x "+j+" = ");
                    resposta = in.nextInt();
                    if(resposta!=i*j){
                        System.out.println("GAME OVER - Você errou:");
                        break;
                    }
                }
                System.out.println(i + " " + j);
                if(resposta!=i*(j-1))
                    break;
                if(i==10 && j==10)
                    System.out.println("Parabéns você ganhou!");
            }
            System.out.println("Deseja jogar novamente?\n1.Sim\n2.Nao");
            op=in.nextInt();
        }while (op==1);
        System.out.println("Obrigado por jogar! ;)");
    }
}