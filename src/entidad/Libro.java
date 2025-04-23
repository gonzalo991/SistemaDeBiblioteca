package entidad;

public class Libro {
    private String titulo;
    private String genero;
    private Autor autor;
    private boolean disponible;

    public Libro(String titulo, String genero, String autor, boolean disponible) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = new Autor(autor);
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }


    public void marcarComoPrestado(){
            this.disponible = false;
            System.out.println("Libro prestado con éxito.");
    }

    public void marcarComoDisponible(){
            this.disponible = true;
            System.out.println("Libro devuelto.");
    }

    public void mostrarInfoLibro(){
            System.out.printf("""
            Libro: {
            \tTítulo: %s,
            \tGénero: %s,
            \tAutor: %s,
            \tDisponible: %b
            }
            """, this.titulo, this.genero, this.autor, this.disponible);
    }
}