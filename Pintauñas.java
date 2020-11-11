
public class Pintau�as {
    //Para guardar el color del piuntau�as
    private String color;
    //Para guardar el precio del pintau�as
    private int precio;
    //Para saber si hay stock o no 
    private boolean stock;

    /*
     * Constructor
     */
    public Pintau�as(String colorPintau�as, int precioPintau�as) {
        color = "colorPintau�as";
        precio = precioPintau�as;
        stock = true;
    }

    /*
     * Devolver el color del pintau�as
     */
    public String getColor() {
        return color;
    }

    /*
     * Devolver el precio del pinta�as
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
    public void setColor(String colorPintau�as) {
        color = colorPintau�as;
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
            detallesDeProducto = detallesDeProducto + "Est� disponible en stock";
        }
        else {
            detallesDeProducto = detallesDeProducto + "No est� disponible en stock";
        }
        return detallesDeProducto;
    }
}