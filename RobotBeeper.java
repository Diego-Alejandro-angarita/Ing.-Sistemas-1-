import java.util.Scanner;

public class RobotBeeper {
    public static void main(String[] args){
        Scanner Leer = new Scanner(System.in);

        int x,y,beeper,beeperEx;
        String direccion;
        
        beeper = 0;
        direccion = "oeste";
        System.out.println("ingresa la avenida en la que se encuentra el robot");
        x = Leer.nextInt();
        System.out.println("ingresa la calle en la que se encuentra el robot");
        y = Leer.nextInt();

        System.out.println("estoy en avenida " + x + " calle " + y + " mirando al " + direccion);

        if (direccion == "oeste"){
            System.out.println("giré a la izquierda");
            direccion = "norte";
            System.out.println("estoy en avenida " + x + " calle " + y + " mirando al " + direccion);
            System.out.println("giré a la izquierda");
            direccion = "este";
            System.out.println("estoy en avenida " + x + " calle " + y + " mirando al " + direccion);
        }

        for (int i = x; i<=1;i--){
            System.out.println("hay un beeper 1-si 2-no");
            beeperEx = Leer.nextInt();
            if (beeperEx == 1){
                beeper = beeper+1;
            }
        }
    }
}