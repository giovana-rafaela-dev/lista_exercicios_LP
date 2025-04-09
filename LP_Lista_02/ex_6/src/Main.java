import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float ms;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite sua velocidade em m/s");
        ms = in.nextFloat();

        System.out.println("Sua velocidade em Km/h é:" +(ms*3.6));
    }
}