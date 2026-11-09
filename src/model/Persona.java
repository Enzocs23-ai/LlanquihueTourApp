package model;

/**
 * Clase base general que representa a una persona ligada a la agencia Llanquihue Tour.
 * Incorpora encapsulamiento y composición con Direccion.
 */

public class Persona {
    // Atributos privados
    private String rut;
    private String nombre;
    private String telefono;
    private Direccion direccion; // Relación de Composición (Persona has-a Direccion)

    /**
     * Constructor por defecto.
     * Inicializa los atributos para evitar valores null indeseados.
     */
    public Persona() {
        this.rut = "00000000-0";
        this.nombre = "Sin Nombre";
        this.telefono = "+56900000000";
        this.direccion = new Direccion(); // Garantiza la composición desde la creación
    }

    /**
     * Constructor con parámetros.
     *
     * @param rut       RUT identificador de la persona.
     * @param nombre    Nombre y apellidos.
     * @param telefono  Teléfono de contacto.
     * @param direccion Objeto de tipo Direccion.
     */
    public Persona(String rut, String nombre, String telefono, Direccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // --- Métodos Getters y Setters ---

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Sobrescritura del método toString() para mostrar la información del contacto.
     */
    @Override
    public String toString() {
        return "RUT: " + rut + " | Nombre: " + nombre + " | Teléfono: " + telefono + " | Dirección: [" + direccion.toString() + "]";
    }
}