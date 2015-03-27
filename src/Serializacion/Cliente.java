
package Serializacion;

import java.io.Serializable;

public class Cliente implements Serializable{
  private String nombre;
  private float sueldo;
  private Direccion direccion;

    public Cliente(String nombre, float sueldo, Direccion direccion) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
  
}
