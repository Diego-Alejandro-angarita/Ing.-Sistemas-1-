import java.util.Scanner;

public class Function {
    static double ChfToUsd(double Chf, double TasaConversion){
        double resultado = Chf*TasaConversion;
        System.out.println("el valor de los CHF a USD es: " + resultado);
        return resultado;
    }

    static double UsdToCop(double Usd, double TasaConversionToCop){
        double resultado = Usd*TasaConversionToCop;
        System.out.println("esos dolares se convierten a: " + resultado + " pesos pero se va a retener un 5% por comision");
        double porcentaje = resultado * 0.05;
        double resultadoTotal = resultado - porcentaje;
        return resultadoTotal;
    }

    public static void main(String[] args){
        Scanner Leer = new Scanner(System.in);
        double TasaChf, TasaUsd, Francos, Dolares;

        System.out.println("¿Cual es la tasa de conversion de CHF a USD?");
        TasaChf = Leer.nextDouble();

        System.out.println("¿Cual es la tasa de conversion de USD a COP?");
        TasaUsd = Leer.nextDouble();

        System.out.println("¿Cuantos CHF quieres guardar?");
        Francos = Leer.nextDouble();

        Dolares = Francos * TasaChf;

        System.out.println(ChfToUsd(Francos, TasaChf));
        System.out.println(UsdToCop(Dolares, TasaUsd));
    }
}