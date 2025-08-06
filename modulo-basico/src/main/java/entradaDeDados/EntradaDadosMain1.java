package entradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDadosMain1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String x;

        x = entrada.next();

        System.out.println("iiiii voce digitou "  + x);


        Scanner entrada2 = new Scanner(System.in);

        int y;

        y = entrada2.nextInt();

        System.out.println(" o numero de = " + y);

        Locale.setDefault(Locale.US);
        Scanner entrada3 = new Scanner(System.in);


        double o;
        o = entrada3.nextDouble();

        System.out.println(" o numero de = " + o);

       double oPrintf;
        oPrintf = entrada3.nextDouble();
        System.out.printf(" Seu numero e %f.6%n", oPrintf);


        Scanner entrada4 = new Scanner(System.in);

        char padeiro;
        padeiro = entrada4.next().charAt(0);

        System.out.println("voce digitou = " + padeiro);

        Scanner finalmente = new Scanner(System.in);

        String z;
        int Z;
        double p;

        z = finalmente.next();
        Z = finalmente.nextInt();
        p = finalmente.nextDouble();

        System.out.println("Dados digitados: ");
        System.out.println(z);
        System.out.println(Z);
        System.out.printf("%f.10%n",p);

        entrada.close();

    }
}
