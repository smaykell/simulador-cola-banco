package controlador;

import modelo.ListaDeAtencion;
import vistas.*;

public class Core {
    
    private ListaDeAtencion miListaDeAtencion;
    private AtenderCliente miAtenderCliente;
    private ContadorGeneral miContadorGeneral;
    private GenerarTicket miGenerarTicket;
    
    public ListaDeAtencion getMiListaDeAtencion() {
        return miListaDeAtencion;
    }
    
    public void setMiListaDeAtencion(ListaDeAtencion miListaDeAtencion) {
        this.miListaDeAtencion = miListaDeAtencion;
    }
    
    public AtenderCliente getMiAtenderCliente() {
        return miAtenderCliente;
    }
    
    public void setMiAtenderCliente(AtenderCliente miAtenderCliente) {
        this.miAtenderCliente = miAtenderCliente;
    }
    
    public ContadorGeneral getMiContadorGeneral() {
        return miContadorGeneral;
    }
    
    public void setMiContadorGeneral(ContadorGeneral miContadorGeneral) {
        this.miContadorGeneral = miContadorGeneral;
    }
    
    public GenerarTicket getMiGenerarTicket() {
        return miGenerarTicket;
    }

    //Control de vistas
    public void setMiGenerarTicket(GenerarTicket miGenerarTicket) {
        this.miGenerarTicket = miGenerarTicket;
    }
    
    public void mostrarVistaAtenderCliente(boolean visible) {
        miAtenderCliente.setVisible(visible);
    }
    
    public void mostrarVistaContadorGeneral(boolean visible) {
        miContadorGeneral.setVisible(visible);
    }
    
    public void mostrarVistaGenerarTicket(boolean visible) {
        miGenerarTicket.setVisible(visible);
    }

    //Control de Tickets
    public String nuevoTicketPreferencial() {
        return miListaDeAtencion.nuevoTicketPreferencial();
    }
    
    public String nuevoTicketConTarjeta() {
        return miListaDeAtencion.nuevoTicketConTarjeta();
    }
    
    public String nuevoTicketSinTarjeta() {
        return miListaDeAtencion.nuevoTicketSinTarjeta();
    }
    
    public String atenderCliente() {
        return miListaDeAtencion.atender();
    }

    //Control de Contador General
    public void actualizarColaPreferencial(String text) {
        miContadorGeneral.actualizarColaPreferencial(text);
    }
    
    public void actualizarColaConTarjeta(String text) {
        miContadorGeneral.actualizarColaConTarjeta(text);
    }
    
    public void actualizarColaSinTarjeta(String text) {
        miContadorGeneral.actualizarColaSinTarjeta(text);
    }

    //otros
    public void actualizarCantidadEnCola(int n) {
        miAtenderCliente.actualizarCantidadEnCola(n);
    }
    
    public void actualizarCantidadDeAtendidos(int n) {
        miAtenderCliente.actualizarCantidadDeAtendidos(n);
    }
    
    public void actualizarEnVentanilla(String text) {
        miContadorGeneral.actualizarEnVentanilla(text);
    }
}
