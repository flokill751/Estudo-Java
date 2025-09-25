package programacaoOrientadaObjetos.classes;

import java.util.Locale;
import java.util.Scanner;

public class ExempleComPOO {

    public static void main(String[] argrs){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        ExempleTriangulo x, y;
        x = new ExempleTriangulo();
        y = new ExempleTriangulo();

        System.out.println("COLOCA A POHA DOS NUMEROS X AE:");

        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("COLOCA A POHA DOS NUMEROS Y AE:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.c + x.b + x.a) / 2.0;
        double areaX = Math.sqrt(p * (p - x.c) * (p - x.b) * (p - x.c));

        p = (y.c + y.b + y.a) / 2.0;
        double areay = Math.sqrt(p * (p - y.c) * (p - y.b) * (p - y.c));

        System.out.printf("Area do triangulo X: %.4f%n", areaX);
        System.out.printf("Area do triangulo Y: %.4f%n", areay);

        if (areaX > areay){
          System.out.println("A POHA DO NUMERO X E MAIOR");
        }else {
            System.out.println("A POHA DO NUMERO Y E MAIOR");

        }

        sc.close();
    }

}
