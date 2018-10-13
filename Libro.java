import java.lang.*;
public class Libro {

    public static void main(String[] args) {


        libros L1 = new libros( 978-84-617-0021-9,"Esteganografía y Estegoanálisis", "Jordi Serra y Daniel Lerch", 240);
        libros L2 = new libros( 978-84-616-392-3,"Análisis Forense Digital en Entornos Windows","Juan Garrido Caballero",253);

        System.out.println(L1.toString());
        System.out.println(L2.toString());

        if (L1.getNumPagi()>L2.getNumPagi()) {
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("El libro "+L1.getTitulo()+" tiene mas numeros de paginas que el libro "+L2.getTitulo());
        }else {
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("El libro "+L2.getTitulo()+" tiene mas numeros de paginas que el libro "+L1.getTitulo());
        }
    }
}

class libros{

    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroPagi;


    public libros(int NiSBN, String titulo, String autor, int numPagi) {
        ISBN = NiSBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPagi = numPagi;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int NiSBN) {
        ISBN = NiSBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPagi() {
        return numeroPagi;
    }

    public void setNumPagi(int numPagi) {
        this.numeroPagi = numPagi;
    }

    public String toString() {
        return "El libro ISBN " + ISBN + ", titulo " + titulo + ", creado por el autor " + autor + ",tiene " + numeroPagi + " paginas";
    }

}

