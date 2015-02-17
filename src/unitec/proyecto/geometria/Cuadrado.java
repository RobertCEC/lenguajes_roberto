package unitec.proyecto.geometria;

public class Cuadrado {
  
    private float lado;
    
    /**
     *este es un constructor de tipo flotante 
     * @param lado  este parametro que debes de ingresar
     * es el valor de lado
     */
    public Cuadrado(float lado){
        this.lado=lado;
    }
    
    public Cuadrado(){
        
    }
            
    float calcularArea(){
    float area=lado*lado;
    return area;
    
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
}
