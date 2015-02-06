package Cuadrado;


public class Cuadrado {
     int lado;
     void setLado(int lado){
        this.lado=lado;
    }
    public int getLado(){
        return lado;
    }
    public int calculatArea(){
        int area= lado*lado;
        return area;
    }
    
    public Cuadrado(){
        lado=4;
    }
    public Cuadrado (int lado){
     this.lado=lado;   
    }
    
}
