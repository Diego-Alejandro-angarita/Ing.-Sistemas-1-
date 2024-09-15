
import java.util.Scanner;

public class RepetirMensaje {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String mensaje, mensajeFinal, caracter;
        int num;
        mensajeFinal = "";

        System.out.println("escribe el mensaje que desees");
        mensaje = leer.nextLine();
        System.out.println("escribe el caracter que desees");
        caracter = leer.nextLine();
        System.out.println("escribe el numero entero que desees");
        num = leer.nextInt();

        if (num>0){
            for (int i = 0; i < num-1; i++) {
                mensajeFinal = mensajeFinal + mensaje + caracter;
            }
    
            mensajeFinal = mensajeFinal + mensaje;
            System.out.println(mensajeFinal);
        }else{
            System.out.println("debes ingresar un numero mayor que cero");
        }
    }
}
