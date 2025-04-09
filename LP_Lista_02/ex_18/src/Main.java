import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float a;
        float b;
        float result;

        System.out.println("Digite o Coeficiente A:");
        Scanner in = new Scanner(System.in);
        a = in.nextFloat();
        System.out.println("Digite o Coeficiente B:");
        b = in.nextFloat();
        result = -b/a;

        System.out.println("O Resultado da Equação é: "+ result);
    }
}