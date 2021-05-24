/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaime
 */
public interface NewInterface {

    void agregarCafe(int cantidad) throws Exception;

    /**
     * @return the cantidadActual
     */
    int getCantidadActual();

    /**
     * @return the capacidadMaxima
     */
    int getCapacidadMaxima();

    void llenarCafetera();

    void servirTaza(int tamanoTaza) throws Exception;

    /**
     * @param cantidadActual the cantidadActual to set
     */
    void setCantidadActual(int cantidadActual);

    /**
     * @param capacidadMaxima the capacidadMaxima to set
     */
    void setCapacidadMaxima(int capacidadMaxima);

    void vaciarCafetera();

}
