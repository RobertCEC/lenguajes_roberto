package Poyecto;

public class Fotos {

     private String titulo;
    private String url;
    private String descripcion;
    
    public Fotos(){
        }

    public Fotos(String titulo, String url, String descripcion) {
        this.titulo = titulo;
        this.url = url;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
