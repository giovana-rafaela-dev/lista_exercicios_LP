import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float raio;
        float area;

        System.out.println("Digite o raio da sua circunferência: ");
        Scanner in = new Scanner(System.in);
        raio = in.nextFloat();
        area = 3.14f*(raio*raio);
        System.out.println("A área da sua circunferência é:" +area);

    }
}