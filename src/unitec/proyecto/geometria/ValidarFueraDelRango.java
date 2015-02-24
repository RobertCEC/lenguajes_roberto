package unitec.proyecto.geometria;

public class ValidarFueraDelRango {
    
    public static void rango(float valor) throws FueraDelRango{
        if((valor<10)||(valor>20)){
            throw new FueraDelRango();
        } 
    }
    
}
