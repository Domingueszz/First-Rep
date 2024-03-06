//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int sequencia = 18;

        System.out.println("Sequência de Fibonacci com " + sequencia + " elementos:");
        for (int i = 0; i < sequencia; i++) {
            System.out.println(a + " ");
            int sum = a + b;
            a = b;
            b = sum;

            }
        }
    }
