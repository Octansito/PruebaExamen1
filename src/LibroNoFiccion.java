import java.util.Comparator;

public class LibroNoFiccion extends Libro implements Buscable {
    protected String tema;

    public LibroNoFiccion(String titulo, String fechaPubli, String autor, String editorial, int num_Edicion, String tema) {
        super(titulo, fechaPubli, autor, editorial, num_Edicion);
        this.tema = tema;

    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    @Override
    public void buscarPorTitulo() {

    }

    @Override
    public void buscarPorAutor() {

    }


    @Override
    public String toString() {
        return "Titulo: " + titulo +
                ", fecha de publicación: " + fechaPubli +
                ", autor: " + autor +
                ", editorial: " + editorial +
                ", edicion " + num_Edicion +
                ", tema: " + tema;

    }

    public static Comparator<LibroNoFiccion> libroNoFiccionComparator = new Comparator<LibroNoFiccion>() {
        @Override
        public int compare(LibroNoFiccion o1, LibroNoFiccion o2) {
            return o1.getTema().compareTo(o2.getTema());
        }
    };
}


