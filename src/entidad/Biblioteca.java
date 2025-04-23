package entidad;

import java.util.*;

public class Biblioteca {
    private List<Libro> libros;
    private Set<Usuario> usuarios;
    private Map<String, Libro> prestamos;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new HashSet<>();
        this.prestamos = new HashMap<>();
    }

    public void registrarLibro(Libro libro){
        if (libro == null) return;
        libros.add(libro);
    }

    public void registrarUsuario(Usuario usuario){
        if(usuario == null) return;
        usuarios.add(usuario);
    }

    public void prestarLibro(Libro libro, Usuario usuario){
        if (libro != null && libro.isDisponible()) {
            prestamos.put(usuario.getDni(), libro);
            libro.marcarComoPrestado();
        } else {
            System.out.println("El libro no está disponible para préstamo: " + libro.getTitulo());
        }
    }

    public void buscarLibroPorTitulo(String titulo){
        Optional<Libro> resultado =  libros.stream()
                .filter(libro -> libro.getTitulo().equalsIgnoreCase(titulo))
                .findFirst();
        resultado.ifPresent(Libro::mostrarInfoLibro);
    }

    public void mostrarLibrosDisponibles() {
        libros.stream()
                .filter(Libro::isDisponible)
                .forEach(Libro::mostrarInfoLibro);
    }
}