package entidad;

import service.IPrestamo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestamo implements IPrestamo {
    private Usuario usuario;
    private Libro libro;
    private final String fechaDePrestamo;
    private String fechaDeDevolucion;
    private final String pattern = "dd/MM/yyyy";
    private final SimpleDateFormat formater = new SimpleDateFormat(pattern);

    public Prestamo(Usuario usuario, Libro libro, String fechaDePrestamo, String fechaDeDevolucion) {
        this.usuario = usuario;
        this.libro = libro;
        try {
            Date fechaPrest = formater.parse(fechaDePrestamo);
            this.fechaDeDevolucion = formater.format(fechaPrest);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        this.fechaDePrestamo = fechaDePrestamo;
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String getFechaDePrestamo() {
        return fechaDePrestamo;
    }

    public String getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    @Override
    public void marcarDevuelto(String fecha) {
        try {
            Date fechaDev = formater.parse(fecha);
            this.fechaDeDevolucion = formater.format(fecha);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}