package Guia;

public class VoidEdad {
    public static void validar (int Edad) throws EdadNoNegativaException{
        if(Edad<0) throw new EdadNoNegativaException();
        
    }
}
