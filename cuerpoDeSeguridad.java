import java.util.Scanner;

public class cuerpoDeSeguridad {
    public static void main (String[] args){
        Scanner Leer = new Scanner(System.in);
        int altura, cuerpoSeguridad, genero;

        System.out.println("ingrese su altura en centimetros");
        altura = Leer.nextInt();

        System.out.println("seleccione a que cuerpo de seguridad desea unirse: 1-policia nacional 2-guardia civil y fuerzas armadas");
        cuerpoSeguridad = Leer.nextInt();

        System.out.println("ingrese su genero: 1-masculino 2-femenino");
        genero = Leer.nextInt();

        if (cuerpoSeguridad == 1){
            System.out.println("puede unirse a la policia nacional sin importar su genero ni su altura");
        } else if ((cuerpoSeguridad == 2 & genero == 1 & altura >= 160) | (cuerpoSeguridad == 2 & genero == 2 & altura >= 155)){
            System.out.println("puede unirse a la guardia civil y fuerzas armadas");
        }else {
            System.out.println("no puede unirse a las fuerzas armadas y guardia civil");
        }
    }
}
