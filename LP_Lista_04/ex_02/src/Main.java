import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maior, menor, n1;
        maior = 0;
        menor = 0;
        n1 = 0;
        Scanner in = new Scanner(System.in);

        for (int i = 0; i<5; i++){
            System.out.println("Digite um número: ");
            n1 = in.nextInt();
            if(i==1){
                maior = n1;
                menor = n1;
            } else if (n1 > maior) {
                maior = n1;
            } else if (n1 < menor) {
                menor = n1;
            }
        }
        System.out.println("O maior número digitado foi " + maior + " e o menor foi " + menor);
    }
}