package entidad;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Usuario extends Persona {
    private final List<Prestamo> prestamos;

    public Usuario(String nombre, String dni, String email) {
        super(nombre, dni, email);
        this.prestamos = new ArrayList<>();
    }

    public void mostrarPrestamos() {
        prestamos.forEach(Prestamo::mostrarInfo);
    }

    public void setPrestamos(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }

    @Override
    public void mostrarDatos() {
        String datos = String.format("""
                Usuario: {
                \tNombre: %s
                \tDni: %s
                \tEmail: %s
                \tPrestamos: %s
                },
                """, this.nombre, this.dni,
                this.email, this.prestamos);
        System.out.println(datos);
    }
}