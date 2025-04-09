import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, result;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        num = in.nextInt();
        if (num %2 == 0) {
            System.out.println("Seu número é par!");
        }else if (num<0) {
            System.out.println("Insira um número INTEIRO!");
        }else {
            System.out.println("Seu número é ímpar!");
        }
    }
}
