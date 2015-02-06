package Rectangulo;

public class Rectangulo {
     int ladomayor;
     int ladomenor;
    
    public void setLadomayor(int ladomayor){
        this.ladomayor=ladomayor;
    }
     public void setLadomenor(int ladomenor){
        this.ladomenor=ladomenor;
    }
    public int getLadomayor(){
        return ladomayor;
    }
    public int getLadomenor(){
        return ladomenor;
    }
    
    
    public int calculatArea(){
        int area= ladomayor*ladomenor;
        return area;
    }
    
    public Rectangulo(){
        ladomayor=40;
        ladomenor=20;
    }
    
     public Rectangulo(int ladomayor, int ladomenor){
     this.ladomayor=ladomayor;
     this.ladomenor=ladomenor;
    }
}
