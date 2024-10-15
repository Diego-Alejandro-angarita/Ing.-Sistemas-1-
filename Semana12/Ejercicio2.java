import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

    class Busqueda {

        public static boolean busquedaLineal(ArrayList<Integer> arr, int buscar) {
            boolean encontrado = false;
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) == buscar) {
                    encontrado = true;
                    break;
                }
            }
            return encontrado;
        }

        public static int busquedaBinaria(ArrayList<Integer> arr, int buscar) {
            int inicio = 0;
            int fin = arr.size() - 1;
            int retornar = -1;
            int posc;

            while (inicio <= fin) {
                posc = (inicio + fin) / 2;
                if (arr.get(posc) == buscar) {
                    retornar = posc;
                    break;
                } else if (arr.get(posc) > buscar) {
                    fin = posc - 1;
                } else {
                    inicio = posc + 1;
                }
            }
            return retornar;
        }
    }   

    public static ArrayList<Integer> imprimirArreglo(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size()-1; i++) {
            System.out.print(arr.get(i) + " ");
        }
        return arr;
    }

    public static ArrayList<Integer> ordenamientoBurbuja(ArrayList<Integer> arr) {
        int temp;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);


        ArrayList<Integer> arreglo = new ArrayList<>();
        int numeros;
        System.out.println("ingrese tantos numeros como desee (escriba FIN para terminar)");
        String fin;

        while (true) {
            fin = leer.nextLine();
            if (fin.equals("FIN")){
                break;
            }else{
                numeros = Integer.parseInt(fin);
                arreglo.add(numeros);
            }
        }
        imprimirArreglo(arreglo);

        ArrayList<Integer> arregloOrdenado = ordenamientoBurbuja(arreglo);
        System.out.println("");
        System.out.println("el arreglo ordenado  usando el metodo de ordenamiento burbuja es: ");
        imprimirArreglo(arregloOrdenado);

        int buscar;
        System.out.println("ingrese el numero a buscar");
        buscar = leer.nextInt();
        if (Busqueda.busquedaLineal(arregloOrdenado, buscar)) {
            System.out.println("el numero " + buscar + " esta en el arreglo en la posicion " +(Busqueda.busquedaBinaria(arregloOrdenado, buscar) + 1));
        } else {
            System.out.println("el numero " + buscar + " no esta en el arreglo");
        }
    }   
}