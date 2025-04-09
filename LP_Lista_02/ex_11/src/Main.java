import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float celsius;
        float formula;

        System.out.println("Digite a temperatura em ºC:");
        Scanner in = new Scanner(System.in);
        celsius = in.nextFloat();
        formula =(celsius*9.0f/5.0f)+32;

        System.out.println("Sua temperatura em F é: "+ formula);
    }
}