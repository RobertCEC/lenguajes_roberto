package unitec.proyecto.geometria;

public class ValidarFueraDelRango {
    
    public static void rango(float valor) throws FueraDelRango{
        if((valor<10)||(valor>10)){
            throw new FueraDelRango();
        } 
    }
    
}
