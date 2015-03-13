package com.capitulo.threads;

public class ProbarThreads {

 
    public static void main(String[] args) {
        System.out.println("Probar Threads");
        
     
       // 1.- crearlo
      ManeraFacil t1=new ManeraFacil();
      ManeraFacil t11=new ManeraFacil();
      Relojito treloj=new Relojito();
       //t1.setName("petra");
       //2.- Inicializado
       t1.start();
       t11.start();
       treloj.start();
        //Regular
        Regular r1=new Regular();
        Thread t2=new Thread (r1);
       t2.start();
       
       //dificil
       Thread t3=new Thread(
       new Runnable(){

           
            public void run() {
                System.out.println("soy mas mejorrrrrrrr");   
            }
           
       });
       t3.start();
       
       
    }
    
}
