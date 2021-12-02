package Orden_externo;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class ArchivoDatos {

    public static void main(String[] args) {
        int n = 1000;
        int lim = 500;
        try(PrintStream ps = new PrintStream(new File("datos.txt"))){
            for(int i=0;i<n;i++){
                ps.println((int)(Math.random()*lim)+1);
            }
        }catch(IOException e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
