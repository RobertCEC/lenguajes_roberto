package unitec.proyecto.geometria;

public class Cuadrado implements Superficie{
  
    private float lado;
    
    public Cuadrado(float lado) throws NumeroNoNegativoException {
        ValidarValorNoNegativo.validar(lado);
        this.lado=lado;
    }
    
    /**
     *este es un constructor de tipo flotante 
     * @param lado  este parametro que debes de ingresarh
     * es el valor de lado
     */
  
    public Cuadrado(){
        
    }
            
   public float calcularArea(){
       System.out.print("el area del cuadrado es:");
       return lado*lado;
    
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) throws FueraDelRango,NumeroNoNegativoException {
        ValidarValorNoNegativo.validar(lado);
        ValidarFueraDelRango.rango(lado);
        this.lado = lado;
    }
    
     
}
