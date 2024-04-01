
    public class Main {
    public static void main(String[] args) {

        int [][]matriz =   {{3,1,3},
                            {2,4,1},
                            {1,2,2}};

        diag_principal(matriz);
    }

    static void diag_principal(int [][]m){
        if(m.length == m[0].length){ //se numLinha é = numColunas
            for(int i=0; i<m.length; i++){
            System.out.print(m[i][i]+", "); //vai printar as linhas e colunas iguais
                                                              /* m[0][0]
                                                                 m[1][1]
                                                                 m[2][2]
                                                                         */
            }
        }else{
            System.out.println("A matriz não é quadrada!");
        }
      }
    }