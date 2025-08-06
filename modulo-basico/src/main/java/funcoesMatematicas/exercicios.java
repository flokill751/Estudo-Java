package funcoesMatematicas;

public class exercicios {
    public static void main(String[] args) {

        //Exercicio 01

        float a = 10;
        float b = 30;

        System.out.println("Valor total = " + (a + b));

        float A = -30;
        float B = 10;

        System.out.println("Valor total =" + (A + B));


        System.out.println("Valor total =" + (A * 0));

    //Exercicio 02

    double phi = 3.14159;
    double r1 = 2;
    double r2 = 100.64;
    double r3 = 150.00;

    double area1 = phi * Math.pow (r1, 2);
    double area2 = phi * Math.pow (r2, 2);
    double area3 = phi * Math.pow (r3, 2);

    System.out.printf("Valor area = %.4f%n", area1);
    System.out.printf("Valor area = %.4f%n", area2);
    System.out.printf("Valor area = %.4f%n", area3);

    //Exercicio 03
    double f = 5;
    double s = 6;

    double F = 7;
    double Fs = -7;
    double S = 8;

    System.out.println("DIFERENÇA = " + ((f * s) - (F * S)));
    System.out.println("DIFERENÇA = "+ ((f * s) - (Fs * S)));

    //Exercicio 04

    double NUMBER1 = 25;
    double Hr1 = 100;
    double Sl1 = 5.50;

    double total1 = Hr1 * Sl1;

    System.out.printf("NUMBER = %.2f%n", NUMBER1);
    System.out.printf("Salario = %.2f%n", total1);

    double NUMBER2 = 1;
    double hr2 = 200;
    double Sl2 = 20.50;

    double total2 = hr2 * Sl2;

    System.out.printf("NUMEBER = %.2f%n", NUMBER2);
    System.out.printf("Salario = %.2f%n", total2);


    double NUMBER3 = 6;

    double hr3 = 145;
    double Sl3 = 15.55;

    double total3 = hr3 * Sl3;

    System.out.printf("NUMEBER = %.2f%n", NUMBER3);
    System.out.printf("Salario = %.2f%n", total3);


    }
}
