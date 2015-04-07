package Serializacion1;

import java.io.*;
 
public class PersistenciaUsuarios {
    
    public void guardar(Usuario u)throws Exception{
        //paso1
        File file=new File("D:\\archivaldo.yo");
        
        //paso2
        FileOutputStream fos= new FileOutputStream(file);
        
        //paso3 llenat algo con un usuario
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(u);
        oos.close();
    }
   public Usuario leer()throws Exception{
        File file=new File("D:\\archivaldo.yo");
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ios=new ObjectInputStream(fis);
        Usuario u=new Usuario();
        u= (Usuario)ios.readObject();
        return u;
   }
}
