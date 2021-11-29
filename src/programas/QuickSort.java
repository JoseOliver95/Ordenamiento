package programas;
public class QuickSort {
    
    /*  Esta función toma al último elemento como pivote, coloca al pivote
        en la posición correcta en un arreglo ordenado y coloca a todos los
        más pequeños (más pequeños que el pivote) a la izquierda del pivote
        y los elementos más grandes a la derecha del pivote */
    static int particion(int[] arr, int low, int high){
        int pivote = arr[high];
        
        /*Indice del elemento más pequeño 
          e indica la posición correcta
          del pivote encontrada hasta ahora */
        int i = (low-1);
        
        for(int j = low; j <= high-1; j++){
        
            //Si el elemento actual es más pequeño que el pivote
            if(arr[j] > pivote){

                //Incrementa el índice del elemento más pequeño
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return (i + 1);
    }
    /*La función principal que implementa a quicksort
        arr[] --> El arreglo que será ordenado
        low --> Comienzo del índice
        high --> fin del índice
    */
    static void quickSort(int[] arr, int low, int high){
        if(low < high){
            //pi divide al índice, arr[pi] ahora está a la derecha
            int pi = particion(arr, low, high);
            
            //Separadamente ordenar elementos antes y después de la partición
            quickSort(arr, low, pi - 1);//Before
            quickSort(arr, pi + 1, high);//After
        }
    }
    //Función de imprimir el array ordenado
    static void printArray(int[] arr, int size){
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("<-- Arreglo ordenado");
    }
    //Método principal
    public static void main(String[] args) {
        int[] arr = {5, 1, 8, 10, 7, 9};
        int n = arr.length;
        
        quickSort(arr, 0, n - 1);
        printArray(arr, n);
    }
    
}