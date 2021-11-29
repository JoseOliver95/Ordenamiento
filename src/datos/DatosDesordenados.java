package datos;
import java.util.Arrays;
import programas.Ordenamientos;

/**
 *
 * @author Noemí Lara Acono
 * Rama creada
 */
public class DatosDesordenados {
    // Atributos
    private int[] valores; 
    private int limiteSuperior;//Valor más grande
    private int size; //Valor de n

    public DatosDesordenados(int limite, int size) {
        this.valores = new int[size];
        this.limiteSuperior = limite;
        this.size = size;
    }

    public DatosDesordenados() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void agregarDato(int valor){
        valores[size]= valor;
        size++;
    }
    
    public int getDato(int posicion){
        return valores[posicion];
    }
    
    public void generarValores(){
        for (int i=0; i < valores.length; i++){
            double aleatorio = Math.random() * limiteSuperior;
            valores[i] = (int) aleatorio + 1;
        }
    }
    
    public int getSize(){
        return size; 
    }
    
    public int getCapacidad(){
        return valores.length;
    }
    
    public int getLimiteSuperior(){
        return limiteSuperior;
    }
    
    
    public int[] getValores(){
        return valores;
    } 
    
    public int[] getCopiaValores(){
        int [] copia = new int[size];
        System.arraycopy(valores, 0, copia, 0, size);
        return copia;
    }
    
    
   
     public DatosOrdenados algoritmoSort(){
        
        // obtener una copia de los datos desordenados
        int [] arreglo = this.getCopiaValores();
        
        // agregar algoritmo de ordenación
        
        // devolver los datos ordenados
        return new DatosOrdenados(arreglo);
    }
    
    public DatosOrdenados bubbleSort(){
        int [] arreglo = this.getCopiaValores();
        int n = arreglo.length;
        int cont = 0;
        int ci = 0;
        for (int i=0; i < n-1; i++){
            for (int j=0; j < n-i-1; j++){
                cont++;
                if (arreglo[j] > arreglo[j+1]){
                    // intercambiar: swap
                    ci++;
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = temporal;
                }
            }
        }
        System.out.println("BS-comparaciones = " + cont);
        Ordenamientos.ta.append("BS-comparaciones = " + cont+"\n");
        System.out.println("BS-intercambios = " + ci);
        Ordenamientos.ta.append("BS-intercambios = " + ci+"\n");
        return new DatosOrdenados(arreglo);
    }
    public DatosOrdenados bubbleSortD(){
        int [] arreglo = this.getCopiaValores();
        int n = arreglo.length;
        int cont = 0;
        int ci = 0;
        for (int i=0; i < n-1; i++){
            for (int j=0; j < n-i-1; j++){
                cont++;
                if (arreglo[j] < arreglo[j+1]){
                    // intercambiar: swap
                    ci++;
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = temporal;
                }
            }
        }
        System.out.println("BS-comparaciones = " + cont);
        Ordenamientos.ta.append("BS-comparaciones = " + cont+"\n");
        System.out.println("BS-intercambios = " + ci);
        Ordenamientos.ta.append("BS-intercambios = " + ci+"\n");
        return new DatosOrdenados(arreglo);
    }
    
       
    
    public DatosOrdenados insertSort(){
         // obtener una copia de los datos desordenados
        int [] a = this.getCopiaValores();
        
	int i, j, aux; 
	int cont=0; 
	for ( i = 1; i < a.length; i++){
		j = i;
		aux = a[i];
		while (j >0 && aux < a[j-1]){
                   cont++;
                   a[j] = a[j-1];
                   j--; 
		}
		a[j] = aux; 
	}
        System.out.println("IS-comparaciones = " + cont);
        Ordenamientos.ta.append("IS-comparaciones = " + cont+"\n");
	// devolver los datos ordenados
        return new DatosOrdenados(a);
    }
    public DatosOrdenados insertSortD(){
         // obtener una copia de los datos desordenados
        int [] a = this.getCopiaValores();
        
	int i, j, aux; 
	int cont=0; 
	for ( i = 1; i < a.length; i++){
		j = i;
		aux = a[i];
		while (j >0 && aux > a[j-1]){
                   cont++;
                   a[j] = a[j-1];
                   j--; 
		}
		a[j] = aux; 
	}
        System.out.println("IS-comparaciones = " + cont);
        Ordenamientos.ta.append("IS-comparaciones = " + cont+"\n");
	// devolver los datos ordenados
        return new DatosOrdenados(a);
    }
    
