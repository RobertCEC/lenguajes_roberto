package Cuadrado;


public class Cuadrado {
    private int lado;
    public void setLado(int lado){
        this.lado=lado;
    }
    public int getLado(){
        return lado;
    }
    public int calculatArea(){
        int area= lado*lado;
        return area;
    }
}
