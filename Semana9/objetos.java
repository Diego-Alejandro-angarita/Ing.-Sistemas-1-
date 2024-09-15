import java.util.Scanner;

public class objetos{
    public static int contarHs(String cadena){
        int longitud, hContador;
        hContador = 0;
        longitud = cadena.length();

        for (int i = 0;i<longitud;i++) {
            if(cadena.charAt(i)=='h'){
                hContador++;
            }
        }
        System.out.println("la cantidad de letras h que hay en el mensaje es: " + hContador);
        return hContador;
    }

    public static int contarHolas(String cadena){
        int holaContador;
        holaContador = 0;
        String[] palabras = cadena.split(" ");

        for(String palabra : palabras){
            if(palabra.equals("hola")){
                holaContador++;
            }
        }
        System.out.println("la cantidad de palabras hola que hay en el mesaje es: " + holaContador);
        return holaContador;
    }

    public static int contarJs(String cadena){
        int JContador;
        JContador=0;
        String[] palabras = cadena.split(" ");

        for(String palabra : palabras){
            if(palabra.charAt(0)=='J'){
                JContador++;
            }
        }
        System.out.println("la cantidad de letras J que hay en el mensaje es: " + JContador);
        return JContador;
    }
    public static void main(String[] args) {
        String mensaje;
        Scanner leer = new Scanner(System.in);

        System.out.println("escriba el mensaje que desee");
        mensaje = leer.nextLine();
        
        contarHs(mensaje);
        contarHolas(mensaje);
        contarJs(mensaje);
    }
}