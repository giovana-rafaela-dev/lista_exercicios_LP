import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float base;
        float altura;
        float area;

        System.out.println("Digite o valor da base do triângulo:");
        Scanner in = new Scanner(System.in);
        base = in.nextFloat();
        System.out.println("Digite o valor da altura do triângulo:");
        altura = in.nextFloat();
        area = (base*altura)/2;

        System.out.println("A área do triângulo é: "+area);
    }
}