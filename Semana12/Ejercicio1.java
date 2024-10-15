import java.util.Scanner;
//lee numeros desde el teclado y los guarda en un arreglo de enteros
//cree un metodo que mueste el arreglo
public class Ejercicio1 {

    public class Busqueda{
        public static boolean busquedaLineal(int[] arr, int buscar) {
                
                boolean encontrado = false;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == buscar) {
                        encontrado = true;
                        break;
                    }
                }
                return encontrado;
            }
            
            public static int busquedaBinaria(int[] arr, int buscar) {
                int inicio = 0;
                int fin = arr.length - 1;
                int retornar = -1;
                int posc;

                while (inicio <= fin) {
                    posc = (inicio + fin) / 2;
                    if (arr[posc] == buscar) {
                        retornar = posc;
                        break;
                    } else if (arr[posc] > buscar) {
                        fin = posc - 1;
                    } else {
                        inicio = posc + 1;
                    }
                }
                return retornar;
            }
        }

    public static int[] imprimirArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;


    }

    public static int[] ordenamientoBurbuja(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese cuantos numeros quiere guardar");
        n = leer.nextInt();
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese numero " + (i + 1));
            arreglo[i] = leer.nextInt();
        }

        int buscar;

        int[] arregloOrdenado = ordenamientoBurbuja(arreglo);
        imprimirArreglo(arregloOrdenado);

        System.out.println("Ingrese el numero a buscar");
        buscar = leer.nextInt();
        if (Busqueda.busquedaBinaria(arregloOrdenado, buscar)!= -1) {
            System.out.println("El numero " + buscar + " esta en el arreglo en la posicion " + (Busqueda.busquedaBinaria(arregloOrdenado, buscar) + 1));
        } else {
            System.out.println("El numero " + buscar + " no esta en el arreglo");
        }
    }
}