    public DatosOrdenados mergeSort(){
    int [] x = this.getCopiaValores();
	// Aquí va la llamada al método mergesort( arreglo, l, r)
	this.mergesort( x, 0, x.length - 1);
        System.out.println("MS-comparaciones = " + cm);
        Ordenamientos.ta.append("MS-comparaciones = " + cm+"\n");
	return new DatosOrdenados(x);
    } // fin del método ordenacionMerge
    
   private void mergesort (int v[], int l, int r) {
		 int m = (r+l)/2; 
		 if (r > l) { 
                     cm++;
			 mergesort (v, l, m);
			 mergesort (v, m+1, r); 
			 merge (v, l, m, r); 
		 }
   }
   static int cm = 0;//Variable de clase
   private void merge (int v[], int l, int m, int r){
	//Encuentra el tamaño de los sub-vectores para unirlos.
	  int n1 = m - l + 1;
	  int n2 = r - m;

	  //Vectores temporales.
	  int arrIzq[] = new int [n1];
	  int arrDer[] = new int [n2];

	  //Copia los datos a los arreglos temporales.
	  for (int i=0; i < n1; i++) {
              cm++;
              arrIzq[i] = v[l+i];
	  }
	  for (int j=0; j < n2; j++) {
              cm++;
              arrDer[j] = v[m + j + 1];
	  }
	  // Combinación (mezcla) de los dos arreglos:
	  int i = 0, j = 0;
	  int k = l;
	  while(i < n1 && j < n2){//Ordenamiento.
              cm++;
              if (arrIzq[i] <= arrDer[j]) {
                  v[k] = arrIzq[i];
                  i++;
              }else{
                  v[k] = arrDer[j];
                  j++;
              }
              k++;
	  }//Fin del while.

	  /* Si quedan elementos por ordenar */
	  //Copiar los elementos restantes de arrIzq[].
	  while(i < n1){
              cm++;
              v[k] = arrIzq[i];
              i++;
              k++;
	  }
	  //Copiar los elementos restantes de arrDer[].
	  while(j < n2){
              cm++;
              v[k] = arrDer[j];
              j++;
              k++;
	  }
	}

    public DatosOrdenados Shellsort(){
      int [] a = this.getCopiaValores();

            int salto, aux, i, cont1 = 0, cont2 = 0;
            boolean cambios;


            for (salto = a.length / 2; salto != 0; salto /= 2) {
                cont1++;
                cambios = true;
                while (cambios) {   // Mientras se intercambie algún elemento                                         
                    cont1++;
                    cambios = false;
                    for (i = salto; i < a.length; i++){// se da una pasada
                        cont1++;
                        if (a[i - salto] > a[i]) {       // y si están desordenados
                            cont2++;
                            aux = a[i];                  // se reordenan
                            a[i] = a[i - salto];
                            a[i - salto] = aux;
                            cambios = true;              // y se marca como cambio.                                   
                        }
                    }
                }
            }
            System.out.println("SS-iteraciones = " + cont1);
            Ordenamientos.ta.append("SS-iteraciones = " + cont1+"\n");
            System.out.println("SS-comparaciones = " + cont2);
            Ordenamientos.ta.append("SS-comparaciones = " + cont2+"\n");
            return new DatosOrdenados(a);       
    }
    public DatosOrdenados ShellsortD(){
      int [] a = this.getCopiaValores();

            int salto, aux, i, cont1 = 0, cont2 = 0;
            boolean cambios;


            for (salto = a.length / 2; salto != 0; salto /= 2) {
                cont1++;
                cambios = true;
                while (cambios) {   // Mientras se intercambie algún elemento                                         
                    cont1++;
                    cambios = false;
                    for (i = salto; i < a.length; i++){// se da una pasada
                        cont1++;
                        if (a[i - salto] < a[i]) {       // y si están desordenados
                            cont2++;
                            aux = a[i];                  // se reordenan
                            a[i] = a[i - salto];
                            a[i - salto] = aux;
                            cambios = true;              // y se marca como cambio.                                   
                        }
                    }
                }
            }
            System.out.println("SS-iteraciones = " + cont1);
            Ordenamientos.ta.append("SS-iteraciones = " + cont1+"\n");
            System.out.println("SS-comparaciones = " + cont2);
            Ordenamientos.ta.append("SS-comparaciones = " + cont2+"\n");
            return new DatosOrdenados(a);       
    }
/*static void Impresion (int[] numeros){
    for (int i = 0; i < numeros.length; i++){
        System.out.println("["+numeros[i]+"]");
    }
}*/

