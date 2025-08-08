package funcoesMatematicas;

import java.util.Scanner;

public class exercicios {
    public static void main(String[] args) {
    exercicio1(args);
    System.out.println();
    exercicio2(args);
    System.out.println();
    exercicio3(args);
    System.out.println();

    }

    public static void exercicio1(String[] args) {

        Scanner entrada = new Scanner(System.in);


        double valor1 = entrada.nextDouble();
        double valor2 = entrada.nextDouble();
        double soma = valor1 + valor2;

        System.out.println("SOMA = " + soma);

        entrada.close();

    }

    public static void exercicio2(String[] args) {


        System.out.println("OLA BAIANOS1123123 " );


    }
    public static void exercicio3(String[] args) {
        System.out.println("OLA BAIANA ");

    }
}
