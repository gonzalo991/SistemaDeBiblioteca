package entidad;

import java.util.*;

public class Biblioteca {
    private Set<Libro> libros;
    private Set<Usuario> usuarios;
    private Map<String, Libro> prestamos;

    public Biblioteca() {
        this.libros = new HashSet<>();
        this.usuarios = new HashSet<>();
        this.prestamos = new HashMap<>();
    }

    public Optional<Libro> registrarLibro(Libro libro){
        this.libros.add(libro);
        return Optional.of(libro);
    }

    public Optional<Usuario> registrarUsuario(Usuario usuario){
        this.usuarios.add(usuario);
        return Optional.of(usuario);
    }

    public Optional<Usuario> prestarLibro(Libro libro, Usuario usuario){
        prestamos.put(usuario.getDni(), libro);
        return Optional.of(usuario);
    }

    public Optional<Libro> buscarLibroPorTitulo(String titulo){
        return Optional.of((Libro) libros.stream().filter(l -> l.getTitulo().equals(titulo)));
    }

    public List<String> mostrarLibrosDisponibles(){
        return libros.stream().map(Libro::getTitulo).sorted().toList();
    }
}