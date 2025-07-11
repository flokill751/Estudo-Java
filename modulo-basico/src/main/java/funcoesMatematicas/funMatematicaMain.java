package funcoesMatematicas;

public class funMatematicaMain {
    public static void main(String[] args) {

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
    double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println("Ta ai a raiz " + x + " = " + A );
        System.out.println("Se liga na raiz ai " + y + B);
        System.out.println("Se liga na raiz ai " + 25 + C);

        A = Math.pow(x, y);
        B = Math.pow(y, 2.0);
        C = Math.pow(5.0, 2.0);

        System.out.println(x + "elevado a " + y + " = " + A );
        System.out.println( x + "elevando ao quandrado " + B);
        System.out.println( x + " 5 elevando ao quandrado " + C);

        A = Math.abs(y);
        B = Math.abs(z);

        System.out.println("Valor absoluto de " + y + " = " + A );
        System.out.println( x + "elevando ao quandrado " + B);

    }
}
