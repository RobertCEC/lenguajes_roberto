package unitec.proyecto.geometria;

public class TextSuperficie {

  public static void main(String[] args)throws Exception{
       for(Superficie s:GenerarSuperficies.obtenerFiguras()){
           System.out.println(s.calcularArea());
       }
    }
    
}
