

/* ordenamiento */
public class plenaria{
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        
    }

    public static int[] selectionSort(int[] arr){
        int n = arr.length;

        for  (int i = 0; i < n-1; i++){
            int minIndex = i;
            for (int j = i+1; j < n; j++){
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
        }

        return arr;
    }


    
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 13};
    }
}