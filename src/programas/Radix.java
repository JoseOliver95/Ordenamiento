package programas;

public class Radix {
    
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
            Radix(arreglo);
            System.out.println("");
        }
        
        public static void Radix(int [] arreglo){
        int x,i,j=0;
       
        for (x = Integer.SIZE - 1; x >= 0; x--){
            int aux[] = new int[arreglo.length];
            j=0;
            for(i=0;i<arreglo.length;i++){
                
                boolean mover = arreglo[i]<<x>=0;
        
                if(x==0 ? !mover:mover){
                    aux[j] = arreglo[i];
                    j++;
                }else{
                    arreglo[i-j]=arreglo[i];
                }
            }
            for(i=j;i<aux.length;i++){
                aux[i]=arreglo[i-j];
            }
            arreglo=aux;
        }
        mostrar(arreglo);
	}
        public static void mostrar(int[] arreglo){
            int k;
            for (k=0;k<arreglo.length;k++){
                System.out.print("["+arreglo[k]+"]");
            }
            System.out.println();
        }
}
