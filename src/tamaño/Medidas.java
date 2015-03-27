package tamaño;

public class Medidas {

    public static void main(String[] args) {
       Vasos tipo=new Vasos();
       tipo.setTamano(Tamano.CHICO);
       System.out.println("el estado de la tamaño es:"+tipo.getTamano());
    }
    
}
