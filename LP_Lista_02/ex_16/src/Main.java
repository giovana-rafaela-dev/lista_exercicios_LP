import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float raio;
        float altura;
        float volume;

        System.out.println("Digite o raio do cone:");
        Scanner in = new Scanner(System.in);
        raio = in.nextFloat();
        System.out.println("Digite a altura do cone:");
        altura = in.nextFloat();
        volume= (3.14f*(raio*raio)*altura)/3;

        System.out.println("O volume do cone é:"+volume);
    }
}