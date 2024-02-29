import java.util.ArrayList;
import java.util.Scanner;

// Clase principal de la aplicación 
public class App {
    // Scanner para leer la entrada del usuario
    static Scanner input = new Scanner(System.in);
    // Lista para almacenar los objetos Estudiante
    static ArrayList<Estudiante> estudiantes = new ArrayList<>();

    // Método para leer los datos de los estudiantes desde el teclado
    public static void readStudent() {
        // Variables para almacenar los datos de cada estudiante
        String identificacion, nombre, email;
        int students;
        System.out.print("Ingrese la cantidad de estudiantes: ");
        students = input.nextInt();
        // Ciclo para leer los datos de cada estudiante
        for (int i = 1; i <= students; i++) {
            System.out.println("Estudiante #" + i);

            System.out.print("Ingrese su identificacion: ");
            identificacion = input.next();

            System.out.print("Ingrese su nombre: ");
            nombre = input.next();

            System.out.print("Ingrese su email: ");
            email = input.next();

            Estudiante estudiante = new Estudiante();

            // Crea un objeto Estudiante y lo agrega a la lista
            estudiante.setIdentificacion(identificacion);
            estudiante.setNombre(nombre);
            estudiante.setEmail(email);

            estudiantes.add(estudiante);
        }
    }

    // Método para mostrar la información de todos los estudiante
    public static void getStudents() {
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println("Estudiante #" + (i + 1));
            System.out.println(estudiantes.get(i).getIdentificacion());
            System.out.println(estudiantes.get(i).getNombre());
            System.out.println(estudiantes.get(i).getEmail());
        }
    }

    // Método para buscar un estudiante por su identificación
    public static void getStudentById() {
        System.out.print("Digite la identificacion que quiere buscar: ");
        String id = input.next();

        // Recorre la lista de estudiantes buscando la identificación
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getIdentificacion().equals(id)) {

                // Si encuentra la identificación, muestra los datos del estudiante
                System.out.println(estudiantes.get(i).getIdentificacion());
                System.out.println(estudiantes.get(i).getNombre());
                System.out.println(estudiantes.get(i).getEmail());
            }
        }
    }

    // Método para actualizar la información de un estudiante
    public static void updateStudent() {
        System.out.println("Digite la identificacion del estudiante a actualizar");
        String id = input.next();

        // Recorre la lista buscando al estudiante por identificación
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getIdentificacion().equals(id)) {
                System.out.println("Estudiante encontrado");
                System.out.println(estudiantes.get(i).getIdentificacion());
                System.out.println(estudiantes.get(i).getNombre());
                System.out.println(estudiantes.get(i).getEmail());

                // Solicita los nuevos datos y actualiza el objeto Estudiante
                System.out.println("Nuevo nombre: ");
                String newName = input.next();

                estudiantes.get(i).setNombre(newName);
                System.out.println("Nombre actualizado: " + estudiantes.get(i).getNombre());

                System.out.println("Nuevo email: ");
                String newEmail = input.next();

                estudiantes.get(i).setEmail(newEmail);
                System.out.println("Email actualizado: " + estudiantes.get(i).getEmail());

            }
        }

    }

    public static void main(String[] args) {
        readStudent();
        // getStudents();
        getStudentById();
        updateStudent();
    }

}
