package entidad;

public abstract class Persona {
    protected String nombre;
    protected String dni;
    protected String email;

    public Persona(String nombre, String dni, String email){
        if(nombre.isBlank())
            this.nombre = nombre;
        else
            System.out.println("Ingrese el nombre");
        if(dni.isBlank())
            this.dni = dni;
        else
            System.out.println("Debe ingresar el dni");
        if(email.isBlank())
            this.email = email;
        else
            System.out.println("Ingrese el email");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void mostrarDatos();
}
