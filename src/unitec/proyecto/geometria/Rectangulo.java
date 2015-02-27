package unitec.proyecto.geometria;


public class Rectangulo implements Superficie{
    
    private float LadoMayor;
    private float LadoMenor;

    public float getLadoMayor() {
        return LadoMayor;
    }

    public void setLadoMayor(float LadoMayor) {
        this.LadoMayor = LadoMayor;
    }

    public Rectangulo(float LadoMayor, float LadoMenor) {
        this.LadoMayor = LadoMayor;
        this.LadoMenor = LadoMenor;
    }

    public float getLadoMenor() {
        return LadoMenor;
    }

    public void setLadoMenor(float LadoMenor) {
        this.LadoMenor = LadoMenor;
    }
    public float calcularArea(){
        System.out.print("el area del rectangulo es:");
        return LadoMenor*LadoMayor;
    }
}
