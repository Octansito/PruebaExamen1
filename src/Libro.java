import java.util.Collection;

public abstract class Libro implements Comparable <Libro>{
    protected String titulo;
    protected String fechaPubli;
    protected String autor;
    protected String editorial;
    protected int num_Edicion;

    public Libro(String titulo, String fechaPubli, String autor, String editorial, int num_Edicion){
        this.titulo=titulo;
        this.fechaPubli=fechaPubli;
        this.autor=autor;
        this.editorial=editorial;
        this.num_Edicion=num_Edicion;
    }
    public int compareTo(Libro libro){
        int orden=this.titulo.compareTo(libro.titulo);
        if (orden==0){
            orden=this.autor.compareTo(libro.autor);
                if(orden==0){
                    orden=this.fechaPubli.compareTo((libro.fechaPubli));
                }
        }
        return orden;

    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaPubli() {
        return fechaPubli;
    }

    public void setFechaPubli(String fechaPubli) {
        this.fechaPubli = fechaPubli;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNum_Edicion() {
        return num_Edicion;
    }

    public void setNum_Edicion(int num_Edicion) {
        this.num_Edicion = num_Edicion;
    }
    public String toString(){
        return "Titulo: "+titulo+
                ", fecha de publicación: "+fechaPubli+
                ", autor: "+autor+
                ", editorial: "+editorial+
                ", edicion "+ num_Edicion;

    }
}
