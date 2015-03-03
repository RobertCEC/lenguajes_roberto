package Guia;
import java.util.*;
public class GeneralAnimales {
    public static ArrayList<Animal> generarAnimales(){
        ArrayList <Animal> animales=new ArrayList<Animal>();
        Animal a1= new Animal ("leon",2);
        Animal a2= new Animal ("delfin",5);
        
        animales.add(a1);
        animales.add(a2);
        
        return animales;
    }
}
