package Poyecto;
import java.util.ArrayList;
public class Galeria {
    ArrayList<Fotos> imagenes;
    
    public Galeria() {
        imagenes =new ArrayList<Fotos>();
        Fotos i1=new Fotos();
        i1.setUrl("/Proyecto/1.png");
        i1.setTitulo("Ferrari");
        i1.setDescripcion("Hecho en Italia");
        
        imagenes =new ArrayList<Fotos>();
        Fotos i2=new Fotos();
        i2.setUrl("/Proyecto/2.png");
        i2.setTitulo("Chevrolet");
        i2.setDescripcion("Hecho en Estados Unidos");
        
        imagenes =new ArrayList<Fotos>();
        Fotos i3=new Fotos();
        i3.setUrl("/Proyecto/1.png");
        i3.setTitulo("Ferrari 911");
        i3.setDescripcion("Uno de los primerosa carros que creo ferrari");
        
        imagenes =new ArrayList<Fotos>();
        Fotos i4=new Fotos();
        i4.setUrl("/Proyecto/4.png");
        i4.setTitulo("Camaro");
        i4.setDescripcion("Creado por chavrolet desde 1967");
        
        imagenes =new ArrayList<Fotos>();
        Fotos i5=new Fotos();
        i5.setUrl("/Proyecto/5.png");
        i5.setTitulo("Corvette");
        i5.setDescripcion("es un automóvil deportivo fabricado por la marca estadounidense Chevrolet desde el año 1953");
        
        imagenes =new ArrayList<Fotos>();
        Fotos i6=new Fotos();
        i6.setUrl("/Proyecto/6.png");
        i6.setTitulo("Lamghini");
        i6.setDescripcion("fabricante italiano de automóviles deportivos fundado en 1963");
        
         imagenes =new ArrayList<Fotos>();
        Fotos i7=new Fotos();
        i7.setUrl("/Proyecto/7.png");
        i7.setTitulo("Lamghini");
        i7.setDescripcion("fabricado en Japon fundado en 1920");
        
         imagenes =new ArrayList<Fotos>();
        Fotos i8=new Fotos();
        i8.setUrl("/Proyecto/8.png");
        i8.setTitulo("Lamghini");
        i8.setDescripcion("sede japonesa fundado en 26 de diciembre de 1933 ");
        
        imagenes.add(i1);
        imagenes.add(i2);
        imagenes.add(i3);
        imagenes.add(i4);
        imagenes.add(i5);
        imagenes.add(i6);
        imagenes.add(i7); 
        imagenes.add(i8);
    }
    public ArrayList<Fotos> leerTodas() {
        return imagenes;
    }
    
    public void setImagenes(ArrayList<Fotos> imagenes) {
        this.imagenes = imagenes;
    }
}
