import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float v1;
        float ac;
        float tempo;
        float velocidade;

        System.out.println("Digite a Velocidade Inicial:");
        Scanner in = new Scanner(System.in);
        v1 = in.nextFloat();
        System.out.println("Digite a Aceleração:");
        ac = in.nextFloat();
        System.out.println("Digite o Tempo de percurso:");
        tempo = in.nextFloat();
        velocidade = v1+ac*tempo;

        System.out.println("A velocidade é:" +velocidade);
    }
}