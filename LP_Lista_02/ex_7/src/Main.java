import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float mm;

        System.out.println("Digite a medida em milímetro");
        Scanner in = new Scanner(System.in);
        mm = in.nextFloat();

        System.out.println("Sua medida em polegadas é: "+(mm/25.4));
    }
}