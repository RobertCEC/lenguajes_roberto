package Guia;
public class TestAnimal {

 public static void main(String[] args) {
        for(Animal a: GeneralAnimales.generarAnimales()){
        System.out.println(a.getNombre());
        }
    }
    
}
