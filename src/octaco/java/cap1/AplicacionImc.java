package octaco.java.cap1;

public class AplicacionImc {

  public static void main(String[] args) {
        // TODO code application logic here
      Imc xxx=new Imc();
      System.out.println(xxx.getEstatura());
      System.out.println(xxx.getPeso());
      System.out.println(xxx.calcular());
          
      
      Imc c =new Imc(55.5f,10.9f);
    }
    
}
