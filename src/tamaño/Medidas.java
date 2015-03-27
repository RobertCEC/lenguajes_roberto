package tamaño;

public class Medidas {

    public static void main(String[] args) {
       Vasos tipo=new Vasos();
       tipo.setTamano(Tamano.GRANDE);
       System.out.println(" tamaño del vaso es:"+tipo.getTamano());
    }
    
}
