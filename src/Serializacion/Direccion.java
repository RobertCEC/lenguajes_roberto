
package Serializacion;

import java.io.Serializable;


public class Direccion implements Serializable {
  private String colonia;
  private String municipio;
  private String Estado;

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Direccion(String colonia, String municipio, String Estado) {
        this.colonia = colonia;
        this.municipio = municipio;
        this.Estado = Estado;
    }
  
  
}
