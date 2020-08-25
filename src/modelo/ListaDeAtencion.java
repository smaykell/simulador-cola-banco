package modelo;

import controlador.Core;
import java.util.LinkedList;

public class ListaDeAtencion {

    private Core miCore;

    private int clientesAtendidos;
    private int clientesEnCola;
    private int atendidosTarjeta;

    private int ultimoPreferencial;
    private int ultimoConTarjeta;
    private int ultimoSinTarjeta;

    LinkedList colaPreferencial;
    LinkedList colaConTarjeta;
    LinkedList colaSinTarjeta;

    public ListaDeAtencion() {
        clientesAtendidos = 0;
        clientesEnCola = 0;
        atendidosTarjeta = 0;
        colaPreferencial = new LinkedList();
        colaConTarjeta = new LinkedList();
        colaSinTarjeta = new LinkedList();
        ultimoPreferencial = 1;
        ultimoConTarjeta = 1;
        ultimoSinTarjeta = 1;
    }

    public void setMiCore(Core miCore) {
        this.miCore = miCore;
    }

    public String atender() {
        String ticketParaAtender = "";
        if (!colaPreferencial.isEmpty()) {
            ticketParaAtender = colaPreferencial.poll().toString();
            miCore.actualizarColaPreferencial(listar(colaPreferencial));
            clientesAtendidos++;
        } else if (atendidosTarjeta < 3) {
            if (!colaConTarjeta.isEmpty()) {
                ticketParaAtender = colaConTarjeta.poll().toString();
                miCore.actualizarColaConTarjeta(listar(colaConTarjeta));
                atendidosTarjeta++;
                clientesAtendidos++;
            } else {
                if (!colaSinTarjeta.isEmpty()) {
                    ticketParaAtender = colaSinTarjeta.poll().toString();
                    miCore.actualizarColaSinTarjeta(listar(colaSinTarjeta));
                    atendidosTarjeta = 0;
                    clientesAtendidos++;
                }
            }
        } else {
            if (!colaSinTarjeta.isEmpty()) {
                ticketParaAtender = colaSinTarjeta.poll().toString();
                miCore.actualizarColaSinTarjeta(listar(colaSinTarjeta));
                atendidosTarjeta = 0;
                clientesAtendidos++;
            }else{
                if (!colaConTarjeta.isEmpty()) {
                ticketParaAtender = colaConTarjeta.poll().toString();
                miCore.actualizarColaConTarjeta(listar(colaConTarjeta));
                clientesAtendidos++;
            } 
            }
        }
        miCore.actualizarCantidadEnCola(colaSinTarjeta.size() + colaConTarjeta.size() + colaPreferencial.size());
        miCore.actualizarCantidadDeAtendidos(clientesAtendidos);
        return ticketParaAtender;
    }

    public String nuevoTicketPreferencial() {
        String ticketGenerado = generarTicket(ultimoPreferencial, "CP");
        colaPreferencial.offer(ticketGenerado);
        ultimoPreferencial++;
        miCore.actualizarColaPreferencial(listar(colaPreferencial));
        miCore.actualizarCantidadEnCola(colaSinTarjeta.size() + colaConTarjeta.size() + colaPreferencial.size());
        return ticketGenerado;
    }

    public String nuevoTicketConTarjeta() {
        String ticketGenerado = generarTicket(ultimoConTarjeta, "CT");
        colaConTarjeta.offer(ticketGenerado);
        ultimoConTarjeta++;
        miCore.actualizarColaConTarjeta(listar(colaConTarjeta));
        miCore.actualizarCantidadEnCola(colaSinTarjeta.size() + colaConTarjeta.size() + colaPreferencial.size());
        return ticketGenerado;
    }

    public String nuevoTicketSinTarjeta() {
        String ticketGenerado = generarTicket(ultimoSinTarjeta, "CS");
        colaSinTarjeta.offer(ticketGenerado);
        ultimoSinTarjeta++;
        miCore.actualizarColaSinTarjeta(listar(colaSinTarjeta));
        miCore.actualizarCantidadEnCola(colaSinTarjeta.size() + colaConTarjeta.size() + colaPreferencial.size());
        return ticketGenerado;
    }

    private String generarTicket(int val, String nom) {
        String aux;
        if (val < 10) {
            aux = "00" + val;
        } else if (val < 100) {
            aux = "0" + val;
        } else {
            aux = "" + val;
        }
        return nom + aux;
    }

    public String listar(LinkedList cola) {
        String texto = "";
        for (int i = 0; i < cola.size(); i++) {
            texto += i + 1 + ".- " + cola.get(i).toString() + "\n";
        }
        return texto;
    }

}
