
/**
 * Clase que modela el comportamiento de una cafetera
 *
 * @author jaime
 */
public class Cafetera implements NewInterface {

    private int capacidadMaxima; // Capacidad máxima de la cafetera
    private int cantidadActual; // volumen de café actualmente disponible

    /**
     * Crea una cafetera con los parámetros indicados
     *
     * @param capacidadMaxima la capacidad máxima de la cafetera, como un entero (1,2...)
     * @param cantidadActual la cantidad de café actualmente disponible en la cafetera, como un valor entero
     */
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.cantidadActual = cantidadActual;
        this.capacidadMaxima = Math.max(capacidadMaxima, cantidadActual);
    }

    /**
     * Crea una cafetera vacía con la capacidad máxima indicada
     *
     * @param capacidadMaxima la capacidad máxima de la cafetera, como un entero (1,2...)
     */
    public Cafetera(int capacidadMaxima) {
        this(capacidadMaxima, 0);
    }

    /**
     * Crea una cafetera vacía con una capacidad máxima de 1000ml
     */
    public Cafetera() {
        this(1000, 0);
    }

    /**
     * Establece la cantidad actual de café al máximo de capacidad de la cafetera
     */
    @Override
    public void llenarCafetera() {
        setCantidadActual(getCapacidadMaxima());
    }

    /**
     * Reduce la cantidad de café disponible en la cafetera según se le indique
     *
     * @param tamanoTaza volumen de café que va a retirarse de la taza
     * @throws Exception "No hay café" si la cantidad disponible es 0.
     */
    @Override
    public void servirTaza(int tamanoTaza) throws Exception {
        setCantidadActual(getCantidadActual() - tamanoTaza);
        if (getCantidadActual() < 0) {
            setCantidadActual(0);
            throw new Exception("No hay café");
        }
    }

    /**
     * Reduce a 0 la cantidad de café disponible en la cafetera
     */
    @Override
    public void vaciarCafetera() {
        setCantidadActual(0);
    }

    /**
     * Aumenta la cantidad de café disponible en la cafetera
     *
     * @param cantidad volumen de café que se quiere añadir
     * @throws Exception "Rebosa" si la suma del volumen añadido más la cantidad actual supera la capacidad máxima
     */
    @Override
    public void agregarCafe(int cantidad) throws Exception {
        setCantidadActual(getCantidadActual() + cantidad);
        if (getCantidadActual() > getCapacidadMaxima()) {
            setCantidadActual(getCapacidadMaxima());
            throw new Exception("Rebosa");
        }

    }

    /**
     * Devuelve la capacidad máxima de la cafetera
     *
     * @return el valor del campo capacidadMaxima
     */
    @Override
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    /**
     * Asigna un valor a la capacidad máxima de la cafetera
     *
     * @param capacidadMaxima el volumen máximo de café que se puede guardar, como un entero
     */
    @Override
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    /**
     * Devuelve la cantidad de café disponible actualmente
     *
     * @return el valor del campo cantidadActual
     */
    @Override
    public int getCantidadActual() {
        return cantidadActual;
    }

    /**
     * Establece la cantidad actual de café disponible
     *
     * @param cantidadActual el volumen de café disponible, como un entero
     */
    @Override
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
}
