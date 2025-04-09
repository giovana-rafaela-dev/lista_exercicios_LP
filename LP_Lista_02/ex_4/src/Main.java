import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float n1;
        float n2;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite dois números");
        n1 = in.nextFloat();
        n2 = in.nextFloat();

        System.out.println("A soma desses números é: " +(n1+n2));
    }
}