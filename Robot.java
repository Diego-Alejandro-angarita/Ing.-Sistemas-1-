import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Robot {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int x, y;
        String direccion = "norte";
        System.out.println("ingresa la avenida en la que se encuentra el robot");
        x = Leer.nextInt();
        System.out.println("ingresa la calle en la que se encuentra el robot");
        y = Leer.nextInt();

        System.out.println("estoy en avenida " + x + " calle " + y + " mirando al " + direccion);

        for (int i=x; i>=1;i--){
            if (x==1){
                System.out.println("estoy en la avenida 1 " + " calle " + y + " mirando al " + direccion);
            }else if (x>1 && direccion == "norte") {
                System.out.println("giré a la izquierda");
                direccion = "este";
                }else {
                System.out.println("estoy en la avenida " + i + " calle " + y + " mirando al "+ direccion);
            }
        }

        for (int i=y; i>=1;i--) {
            if (y == 1) {
                System.out.println("estoy en la avenida 1 " + " calle " + i + " mirando al " + direccion);
            } else if (x > 1 && direccion == "este") {
                System.out.println("giré a la izquierda");
                direccion = "sur";
            } else {
                System.out.println("estoy en la avenida 1" + " calle " + i + " mirando al " + direccion);
                System.out.println("giré a la izquierda");
                direccion = "oeste";
                System.out.println("estoy en la avenida 1 " + " calle " + i + " mirando al " + direccion);
                System.out.println("giré a la izquierda");
                direccion = "norte";
                System.out.println("estoy en la avenida 1 " + " calle " + i + " mirando al " + direccion);
            }
            System.out.println("me apagué");

        }
    }
}