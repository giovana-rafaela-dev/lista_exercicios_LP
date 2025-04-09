import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float pole;

        System.out.println("Digite a medida em polegadas:");
        Scanner in = new Scanner(System.in);
        pole = in.nextFloat();

        System.out.println("Sua medida em milímetros é:" +(pole*25.4));
    }
}