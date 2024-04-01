//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
    public static void main(String[] args) {

        int[][] matriz = {{1, 2, 1},
                          {3, 2, 2},
                          {1, 1, 3}};

        int resultado = determinante(matriz);
        System.out.println("Determinante = "+ resultado);

        }
    static int determinante(int [][]m){
        int cont_pos,mult_pos,soma_pos=0;
        int cont_neg,mult_neg, soma_neg=0;

        for(int i=0;i<m.length;i++){
            cont_pos=i;
            cont_neg=i;
            mult_pos=1;
            mult_neg=1;

        for(int j=0;j<m[0].length;j++){
            mult_pos*=m[j][cont_pos];
            mult_neg*=m[j][cont_neg];
            cont_pos++;
            cont_neg--;

                if(cont_pos>m.length-1)
                    cont_pos=0;

                if(cont_neg<0)
                    cont_neg=m.length-1;
            }
                soma_pos += mult_pos;
                soma_neg += mult_neg;
            }
        return soma_pos - soma_neg;
        }
    }
