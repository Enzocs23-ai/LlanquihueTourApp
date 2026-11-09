package model;

/**
 * Clase que representa una dirección física en el sistema de Llanquihue Tour.
 * Se utiliza para implementar la relación de composición.
 */

public class Direccion {
    // Atributos privados (Encapsulamiento)
    private String calle;
    private String ciudad;
    private String region;

    /**
     * Constructor por defecto con valores iniciales controlados.
     */
    public Direccion() {
        this.calle = "Sin Calle";
        this.ciudad = "Llanquihue";
        this.region = "Los Lagos";
    }

    /**
     * Constructor con parámetros.
     *
     * @param calle  Calle y número de numeración.
     * @param ciudad Comuna o ciudad.
     * @param region Región administrativa.
     */
    public Direccion(String calle, String ciudad, String region) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
    }

    // --- Métodos de Acceso (Getters y Setters) ---

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Sobrescritura de toString() para presentar la dirección formateada.
     */
    @Override
    public String toString() {
        return calle + ", " + ciudad + ", " + region;
    }
}