package entradaDeDados;

import java.util.Scanner;

public class EntradaDadosMain1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String zucleide;
        zucleide = sc.next();

        System.out.println("teu nome e = " + zucleide);


    int x;

    x = sc.nextInt();

    System.out.println("Numeros de buneca " + x);

    double dinossauro;

    dinossauro = sc.nextDouble();

    System.out.printf("preço do seu dinossauro %.2f$%n", dinossauro );


    char tioo;

    tioo = sc.next().charAt(5);

    System.out.println("koko coco cacho = " + tioo);



    sc.close();


    }
}
