package unitec.proyecto.geometria;

import java.util.*; 

public class GenerarSuperficies {
    
    public static ArrayList<Superficie>obtenerFiguras()throws Exception{
        ArrayList<Superficie>figuritas=new ArrayList<Superficie>();
        Cuadrado cu1=new Cuadrado(12);
        Cuadrado cu2=new Cuadrado(14);
        Cuadrado cu3=new Cuadrado(13);
        
        Rectangulo re1=new Rectangulo(12,4);
        
        Triangulo tr1=new Triangulo(14, 15);
        Triangulo tr2=new Triangulo(6, 3);
        
        circulo ci1=new circulo(45);
        circulo ci2=new circulo(12);
        
        figuritas.add(cu1);
        figuritas.add(cu2);
        figuritas.add(cu3);
        figuritas.add(re1);
        figuritas.add(tr1);
        figuritas.add(tr2);
        figuritas.add(ci1);
        figuritas.add(ci2);
        
         return figuritas;
    }
    
}