   public DatosOrdenados QuicksortA(){
       int [] q = this.getCopiaValores();
       this.QuicksortA(q, 0, q.length - 1);
       System.out.println("QS-comparaciones = " + cq1);
       Ordenamientos.ta.append("QS-comparaciones = " + cq1+"\n");
       System.out.println("QS-iteraciones = " + cq2);
       Ordenamientos.ta.append("QS-iteraciones = " + cq2+"\n");
       return new DatosOrdenados(q);
   }
   static int cq1 = 0;
   static int cq2 = 0;
   private void QuicksortA(int[] arr, int low, int high){
        if(low < high){
            cq1++;
            int pi = QuickA(arr, low, high);
            
            QuicksortA(arr, low, pi - 1);
            QuicksortA(arr, pi + 1, high);
        }
   }
   private int QuickA(int[] arr, int low, int high){
       int pivote = arr[high];
       
       int i = (low - 1);
       
       for(int j = low; j <= high - 1; j++){
           cq2++;
           if(arr[j] < pivote){
               cq1++;
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
   public DatosOrdenados QuicksortD(){
       int [] q = this.getCopiaValores();
       this.QuicksortD(q, 0, q.length - 1);
       System.out.println("QS-comparaciones = " + cq3);
       Ordenamientos.ta.append("QS-comparaciones = " + cq3+"\n");
       System.out.println("QS-iteraciones = " + cq4);
       Ordenamientos.ta.append("QS-iteraciones = " + cq4+"\n");
       return new DatosOrdenados(q);
   }
   static int cq3 = 0;
   static int cq4 = 0;
   private void QuicksortD(int[] arr, int low, int high){
        if(low < high){
            cq3++;
            int pi = QuickD(arr, low, high);
            
            QuicksortD(arr, low, pi - 1);
            QuicksortD(arr, pi + 1, high);
        }
   }
   private int QuickD(int[] arr, int low, int high){
       int pivote = arr[high];
       
       int i = (low - 1);
       
       for(int j = low; j <= high - 1; j++){
           cq4++;
           if(arr[j] > pivote){
               cq3++;
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
   public DatosOrdenados Radixsort(){
       int [] r = this.getCopiaValores();
       this.Radixsort(r, r.length);
       System.out.println("QS-comparaciones = " + cr1);
       Ordenamientos.ta.append("QS-comparaciones = " + cr1+"\n");
       System.out.println("QS-iteraciones = " + cr2);
       Ordenamientos.ta.append("QS-iteraciones = " + cr2+"\n");
       return new DatosOrdenados(r);
   }
   static int cr1 = 0;
   static int cr2 = 0;
   private void Radixsort(int arr[], int n){
        int mx = arr[0];
        for (int i = 1; i < n; i++){
            cr2++;
            if (arr[i] > mx){
                cr1++;
                mx = arr[i];
            }
        }
        int m = mx;
 
        for (int exp = 1; m / exp > 0; exp *= 10){
            cr2++;
            Radix(arr, n, exp);
        }
   }
   private void Radix(int arr[], int n, int exp){
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
 
        for (i = 0; i < n; i++){
            cr2++;
            count[(arr[i] / exp) % 10]++;
        }
 
        for (i = 1; i < 10; i++){
            cr2++;
            count[i] += count[i - 1];
        }
 
        for (i = n - 1; i >= 0; i--) {
            cr2++;
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
 
        for (i = 0; i < n; i++){
            cr2++;
            arr[i] = output[i];
        }
    }
   public DatosOrdenados RadixsortD(){
       int [] r = this.getCopiaValores();
       this.RadixsortD(r, r.length);
       System.out.println("QS-comparaciones = " + cr3);
       Ordenamientos.ta.append("QS-comparaciones = " + cr3+"\n");
       System.out.println("QS-iteraciones = " + cr4);
       Ordenamientos.ta.append("QS-iteraciones = " + cr4+"\n");
       return new DatosOrdenados(r);
   }
   static int cr3 = 0;
   static int cr4 = 0;
   private void RadixsortD(int arr[], int n){
        int mx = arr[0];
        for (int i = 1; i < n; i++){
            cr4++;
            if (arr[i] < mx){
                cr3++;
                mx = arr[i];
            }
        }
        int m = mx;
 
        for (int exp = 1; m / exp > 0; exp *= 10)
            RadixD(arr, n, exp);
   }
   private void RadixD(int arr[], int n, int exp){
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
 
        for (i = 0; i < n; i++){
            cr4++;
            count[(arr[i] / exp) % 10]++;
        }
 
        for (i = 1; i < 10; i++){
            cr4++;
            count[i] += count[i - 1];
        }
 
        for (i = n - 1; i >= 0; i--) {
            cr4++;
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
 
        for (i = 0; i < n; i++){
            cr4++;
            arr[i] = output[i];
        }
    }
   @Override
    public String toString(){
        String cad = "Datos DESORDENADOS: ";
        for (int x : valores){
            cad += x + ", ";
        }
        return cad;
    }
}
