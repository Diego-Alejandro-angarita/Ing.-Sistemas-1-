import java.util.Scanner;

public class Pendiente {
    static double calcPendiente(double x1, double x2, double y1, double y2){
        double pendiente = (y2 - y1)/(x2 - x1);
        return pendiente;
    }

    public static void main(String[] args){
        Scanner Leer = new Scanner(System.in);

        double x1, x2, y1, y2;
        System.out.println("ingrese el valor de x1 (debe variar entre -10 y 20)");
        x1 = Leer.nextDouble();

        System.out.println("ingrese el valor de x2 (debe variar entre 10 y 20)");
        x2 = Leer.nextDouble();

        System.out.println("ingrese el valor de y1 (debe variar entre -10 y 10)");
        y1 = Leer.nextDouble();

        System.out.println("ingrese el valor de y2 (debe variar entre 0 y 10)");
        y2 = Leer.nextDouble();

        if ((x1 < -20 || x1>10) || (x2<10 || x2>20) || (y1< -10 || y1>10) || (y2<0 || y2>10) || (x2-x1==0)){
            System.out.println("los valores ingresados son invalidos");
        }else{
            System.out.println("la pendiente es: "+ calcPendiente(x1, x2, y1, y2));
        }
    }
}
