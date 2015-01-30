package Rectangulo;

public class Rectangulo {
    private int ladomayor;
    private int ladomenor;
    
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
    
    
    public int calculatArea1(){
        int area= ladomayor*ladomenor;
        return area;
    }
    
}
