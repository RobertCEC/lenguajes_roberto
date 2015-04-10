package Serializacion1;

public class ProbarSerializacion {

    public static void main(String[] args) {
       
        //cremos usuario
        Usuario u=new Usuario();
        u.setEmail("dufflescheese@hotmail.com");
        u.setNombre(null);
        u.setSueldo(44);
      
        //lo guardamos
        PersistenciaUsuarios per=new PersistenciaUsuarios();
        try{
            per.guardar(u);
            System.out.println("Ususrio guardado con exito");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
