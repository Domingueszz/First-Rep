import java.util.Scanner;


    public class Main {
    public static void main(String[] args) {

        for (int i = -80; i <= 80; i+=10) {
            int f = (i*9/5)+32;
            System.out.println(i+"ºC = "+f+"ºF");
        }
    }
}