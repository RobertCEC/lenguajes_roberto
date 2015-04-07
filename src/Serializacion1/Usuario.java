package Serializacion1;

import java.io.Serializable;


public class Usuario implements Serializable {
    private String nombre;
    private float sueldo;
    private String email;

    public Usuario(String nonbre, float sueldo, String email) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.email = email;
    }
   public Usuario(){
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nonbre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }   
}
