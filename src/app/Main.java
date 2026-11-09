package app;

import model.Direccion;
import model.Empleado;
import model.Persona;

/**
 * Clase principal que ejecuta el sistema de Llanquihue Tour.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("=================================================================================");
        System.out.println("AGENCIA DE TURISMO LLANQUIHUE TOUR - REGISTRO DE CONTACTOS Y EMPLEADOS");
        System.out.println("=================================================================================\n");

        // 1. Objeto 1: Instancia de Persona (Cliente/Contacto) con Composición de Direccion
        Direccion dir1 = new Direccion("Av. Vicente Pérez Rosales 432", "Llanquihue", "Los Lagos");
        Persona persona1 = new Persona("17.557.322-0", "Pamela Rivas", "+56981234567", dir1);

        // 2. Objeto 2: Instancia de Empleado (Guía Turístico) heredado de Persona
        Direccion dir2 = new Direccion("La Unión 308", "Frutillar", "Los Lagos");
        Empleado empleado1 = new Empleado("19.985.432-9", "Cristian Sanchez", "+56955627891", dir2, "Guía Turístico Lacustre", 780000);

        // 3. Objeto 3: Segunda instancia de Empleado (Operadora de Rutas)
        Direccion dir3 = new Direccion("Los Arrayanes 288", "Puerto Varas", "Los Lagos");
        Empleado empleado2 = new Empleado("16.980.498-K", "Camila Venegas", "+56977854890", dir3, "Operadora de Rutas Gastronómicas", 820000);

        // Despliegue de resultados por consola utilizando System.out.println() y toString()
        System.out.println("--- REGISTRO #1: CONTACTO GENERAL ---");
        System.out.println(persona1.toString());

        System.out.println("\n--- REGISTRO #2: GUÍA TURÍSTICO (EMPLEADO) ---");
        System.out.println(empleado1.toString());

        System.out.println("\n--- REGISTRO #3: OPERADORA DE RUTAS (EMPLEADO) ---");
        System.out.println(empleado2.toString());

        System.out.println("\n=================================================================================");
        System.out.println("Sistema ejecutado con éxito.");
    }
}
