import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1,n2,result;
        int opt;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite dois números separados por espaço:");
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        System.out.println("---------------"+
                            "\n MENU"+
                            "\n---------------"+
                            "\n1. Soma"+
                            "\n2. Subtração"+
                            "\n3. Multiplicação"+
                            "\n3. Divisão"+
                             "\n---------------");
        System.out.println("Escolha uma opção:"+
                "\n---------------");
        opt = in.nextInt();

        switch (opt) {
            case 1:
                result = n1 + n2;
                System.out.println(n1+"+"+n2+"="+ result);
                break;
            case 2:
                result = n1 - n2;
                System.out.println(n1 + "-"+n2+"="+ result);
                break;
            case 3:
                result = n1 * n2;
                System.out.println(n1 + "*"+n2+"="+ result);
                break;
            case 4:
                result = n1 / n2;
                System.out.println(n1 + "/"+n2+"="+ result);
                break;
            }
        }
    }
