package EstruturaCondicional.EstruturasCondicionais;

import java.util.Scanner;

public class LogicasComparativasExercicio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        exercicio1(sc);
        System.out.println();
        exercicio2(sc);
        System.out.println();
        exercicio3(sc);
        System.out.println();
        exercicio4(sc);
        System.out.println();
        exercicio5(sc);

        sc.close();

    }
    public static void exercicio1 (Scanner sc){

        System.out.println("Digite o numero");

        int numero = sc.nextInt();


        if ( numero < 0) {

            System.out.println("Negativo");

        }else {
            System.out.println("NAO NEGATIVO");
        }
    }

    public static void exercicio2 (Scanner sc){

        System.out.println("Digite o numero");
        int N = sc.nextInt();

        if ( N % 2 == 0) {
            System.out.println("PAR KARALHO");
        } else
            System.out.println("IMPAR PORAAAAAAAA");
    }

    public static void exercicio3 (Scanner sc) {

        int A, B;

        A = sc.nextInt();
        B = sc.nextInt();

        if (A % 2 == 0 && B % 2 == 0) {
            System.out.println("Sao Multiplo");
        }else{

            System.out.println("Nao SaoMultiplo");
        }
    }
    public static void exercicio4 (Scanner sc){

        int hrinit, hrfn;

        hrinit = sc.nextInt();
        hrfn = sc.nextInt();

        int duracao;
        if( hrinit < hrfn ) {

            duracao = hrfn - hrinit ;
        }else  {
            duracao = 24 - hrinit + hrfn;
        }
        System.out.println("O jogo Durou " + duracao + " HORAS (S)");
    }
    public static void exercicio5 (Scanner sc){


    }
}
