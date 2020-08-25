package modelo;

import controlador.Core;
import java.util.LinkedList;

public class ListaDeAtencion {

    private Core core;

    private String ticket;

    private int clientesAtendidos;

    private int ultimoPreferencial;
    private int ultimoConTarjeta;
    private int ultimoSinTarjeta;

    private int atendidosConTarjetaTemp;
    private int atendidosSinTarjetaTemp;

    private LinkedList<String> colaPreferencial;
    private LinkedList<String> colaConTarjeta;
    private LinkedList<String> colaSinTarjeta;

    public ListaDeAtencion() {
        colaPreferencial = new LinkedList<>();
        colaConTarjeta = new LinkedList<>();
        colaSinTarjeta = new LinkedList<>();
        clientesAtendidos = 0;
        ultimoPreferencial = 1;
        ultimoConTarjeta = 1;
        ultimoSinTarjeta = 1;
        this.ticket = "";
        this.atendidosConTarjetaTemp = 0;
        this.atendidosSinTarjetaTemp = 0;
    }

    public void setMiCore(Core core) {
        this.core = core;
    }

    public String atender() {

        this.ticket = "";

        if (this.atendidosConTarjetaTemp < 2 && !this.colaConTarjeta.isEmpty()) {

            if (!this.atenderClienteConTarjeta())
                if (!this.atenderClienteSinTarjeta())
                    this.atenderClientePreferencial();

        } else if (this.atendidosSinTarjetaTemp == 0 && !this.colaSinTarjeta.isEmpty()) {

            if (!this.atenderClienteSinTarjeta())
                if (!this.atenderClienteConTarjeta())
                    this.atenderClientePreferencial();

        } else {
            if (!this.atenderClientePreferencial())
                if (!this.atenderClienteConTarjeta())
                    this.atenderClienteSinTarjeta();
        }

        this.core.actualizarCantidadEnCola(cantidadClientesEnCola());
        this.core.actualizarCantidadDeAtendidos(this.clientesAtendidos);
        return this.ticket;
    }

    public boolean atenderClientePreferencial() {
        if (this.colaPreferencial.isEmpty())
            return false;
        this.ticket = colaPreferencial.poll().toString();
        this.core.actualizarColaPreferencial(listar(colaPreferencial));
        this.atendidosConTarjetaTemp = 0;
        this.atendidosSinTarjetaTemp = 0;
        this.clientesAtendidos++;
        return true;
    }

    public boolean atenderClienteConTarjeta() {
        if (this.colaConTarjeta.isEmpty())
            return false;
        this.ticket = this.colaConTarjeta.poll().toString();
        this.core.actualizarColaConTarjeta(listar(this.colaConTarjeta));
        this.atendidosConTarjetaTemp++;
        this.clientesAtendidos++;
        return true;
    }

    public boolean atenderClienteSinTarjeta() {
        if (this.colaSinTarjeta.isEmpty())
            return false;
        this.ticket = colaSinTarjeta.poll().toString();
        this.core.actualizarColaSinTarjeta(listar(colaSinTarjeta));
        this.atendidosSinTarjetaTemp++;
        this.clientesAtendidos++;
        return true;
    }

    public String nuevoTicketPreferencial() {
        String ticketGenerado = generarTicket(this.ultimoPreferencial, "CP");
        this.colaPreferencial.offer(ticketGenerado);
        this.ultimoPreferencial++;
        this.core.actualizarColaPreferencial(listar(colaPreferencial));
        this.core.actualizarCantidadEnCola(cantidadClientesEnCola());
        return ticketGenerado;
    }

    public String nuevoTicketConTarjeta() {
        String ticketGenerado = generarTicket(ultimoConTarjeta, "CT");
        colaConTarjeta.offer(ticketGenerado);
        ultimoConTarjeta++;
        core.actualizarColaConTarjeta(listar(colaConTarjeta));
        core.actualizarCantidadEnCola(cantidadClientesEnCola());
        return ticketGenerado;
    }

    public String nuevoTicketSinTarjeta() {
        String ticketGenerado = generarTicket(ultimoSinTarjeta, "CS");
        colaSinTarjeta.offer(ticketGenerado);
        ultimoSinTarjeta++;
        core.actualizarColaSinTarjeta(listar(colaSinTarjeta));
        core.actualizarCantidadEnCola(cantidadClientesEnCola());
        return ticketGenerado;
    }

    private String generarTicket(int n, String txt) {
        String aux;
        if (n < 10) {
            aux = "00" + n;
        } else if (n < 100) {
            aux = "0" + n;
        } else {
            aux = "" + n;
        }
        return txt + aux;
    }

    public String listar(LinkedList<String> cola) {
        String texto = "";
        for (int i = 0; i < cola.size(); i++) {
            texto += i + 1 + ".- " + cola.get(i).toString() + "\n";
        }
        return texto;
    }

    public int cantidadClientesEnCola() {
        return this.colaSinTarjeta.size() + this.colaConTarjeta.size() + this.colaPreferencial.size();
    }

}
