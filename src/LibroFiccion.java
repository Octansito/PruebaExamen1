import java.util.Collections;
import java.util.Comparator;

public class LibroFiccion extends Libro implements Buscable{
    private String genero;


    public LibroFiccion(String titulo, String fechaPubli, String autor, String editorial, int num_Edicion, String genero){
        super(titulo, fechaPubli, autor, editorial, num_Edicion);
        this.genero=genero;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    public  String getGenero(){
        return genero;
    }
    @Override
    public void buscarPorTitulo(){

    }


    @Override
    public void buscarPorAutor(){

    }
    public void clasificacion(){
        System.out.println("Es clasificado como para mayores de 18");
    }

    @Override
    public String toString(){
        return "Titulo: "+titulo+
                ", fecha de publicación: "+fechaPubli+
                ", autor: "+autor+
                ", editorial: "+editorial+
                ", edicion "+ num_Edicion+
                ", genero: "+genero;


    }

}
