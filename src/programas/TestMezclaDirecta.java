package programas;

import Orden_externo.MezclaDirecta;
import java.io.File;

public class TestMezclaDirecta {

    public static void main(String[] args) {
        MezclaDirecta md = new MezclaDirecta();
        md.mezclaDirecta(new File("datos.txt"), 1000);
    }
    
}
