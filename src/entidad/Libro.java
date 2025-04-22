package entidad;

public class Libro {
    private String titulo;
    private String genero;
    private Autor autor;
    private boolean disponible;

    public Libro(String titulo, String genero, String autor, boolean disponible) {
        this.titulo = titulo;
        this.genero = genero;
        if(!autor.isBlank())
            this.autor = new Autor(autor);
        else
            this.autor = new Autor("Anónimo");
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

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void marcarComoPrestado(){
        if(this.disponible) {
            this.disponible = false;
            System.out.println("Libro prestado con éxito.");
            return;
        }
        System.out.println("El libro ya fue prestado.");
    }

    public void marcarComoDisponible(){
        if(!this.disponible){
            this.disponible = true;
            System.out.println("Libro devuelto.");
            return;
        }
        System.out.println("El libro está disponible.");
    }

    public void mostrarInfoLibro(){
        String datos = String.format("""
                Libro: {
                \tTítulo: %s,
                \tGénero: %s,
                \tAutor: %s
                \tDisponible: %b
                }
                """,this.titulo, this.genero,
                this.autor, this.disponible);
        System.out.println(datos);
    }
}