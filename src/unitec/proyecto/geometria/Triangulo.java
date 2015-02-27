package unitec.proyecto.geometria;

public class Triangulo implements Superficie{
    
    private float base;
    private float altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float calcularArea(){
        System.out.print("el area del triangulo es:");
        return (base*altura)/2;
    }
}
