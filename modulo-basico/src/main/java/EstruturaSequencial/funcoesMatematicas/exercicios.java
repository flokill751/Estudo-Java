package EstruturaSequencial.funcoesMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class exercicios {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);

        exercicio1(entrada);
        System.out.println();
        exercicio2(entrada);
        System.out.println();
        exercicio3(entrada);
        System.out.println();
        exercicio4(entrada);
        System.out.println();
        exercicio5(entrada);


        entrada.close();

    }

    public static void exercicio1(Scanner entrada) {

        int valor1, valor2, soma;

         valor1 = entrada.nextInt();
         valor2 = entrada.nextInt();
         soma = valor1 + valor2;

        System.out.println("SOMA = " + soma);

    }

    public static void exercicio2( Scanner entrada) {

        double area, phi, raio, valor;

        phi = 3.14159;
        valor = entrada.nextDouble();
        raio = Math.pow(valor,2);
        area = phi * raio;

        System.out.printf("A = %.4f%n", area);

    }
    public static void exercicio3( Scanner entrada) {

        int A, B,C,D, diferenca;

        A = entrada.nextInt();
        B = entrada.nextInt();
        C = entrada.nextInt();
        D = entrada.nextInt();

        diferenca = A * B - C * D;

    System.out.println ("A = " + diferenca);

    }

    public static void exercicio4( Scanner entrada){

        int F;
        double Hrs, Salario, total;

        F = entrada.nextInt();
        Hrs = entrada.nextDouble();
        Salario = entrada.nextDouble();

        total = Hrs * Salario;

        System.out.println("NUMBER = " + F);
        System.out.printf("SALARY = U$ %.2f%n", total);

    }

    public static void exercicio5 ( Scanner entrada){

        int peca1, numeropeca1, peca2, numeropeca2;
        double valorunit1, valorunit2, total1, total2, resultado;

        peca1 = entrada.nextInt();
        numeropeca1 = entrada.nextInt();
        valorunit1 = entrada.nextDouble();

        peca2 = entrada.nextInt();
        numeropeca2 = entrada.nextInt();
        valorunit2 = entrada.nextDouble();

        total1 = numeropeca1 * valorunit1;
        total2 =numeropeca2 * valorunit2;

        resultado = total1 + total2;

        System.out.printf(" VALOR A SER PAGAR: R$ %.2f%n ", resultado);

    }

    public static void exercicio6( Scanner entrada){

        double A,B, C, TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETAGULO, pi = 3.14159;

        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();

        TRIANGULO = A * C / 2 ;
        CIRCULO = C * C * pi  ;
        TRAPEZIO = (A + B) / 2.0 * C;
        QUADRADO = B * B;
        RETAGULO = A * B;


        System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f%n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f%n", QUADRADO);
        System.out.printf("RETANGULO: %.3f%n", RETAGULO);



    }
}

