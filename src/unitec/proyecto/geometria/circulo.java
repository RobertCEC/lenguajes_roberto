package unitec.proyecto.geometria;

public class circulo implements Superficie{
     
   private float radio;

    public circulo(float radio) {
        this.radio = radio;
    }

   public float calcularArea(){
        System.out.print("El area de circulo es:");
        return 3.1416f*radio*radio;
    }
 

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }


}

