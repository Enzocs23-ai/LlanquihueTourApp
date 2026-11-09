package model;

/**
 * Clase que representa a un empleado de la agencia Llanquihue Tour.
 * Hereda de la clase base Persona (Herencia).
 */

public class Empleado extends Persona {
    // Atributos específicos del Empleado
    private String cargo;
    private int sueldoBase;

    /**
     * Constructor por defecto.
     */
    public Empleado() {
        super(); // Invoca al constructor sin parámetros de Persona
        this.cargo = "Sin Cargo";
        this.sueldoBase = 0;
    }

    /**
     * Constructor con parámetros.
     * @param rut        RUT del empleado.
     * @param nombre     Nombre completo.
     * @param telefono   Teléfono de contacto.
     * @param direccion  Instancia de Direccion.
     * @param cargo      Cargo asignado en la agencia.
     * @param sueldoBase Sueldo base pactado.
     */
    public Empleado(String rut, String nombre, String telefono, Direccion direccion, String cargo, int sueldoBase) {
        super(rut, nombre, telefono, direccion); // Reutiliza la lógica de inicialización del padre
        this.cargo = cargo;
        this.sueldoBase = sueldoBase;
    }

    // --- Métodos Getters y Setters ---
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    /**
     * Sobrescritura de toString() reutilizando los datos de la superclase mediante super.toString().
     */
    @Override
    public String toString() {
        return super.toString() + " | Cargo: " + cargo + " | Sueldo Base: $" + sueldoBase;
    }
}