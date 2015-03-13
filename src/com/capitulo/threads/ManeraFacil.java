
package com.capitulo.threads;


public class ManeraFacil extends Thread{
   public void run(){
    try{
        Thread.sleep(3000);
       System.out.println("soy un thread facil");
       String nombre=Thread.currentThread().getName();
       System.out.println("soy el"+nombre);
    }catch(InterruptedException e){  }
   } 
}
