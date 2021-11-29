
package programas;

public class Shellsort {
     public static void main(String []  args){
        int n=10;
        int [] arreglo = new int[n];
        for (int i=0; i<n; i++){
            arreglo[i] = (int)(Math.random() * 100) + 1;
        }
        for(int x : arreglo){
            System.out.print(" " + x);
        }
        System.out.println("");
        shell(arreglo);
        for(int x : arreglo){
            System.out.print(" " + x);
        }
        System.out.println("");
    }
    
    
    public static void shell(int A[]) {

        int salto, aux, i;
        boolean cambios;
  
        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {   // Mientras se intercambie algún elemento                                         
                cambios = false;
                for (i = salto; i < A.length; i++)   // se da una pasada
                {
                    if (A[i - salto] > A[i]) {       // y si están desordenados
                        aux = A[i];                  // se reordenan
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true;              // y se marca como cambio.                                   
                    }
                }
            }
        }}

}

