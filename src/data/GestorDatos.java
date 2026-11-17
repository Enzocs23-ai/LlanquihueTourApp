package data;

import model.Tour;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestorDatos {

    /**
     * Carga los datos desde el archivo .txt y retorna una colección List/ArrayList de objetos Tour.
     */
    public List<Tour> cargarDesdeArchivo(String rutaArchivo) {
        List<Tour> lista = new ArrayList<>();

        // El bloque try-with-resources debe envolver todo el uso de 'br'
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) {
                    continue;
                }

                // Separación de campos por punto y coma (;)
                String[] partes = linea.split(";");

                if (partes.length == 3) {
                    String nombre = partes[0].trim(); // Índice 0: Nombre del tour
                    String tipo = partes[1].trim();   // Índice 1: Tipo de tour
                    int precio = Integer.parseInt(partes[2].trim()); // Índice 2: Precio

                    // Creación del objeto y adición a la lista dinámica
                    Tour tour = new Tour(nombre, tipo, precio);
                    lista.add(tour);
                }
            }

            System.out.println("--> Éxito: Se cargaron " + lista.size() + " tours desde el archivo.");

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error al parsear el precio: " + e.getMessage());
        }

        return lista;
    }
}