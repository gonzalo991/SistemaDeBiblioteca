import entidad.Biblioteca;
import entidad.Libro;
import entidad.Prestamo;
import entidad.Usuario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var libro = new Libro("El señor de los anillos","Fantasía","George R.R Martin", true);
        var libro1 = new Libro("Clean Code: A Handbook of Agile Software Craftsmanship",
                "Academico","Robert C. Matin", true);
        var libro2 = new Libro("Design Patterns: Elements of Reusable Object-Oriented Software",
                "Erich Gamma", "Academico", true);
        var libro3 = new Libro("The Pragmatic Programmer: Your Journey to Mastery",
                "Programación","Andrew Hunt", true);
        var libro4 = new Libro("Node.js Design Patterns", "Programación",
                "Mario Casciaro", true);
        var libro5 = new Libro("El señor de los anillos","Fantasía","George R.R Martin", true);
        var libro6 = new Libro("Clean Code: A Handbook of Agile Software Craftsmanship",
                "Academico","Robert C. Matin", true);
        var libro7 = new Libro("Design Patterns: Elements of Reusable Object-Oriented Software",
                "Erich Gamma", "Academico", true);
        var libro8 = new Libro("The Pragmatic Programmer: Your Journey to Mastery",
                "Programación","Andrew Hunt", true);
        var libro9 = new Libro("Node.js Design Patterns", "Programación",
                "Mario Casciaro", true);
        var libro10 = new Libro("El señor de los anillos","Fantasía","George R.R Martin", true);
        var libro11 = new Libro("Clean Code: A Handbook of Agile Software Craftsmanship",
                "Academico","Robert C. Matin", true);
        var libro12 = new Libro("Design Patterns: Elements of Reusable Object-Oriented Software",
                "Erich Gamma", "Academico", true);


        var usuario = new Usuario("Gonzalo Araya","35912768","gonxaraya991@gmail.com");
        var usuario1 = new Usuario("Pancho Villa","12345678","pvilla@email.com");
        var usuario2 = new Usuario("Elsa Pato","23456789","epato@email.com");
        var usuario3 = new Usuario("Elvis Cocho","34567891","ecocho@mail.com");
        var usuario4 = new Usuario("Elpa Tascortas","56789012","etascortas@email.com");

        var elAteneo = new Biblioteca();

        System.out.println("----------Registrando libros-----------");
        elAteneo.registrarLibro(libro);
        elAteneo.registrarLibro(libro1);
        elAteneo.registrarLibro(libro2);
        elAteneo.registrarLibro(libro3);
        elAteneo.registrarLibro(libro4);
        elAteneo.registrarLibro(libro5);
        elAteneo.registrarLibro(libro6);
        elAteneo.registrarLibro(libro7);
        elAteneo.registrarLibro(libro8);
        elAteneo.registrarLibro(libro9);
        elAteneo.registrarLibro(libro10);
        elAteneo.registrarLibro(libro11);
        elAteneo.registrarLibro(libro12);

        elAteneo.mostrarLibrosDisponibles();

        System.out.println("-----------Registrando usuarios-----------");
        elAteneo.registrarUsuario(usuario);
        elAteneo.registrarUsuario(usuario1);
        elAteneo.registrarUsuario(usuario2);
        elAteneo.registrarUsuario(usuario3);
        elAteneo.registrarUsuario(usuario4);

        System.out.println("-----------Listar de libros disponibles------------\n");
        elAteneo.mostrarLibrosDisponibles();
        System.out.println("\n-----------Prestar un libro--------------");
        var prestamo = new Prestamo(usuario,libro2,"01/02/2025","");
        var prestamo1 = new Prestamo(usuario3,libro8,"12/03/2025","");
        var prestamo2 = new Prestamo(usuario2,libro4,"08/04/2025","");
        var prestamo3 = new Prestamo(usuario,libro5,"05/02/2025","");
        var prestamo4 = new Prestamo(usuario4,libro7,"15/03/2025","");

        usuario.setPrestamos(prestamo);
        usuario3.setPrestamos(prestamo1);
        usuario2.setPrestamos(prestamo2);
        usuario.setPrestamos(prestamo3);
        usuario4.setPrestamos(prestamo4);

        elAteneo.prestarLibro(libro2,usuario);
        elAteneo.prestarLibro(libro8, usuario3);
        elAteneo.prestarLibro(libro4, usuario2);
        elAteneo.prestarLibro(libro5, usuario);
        elAteneo.prestarLibro(libro7,usuario4);

        System.out.println("\n------------------------------- Prestamos realizados --------------------------");
        usuario.mostrarPrestamos();
        usuario2.mostrarPrestamos();
        usuario3.mostrarPrestamos();
        usuario4.mostrarPrestamos();

        System.out.println("\n--------------------- Busquedas por título -----------------------------------");
        elAteneo.buscarLibroPorTitulo("Design Patterns: Elements of Reusable Object-Oriented Software");
        elAteneo.buscarLibroPorTitulo("El señor de los anillos");
        elAteneo.buscarLibroPorTitulo("Clean Code: A Handbook of Agile Software Craftsmanship");
        elAteneo.buscarLibroPorTitulo("The Pragmatic Programmer: Your Journey to Mastery");

        System.out.println("\n---------------------  Libros disponibles despues del prestamo -----------------------");
        elAteneo.mostrarLibrosDisponibles();
    }
}