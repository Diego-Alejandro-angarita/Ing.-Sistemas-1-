import java.util.Scanner;

public class Main {
    static double areaCirc(double radio){
        double area;
        area = (radio*radio) * (Math.PI);
        return area;
    }
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);

        double radio;
        System.out.println("¿cual es el radio de la circunferencia?");
        radio = Leer.nextDouble();
        System.out.println(areaCirc(radio));
    }
}