/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel2consumer;

/**
 *
 * @author Sliffer
 */
public class Hotel2WSConsumer {

    public static java.util.List<hotel2consumer.Habitacion> buscarHabitacionesEnFechas(java.lang.String inicio, java.lang.String fin) {
        hotel2consumer.Hotel2WS_Service service = new hotel2consumer.Hotel2WS_Service();
        hotel2consumer.Hotel2WS port = service.getHotel2WSPort();
        return port.buscarHabitacionesEnFechas(inicio, fin);
    }

    public static boolean registrarReserva(java.lang.Integer persona, java.lang.Integer name, java.lang.String inicio, java.lang.String fin, java.util.List<java.lang.Integer> habitaciones) {
        hotel2consumer.Hotel2WS_Service service = new hotel2consumer.Hotel2WS_Service();
        hotel2consumer.Hotel2WS port = service.getHotel2WSPort();
        return port.registrarReserva(persona, name, inicio, fin, habitaciones);
    }
    
}
