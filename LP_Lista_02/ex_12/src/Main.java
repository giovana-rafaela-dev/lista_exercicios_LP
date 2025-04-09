import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float n1;
        float n2;
        float media;

        System.out.println("Digite a nota com peso 1:");
        Scanner in = new Scanner(System.in);
        n1 = in.nextFloat();
        System.out.println("Digite a nota com peso 2:");
        n2 = in.nextFloat();
        media =(n1+(n2*2))/3;

        System.out.println("Sua média é:" +media);
    }
}