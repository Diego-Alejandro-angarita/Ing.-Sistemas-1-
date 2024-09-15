
import java.util.Scanner;

public class RepetirCaracter {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String mensaje, mensajeFinal;
        char caracter;
        mensajeFinal = "";

        System.out.println("escribe el mensaje que desees");
        mensaje = leer.nextLine();

        for (int i = 0; i < mensaje.length(); i++) {
            caracter = mensaje.charAt(i);
            if(caracter!=' '){
                mensajeFinal = mensajeFinal + caracter + caracter;
            }else{
                mensajeFinal = mensajeFinal + caracter;
            }
        }
        System.out.println(mensajeFinal);
    }
}
