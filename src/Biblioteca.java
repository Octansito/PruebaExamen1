import java.util.*;

public class Biblioteca {
    public static void main (String [] args){
        ArrayList<Libro> libros= new ArrayList<Libro>();
        libros.add(new LibroNoFiccion("Harry Potter", "6 de Enero", "Lenoir", "Paris", 16, "Viajes"));
        libros.add(new LibroFiccion("Harry Potter", "10 de Noviembre", "JK Rowling", "ANAYA", 4, "Novela"));
        libros.add(new LibroNoFiccion("El viaje de Chihiro", "15 de Septiembre", "JK Chihiro", "Editorial Chiki", 3, "Fantasía"));
        libros.add(new LibroFiccion("El Mascapitos", "18 de Noviembre", "Mascar Pitos", "Mundano", 2, "Tragedia"));
       // Collections.sort(libros);

        /**
         * La diferencia del array de arryba al de abajo es que en el primero puedo crear objetos Libro y objetos como sus clases
         * hijas (LibroFiccion, LibronoFiccion) y en la lista de abajo solo puedo crear objetos de tipo LibroFiccion
         */
        //Creo nuevo arraList para meter los librosNoFiccion del arrayList libros donde están todos ellos
        ArrayList<LibroNoFiccion>librosNoFiccion=new ArrayList<>();
        //Compruebo que los elementos de un arraylist pertenecen a LibrosNoFiccion
        for(Libro libro: libros){
            if(libro instanceof LibroNoFiccion){
                librosNoFiccion.add((LibroNoFiccion) libro);
            }
        }
        //Añado un nuevo libro a la lista LibrosNoFiccion
        librosNoFiccion.add(new LibroNoFiccion("B", "C", "D", "E", 4, "Almendra"));
        //Comparo y ordeno en funcion del tema
        Collections.sort(librosNoFiccion, LibroNoFiccion.libroNoFiccionComparator );
        //Imprimo el arraylist//
                //Clase    //elemento   //Array
        for(LibroNoFiccion librosNF: librosNoFiccion){
            System.out.println(librosNF);
        }
        //o

        for(int cont=0; cont<librosNoFiccion.size();cont++){
            System.out.println(librosNoFiccion.get(cont));
        }



        //Imprimir el array
        //for(int cont=0; cont<libros.size(); cont++){
        //System.out.println(libros.get(cont));
       // }

        int[][] miArray={{2,5,6,4,1},{6,4,1},{7,9,8,2,5,1,4,6}};
        for(int i=0; i<miArray.length;i++){
            for(int j=0; j<miArray[i].length;j++){
                System.out.print(miArray[i][j]);
            }
            System.out.println();
        }
        //Sustituir valores de la fila 1 por los que quiera el usuario
        Scanner sc=new Scanner(System.in);
        for(int cont=0; cont<miArray[1].length;cont++){
            System.out.println("Introduce valores");
            int j= sc.nextInt();
            miArray[1][cont]=j;
        }
        //Volvemos a recorrer el array
        for(int i=0; i<miArray.length;i++){
            for(int j=0; j<miArray[i].length;j++){
                System.out.print(miArray[i][j]);
            }
            System.out.println();
        }


    }
}
