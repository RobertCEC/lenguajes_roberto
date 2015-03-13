package TareaThread;

public class Nombres extends Thread{
    public void run(){
    try{
        Thread.sleep(3000);
       
       
       System.out.println("Josue");
    }catch(InterruptedException e){  }
    
    try{
        Thread.sleep(3000);
       
       
       System.out.println("Robinson");
    }catch(InterruptedException e){  }
    
    try{
        Thread.sleep(3000);
       
       
       System.out.println("charly");
    }catch(InterruptedException e){  }
   } 
}
