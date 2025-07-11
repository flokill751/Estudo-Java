package entradaDeDados;

import java.util.Scanner;


public class EntradaDadosMain2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int CACHORRO;

        String s1, s2, s3;

        CACHORRO = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS: ");
        System.out.println(CACHORRO);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
