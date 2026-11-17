package ui;

import data.GestorDatos;
import model.Tour;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=================================================================");
        System.out.println(" LLANQUIHUE TOUR - SISTEMA DE GESTIÓN DE TOURS ");
        System.out.println("=================================================================\n");

        GestorDatos gestor = new GestorDatos();
        String rutaArchivo = "src/resources/tours.txt";

        // 1. Cargar datos desde archivo
        List<Tour> tours = gestor.cargarDesdeArchivo(rutaArchivo);

        // 2. Recorrido completo de la colección
        System.out.println("\n--- LISTA COMPLETA DE TOURS ---");
        for (Tour t : tours) {
            System.out.println(t.toString());
        }

        // 3. Filtrado por condición (Ejemplo: Tours de tipo "Gastronómico")
        String filtroTipo = "Gastronómico";
        System.out.println("\n--- TOURS FILTRADOS (TIPO: '" + filtroTipo.toUpperCase() + "') ---");
        for (Tour t : tours) {
            if (t.getTipo().equalsIgnoreCase(filtroTipo)) {
                System.out.println(t.toString());
            }
        }

        System.out.println("\n=================================================================");
        System.out.println("Ejecución finalizada correctamente.");
    }
}