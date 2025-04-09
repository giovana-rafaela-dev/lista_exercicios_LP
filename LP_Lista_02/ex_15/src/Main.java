import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float raio;
        float altura;
        float volume;

        System.out.println("Digite o raio do cilindro:");
        Scanner in = new Scanner(System.in);
        raio = in.nextFloat();
        System.out.println("Digite a altura do cilindro:");
        altura = in.nextFloat();
        volume = 3.14f*(raio*raio)*altura;

        System.out.println("O volume do cilindro é:"+volume);
    }
}