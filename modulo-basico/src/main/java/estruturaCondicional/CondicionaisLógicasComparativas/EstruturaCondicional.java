package estruturaCondicional.CondicionaisLógicasComparativas;

import java.util.Scanner;

public class EstruturaCondicional {
        public static void main (String[] args) {
            condicaoSimples(args);
            Scanner sc = new Scanner(System.in);
            condicaoCompose(sc);
            System.out.println();
            condicaoEncademento(sc);
            sc.close();

        }

        public static void condicaoSimples (String[] arg){

            int x = 5;

            System.out.println("Bom dia");

            if (x < 0){
                        System.out.println("Bom tarde");

            }
            System.out.println("Bom noite");

        }
        public static void condicaoCompose (Scanner sc){

            int hora;

            System.out.println("Quantas horas são ?");
            hora = sc.nextInt();

            if (hora < 12){
                System.out.println("Bom dia");
            }
            else{
                System.out.println("Bom tarde");
            }
        }

        public static void condicaoEncademento (Scanner sc){
            int hora;

            System.out.println("Quantas horas ??");
            hora = sc.nextInt();
            if (hora < 12){
                System.out.println("Bom dia");
            } else if (hora < 18) {
                    System.out.println("Bom tarde");
                } else if (hora > 24) {
                        System.out.println("nao existe");
                }
            }
        }

