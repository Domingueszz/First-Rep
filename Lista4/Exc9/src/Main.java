
    public class Main {
        public static void main(String[] args) {

            int[][] matriz = {{3, 1, 3},
                              {2, 4, 1},
                              {1, 2, 2}};

            diag_principal(matriz);
        }

        static void diag_principal(int[][] m) {
            if (m.length == m[0].length) {
                for (int i = 0; i < m.length; i++) { //decrescente
                        System.out.print(m[i][m[0].length-1-i] + ", ");
                                                              /* 2 - i(2-0) = 2
                                                                 2 - i(2-1) = 1
                                                                 2 - i(2-2) = 0
                                                                         */
                     }
                }else{
                    System.out.println("A matriz não é quadrada!");
                }
            }
        }
