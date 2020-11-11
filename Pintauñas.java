
public class Pintauñas {
    //Para guardar el color del piuntauñas
    private String color;
    //Para guardar el precio del pintauñas
    private int precio;
    //Para saber si hay stock o no 
    private boolean stock;

    /*
     * Constructor
     */
    public Pintauñas(String colorPintauñas, int precioPintauñas) {
        color = "colorPintauñas";
        precio = precioPintauñas;
        stock = true;
    }

    /*
     * Devolver el color del pintauñas
     */
    public String getColor() {
        return color;
    }

    /*
     * Devolver el precio del pintañas
     */
    public int getPrecio () {
        return precio;
    }

    /*
     * Devolver el estado del stock
     */
    public boolean estarEnStock () {
        return stock;
    }

    /*
     * Modificar el atributo nombre
     */
    public void setColor(String colorPintauñas) {
        color = colorPintauñas;
    }

    /*
     * Aplicar un porcentaje al precio
     */
    public void aplicarPorcentaje(int porcentaje) {
        precio = precio * (1 + (porcentaje/100));
    }

    /*
     * Cambiar la disponibiladad del stock
     */
    public boolean stock() {
         if (stock == true) {
            stock = false;
        }
        else {
            stock = true;
        }
        return stock;
    }

    /*
     * Imprimir los detalles del producto
     */
    public void detallesDeProducto() {
         System.out.println(""); 
    }

    /*
     * Imprimir el resto de detalles
     */
    public String getDetallesDeProducto() {
        String detallesDeProducto = "Color: " + color + "Precio: " + precio;
        if (stock) {
            detallesDeProducto = detallesDeProducto + "Está disponible en stock";
        }
        else {
            detallesDeProducto = detallesDeProducto + "No está disponible en stock";
        }
        return detallesDeProducto;
    }
}