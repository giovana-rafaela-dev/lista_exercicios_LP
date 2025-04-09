import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float milhas;

        System.out.println("Digite a distância em milhas:");
        Scanner in = new Scanner(System.in);
        milhas = in.nextFloat();

        System.out.println("Sua distância em Km é:" +(milhas*1.609));
    }
}