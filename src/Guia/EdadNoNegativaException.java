package Guia;

public class EdadNoNegativaException extends Exception {
    public EdadNoNegativaException(){
        super("no acepto edades negativas");
    }
}
