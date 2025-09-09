package estruturaRepetitivas;

import java.util.Scanner;

public class Exer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       exercicio1(sc);
        System.out.println();
        exercicio2(sc);
        System.out.println();
        exercicio3(sc);
        System.out.println();
        exercicio4(sc);

        sc.close();

    }

    public static void exercicio1(Scanner sc) {

        System.out.println("Digite sua senha ");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha incorreta, Digite novamente");
            senha = sc.nextInt();
        }
        System.out.println("Senha correta");

    }

    public static void exercicio2(Scanner sc) {

        int y = sc.nextInt();
        int x = sc.nextInt();

        while ( x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("Primeiro");

            }else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("Terceiro");

            }else if (x > 0 && y < 0) {
                System.out.println("Quarto");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
    }

    public static void exercicio3(Scanner sc) {

        System.out.println("Digite o codigo de combustível");
        System.out.println("1 - Alcool");
        System.out.println("2 - Gasosa");
        System.out.println("3 - dizel");
        System.out.println("4 - Fim");

        int codigo = sc.nextInt();

        int alcool = 0;
        int gasolina = 0;
        int dizel = 0;

        while ( codigo != 4 ){

            if (codigo == 1){

                alcool = alcool + 1;

            }else if (codigo == 2){
                gasolina = gasolina + 1;

            }else if (codigo == 3){

                dizel = dizel + 1;

            } else if (codigo > 4){

            }
            codigo = sc.nextInt();
        }
        System.out.println("Muito Obrigado ");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: "+ gasolina);
        System.out.println("Dizel: "+ dizel);
    }
    public static void exercicio4(Scanner sc){

        int codigo = sc.nextInt();

        int XB = 0;
        int XS = 0;
        int refri = 0;

        while ( codigo != 4 ){
            if (codigo == 1){

             XB = XB + 1;

            }else if (codigo == 2){

                XS = XS + 1;
            } else if (codigo == 3) {

                refri = refri + 1;

            } else if (codigo > 4) {

            }

            codigo = sc.nextInt();
        }
        System.out.println("Seus pedidos ?");
        System.out.println("X-Burgue: " + XB);
        System.out.println("X-S: " + XS);
        System.out.println("Refri: " + refri);

    }
}

