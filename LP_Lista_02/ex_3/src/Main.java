import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        number= in.nextInt();

        System.out.println("A quinta parte do seu número é: "+(number/5));



    }
}