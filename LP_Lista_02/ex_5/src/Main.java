import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float km;

        Scanner in = new Scanner(System.in);
        System.out.println("Insira sua velocidade em Km/h");
        km = in.nextFloat();

        System.out.println("A velocidade é:" + (km/3.6));
    }
}