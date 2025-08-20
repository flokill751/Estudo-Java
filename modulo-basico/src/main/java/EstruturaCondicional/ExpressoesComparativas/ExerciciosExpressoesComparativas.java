package EstruturaCondicional.ExpressoesComparativas;

import java.util.Scanner;

public class ExerciciosExpressoesComparativas {
    public static void main(String [] arg){
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
        System.out.println();
        exercicio6(sc);
        System.out.println();
        exercicio7(sc);
        System.out.println();
        exercicio8(sc);
        System.out.println();
        exercicio9(sc);
        System.out.println();
        exercicio10(sc);

        sc.close();
    }

    public static void exercicio1 (Scanner sc){

        System.out.println("Digite um numero:");
        int n = sc.nextInt();

        if (n % 2 == 0){
            System.out.println("par");
        }else {
            System.out.println("impar");
        }
    }
    public static void exercicio2 (Scanner sc){
        System.out.println("Digite dois numero:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b){
            System.out.println("o numero " + a + " maior");

        }
        else if (a < b) {
            System.out.println("o numero " + b + " maior");
        }
        else  {
            System.out.println("os numeros são iguais");
        }
    }
    public static void exercicio3 (Scanner sc){
        System.out.println("Digite sua idade");

        int a = sc.nextInt();

        if (a < 16){

            System.out.println("Não pode votar: ");

        } else if ((a >= 16 && a <= 18) || a > 65) {

            System.out.println("Voto opcional" );

        }else {

            System.out.println("Voto obrigatório");
        }
    }
    public static void exercicio4 (Scanner sc){
        int nota = sc.nextInt();

        if(nota > 10 || nota < 0){
            System.out.println("Erro");
        } else if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        }else {
            System.out.println("Reprovado");
        }
    }
    public static void exercicio5 (Scanner sc){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c){
            System.out.println("Numero maior = " + a);

        } else if (b >= a && b >= c ) {

            System.out.println("Numero maior = " + b);
        }else {

            System.out.println("Numero maior = " + c);
        }
    }
    public static void exercicio6 (Scanner sc){
        int senha = 1234;
        int s = sc.nextInt();

        if (senha == s){
            System.out.println("Acesso permitido");

        }else{ System.out.println("Acesso negado");}
    }
    public static void exercicio7 (Scanner sc){
        System.out.println("Digite um numero:");
        int n = sc.nextInt();

        if (n > 0 ){
            System.out.println("numero positivo");
        }else if (n == 0){
            System.out.println("numero zero");
        }else {
            System.out.println("numero negativo");
        }
    }
    public static void exercicio8 (Scanner sc){
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double media = (a + b) / 2;


        System.out.println("media = " + media);

        if (media >= 6){
            System.out.println("Aprovado");

        }else {
            System.out.println("Reprovado");
        }
    }
    public static void exercicio9 (Scanner sc){

        System.out.println("Digite sua idade");

        int idade = sc.nextInt();

        if (idade >= 18){
            System.out.println("maior de idade");
        }else {
            System.out.println("menor de idade");
        }
    }
    public static void exercicio10 (Scanner sc){
        sc.nextLine();
        System.out.println("Digite primeiro nome");
        String nome1 = sc.nextLine();
        System.out.println("Digite segundo nome");
        String nome2 = sc.nextLine();

        if ( nome1.equals(nome2)){
            System.out.println( "os nomes são iguais");

        }else {

            System.out.println("Não são iguais");

        }

    }
}
