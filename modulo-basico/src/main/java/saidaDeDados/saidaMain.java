package saidaDeDados;

import java.util.Locale;

public class saidaMain {

    public static void main(String[] args) {


        double Africano = 520.46544899846546498894968489489489498944;
        String nome = "Mario Dementes";
        int idade = 48;
        double renda = 10000.0;


        System.out.println("Cachorro");
        System.out.printf("%.2f%n", Africano);
        System.out.println("Cachorro fumou o " + Africano + " TANOS de maconha");
        System.out.printf("Fumaram %.2f TANOS de maconha%n", Africano);
        System.out.printf("%s tem %d anus e ganha R$ %.4f reais%n", nome, idade, renda);
        Locale.setDefault(Locale.US);
        System.out.print(Africano);


        }
    }
