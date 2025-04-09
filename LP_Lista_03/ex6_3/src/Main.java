import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opt, result;

        Scanner in = new Scanner(System.in);
        System.out.println("---------------"+
                            "\n MENU"+
                            "\n---------------"+
                            "\n 5"+
                            "\n 6"+
                            "\n 7"+
                            "\n 8"+
                            "\n 9"+
                            "\n---------------");
        System.out.println("Escolha uma opção:"+
                "\n---------------");
        opt = in.nextInt();
        if (opt>=5 && opt<=9) {
            System.out.println("Você escolheu o número" +opt);
        }else {
            System.out.println("Insira um número entre 5 e 9!!");
        }
    }
}

