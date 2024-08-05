import java.util.Scanner;

public class peajeCopacabana {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);

        //ejercicio 1
        int Eleccion;
        String tarifaSmg;
        tarifaSmg = "la tarifa a pagar es de: ";

        System.out.println("que categoria de vehiculo conduces: 1-Automoviles, camperos y camionetas 3-Camion pequeño de 2 ejes, 4-Camion grande de 2 ejes, 5-Camion de 3 y 4 ejes, 6-Camion de 5 ejes, 7-Camion de 6 ejes");

        Eleccion = Leer.nextInt();
        
        if (Eleccion == 1){
            System.out.println(tarifaSmg + "14.900");
        } else if (Eleccion ==2 || Eleccion == 4) {
            System.out.println(tarifaSmg + "26.000");
        } else if (Eleccion == 3) {
            System.out.println(tarifaSmg + "20.800");
        } else if (Eleccion == 5) {
            System.out.println(tarifaSmg + "51.800");
        } else if (Eleccion == 6 || Eleccion == 7) {
            System.out.println(tarifaSmg + "73.900");
        }
    }
}