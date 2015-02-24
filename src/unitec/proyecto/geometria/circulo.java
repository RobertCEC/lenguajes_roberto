package unitec.proyecto.geometria;

public class circulo implements Superficie{
     
   private float radio;

    public circulo(float radio) {
        this.radio = radio;
    }

   public float calcularArea(){
        
        return 3.1416f*radio*radio;
    }
 

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public float calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

