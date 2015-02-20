package unitec.proyecto.geometria;
 
public class NumeroNoNegativoException extends Exception {
    
    public NumeroNoNegativoException(){
        super("no acepto numeros negativos");
    }
}
