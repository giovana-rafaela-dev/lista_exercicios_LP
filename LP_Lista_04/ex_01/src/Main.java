import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor:");
        number = in.nextInt();

        for(int i=0;i<=10; i+=2){
            System.out.println(number + "x" + i + "="+(i*number));
        }
    }
}