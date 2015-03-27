
package Enumeraciones;

public class Probarnumeraciones {

   public static void main(String[] args) {
      
       Maquinabuena maquina=new Maquinabuena();
       maquina.setEstado(Estadodemaquina.LINEA);
       System.out.println("el estado de la maquina es:"+maquina.getEstado());
       
    }
    
}
