/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octaco.java.cap1;


public class Imc {
   private float estatura;

    public Imc(float estatura, float peso) {
        this.estatura = estatura;
        this.peso = peso;
    }
   private  float peso;
    
  public void setPeso(float peso){
   this.peso=peso;
   }

    public void setEstatura(float estatura){
   this.estatura=estatura;
 
}
public float calcular(){
    return peso/(estatura*estatura);
   
    
}
public Imc(){
    peso=12.5f;
    estatura=22.8f;
}

    public float getEstatura() {
        return estatura;
    }

    public float getPeso() {
        return peso;
    }
}
