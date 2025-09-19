package estruturaSequencial.saidaDeDados;

import java.util.Locale;

public class saidaAtividadeMain {
    public static void main(String[] args) {


                String produto1 = "Computador";
                String produto2 = "Mesa de Escritório";

                int idade = 45;
                int code = 7894;
                char genero = 'F';

                double preco1 = 5852.0;
                double preco2 = 785.50;
                double medida = 53.002345;


                System.out.printf("Produtos:%n%s, tem um preço de %f%n", produto1, preco1);
                System.out.printf("%s, tem um preço de %f%n", produto2, preco2);
                System.out.printf("Recorde: %d ano, codigo: %d e genero: F%n ", idade, code, genero );
                System.out.printf("Medida em 8 decimais: %f%n Rouded (medida em tres decimais): %.3f%n", medida, medida);
                Locale.setDefault(Locale.US);
                System.out.printf("US decimal ponto: %.3f%n", medida);



    }
}
