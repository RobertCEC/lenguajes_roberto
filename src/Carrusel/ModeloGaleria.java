
package Carrusel;

import java.util.*;
public class ModeloGaleria {
    
    public static ArrayList<Galeria> generalGaleria(){
        ArrayList<Galeria> arreglo=new ArrayList<Galeria>();
        Galeria g1=new Galeria("Titulo1", "mi descripcion 1", "/Carrusel/uno.jpg");
        Galeria g2=new Galeria("Titulo2", "mi descripcion 2", "/Carrusel/dos.jpg");
        Galeria g3=new Galeria("Titulo3", "mi descripcion 3", "/Carrusel/tres.jpg");
        
        arreglo.add(g1);
        arreglo.add(g2);
        arreglo.add(g3);
        return arreglo;
    }
}
 