package unitec.proyecto.geometria;

public class Cuadrado {
  
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
            
    float calcularArea(){
    float area=lado*lado;
    return area;
    
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) throws NumeroNoNegativoException {
        ValidarValorNoNegativo.validar(lado);
        this.lado = lado;
    }
}
