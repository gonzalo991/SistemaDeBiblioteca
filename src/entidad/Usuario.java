package entidad;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Persona {
    private List<Prestamo> prestamos;

    public Usuario(String nombre, String dni, String email) {
        super(nombre, dni, email);
        this.prestamos = new ArrayList<>();
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
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