package estruturaRepetitivas;

import java.util.Scanner;

public class ExercicioEstruturaFor {
    public static void main(String[] arg ){
    Scanner FORguei = new Scanner(System.in);

    exercicio1(FORguei);

    FORguei.close();

    }
    public static void exercicio1(Scanner FORguei){

        int x =  FORguei.nextInt();

        int soma = 0;

        for (int i = 0; i < x; i++){

          int N = FORguei.nextInt();

            soma = soma + N;
        }
        System.out.println(soma);
    }
}
