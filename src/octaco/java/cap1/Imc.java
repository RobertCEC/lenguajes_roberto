/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octaco.java.cap1;

/**
 *
 * @author T-107
 */
public class Imc {
    private float estatura;
   private  float peso;
    
  public float calcular (float estatura, float peso){
    float algo=peso/(estatura*estatura);
    return algo; 
}
    
}
