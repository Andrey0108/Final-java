public class Estudiante {

    // **Atributos:**

    // La identificación del estudiante.
    private String identificacion;

    // El nombre del estudiante.
    private String nombre;

    // El correo electrónico del estudiante.
    private String email;

    // **Métodos:**

    // **Getter** para obtener la identificación del estudiante.
    public String getIdentificacion() {
        // Retorna la identificación del estudiante.
        return identificacion;
    }

    // **Setter** para establecer la identificación del estudiante.
    public void setIdentificacion(String identificacion) {
        // Asigna el valor de la identificación al atributo.
        this.identificacion = identificacion;
    }

    // **Getter** para obtener el nombre del estudiante.
    public String getNombre() {
        // Retorna el nombre del estudiante.
        return nombre;
    }

    // **Setter** para establecer el nombre del estudiante.
    public void setNombre(String nombre) {
        // Asigna el valor del nombre al atributo.
        this.nombre = nombre;
    }

    // **Getter** para obtener el correo electrónico del estudiante.
    public String getEmail() {
        // Retorna el correo electrónico del estudiante.
        return email;
    }

    // **Setter** para establecer el correo electrónico del estudiante.
    public void setEmail(String email) {
        // Asigna el valor del correo electrónico al atributo.
        this.email = email;
    }
}