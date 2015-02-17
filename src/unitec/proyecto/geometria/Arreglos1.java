
package unitec.proyecto.geometria;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Arreglos1 {
     
    public static void main(String[] args) {
        int x[]=new int[3];
        int []y=new int[3];
        int z[]={1,-200,45};
        // int w=new int[];
        // intj[3]=new int[];
        // int m[4]=new int[4];
        // int []n= {1,4.5,5}
        
        x[0]=127;
        x[1]=200;
        x[2]=-23;
        //[3]=12;
        
        // multiplr lineas de comentario /* */ con for antiguo
        /*for(int i=0;i<x.length;i++){
            System.out.print(x[i]);
        }*
        System.out.println("si ocurre la exepcion"
                + "nunca me veras");*/
        
        for(int algodon:x){
        System.out.println(algodon);
    }
        int a=2;
        float b=0;
        System.out.println(a/b);
    }
  
}