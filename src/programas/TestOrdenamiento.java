package programas;

import datos.DatosDesordenados;
import datos.DatosOrdenados;
import javax.swing.JOptionPane;

/**
 *
 * @author Noemí Lara Acono
 */
public class TestOrdenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DatosDesordenados m;
        //DatosOrdenados datosOrd;
        int n, s; 
        long t, t1, t2;
        
        n = Integer.parseInt(JOptionPane.showInputDialog(
                "¿Cuántos datos son?"));
        s = Integer.parseInt(JOptionPane.showInputDialog(
                "¿Cuál es el valor máximo?"));
        
        m = new DatosDesordenados(s, n);
        m.generarValores();
        System.out.println("" + m);
        
            t1 = System.nanoTime();   // start
            //DatosOrdenados mob = m.bubbleSort();
            t2 = System.nanoTime();   // stop
            t= t2 - t1;
            //System.out.println("n = "+ n + " t = " + t + " ns. Burbuja Asendente = " + mob);
            t1 = System.nanoTime();   // start
            DatosOrdenados mobd = m.bubbleSortD();
            t2 = System.nanoTime();   // stop
            t= t2 - t1;
            System.out.println("n = "+ n + " t = " + t + " ns. Burbuja Descendente = " + mobd);
            t1 = System.nanoTime();   // start
            DatosOrdenados moi = m.insertSort();
            t2 = System.nanoTime();   // stop
            t = t2 - t1;
            System.out.println("n="+ n + " t=" + t + " ns. Inserción Ascendente = " + moi);
            t1 = System.nanoTime();   // start
            DatosOrdenados moid = m.insertSortD();
            t2 = System.nanoTime();   // stop
            t = t2 - t1;
            System.out.println("n="+ n + " t=" + t + " ns. Inserción Descendente = " + moid);
            t1 = System.nanoTime();   // start
            DatosOrdenados rad = m.Radixsort();
            t2 = System.nanoTime();   // stop
            t = t2 - t1;
            System.out.println("n = "+ n + " t = " + t + " ns. Radix " + rad);
            t1 = System.nanoTime();   // start
            DatosOrdenados moq = m.QuicksortA();
            t2 = System.nanoTime();   // stop
            t = t2 - t1;
            System.out.println("n = "+ n + " t = " + t + " ns. QuickSort Ascendente = " + moq);
            t1 = System.nanoTime();   // start
            DatosOrdenados moqd = m.QuicksortD();
            t2 = System.nanoTime();   // stop
            t = t2 - t1;
            System.out.println("n = "+ n + " t = " + t + " ns. QuickSort Descendente = " + moqd);
            t1 = System.nanoTime();   // start
            DatosOrdenados mos = m.Shellsort();
            t2 = System.nanoTime();   // stop
            t = t2 - t1;
            System.out.println("n = "+ n + " t = " + t + " ns. ShellSort Ascendente " + mos);
            t1 = System.nanoTime();   // start
            DatosOrdenados mosd = m.ShellsortD();
            t2 = System.nanoTime();   // stop
            t = t2 - t1;
            System.out.println("n = "+ n + " t = " + t + " ns. ShellSort Descendente " + mosd);
    }
    
}
