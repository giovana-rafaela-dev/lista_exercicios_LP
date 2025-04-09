import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float km;

        System.out.println("Digite a distância em Km:");
        Scanner in = new Scanner(System.in);
        km = in.nextFloat();

        System.out.println("Sua distância em milhas é:" +(km/1.609));
    }
}