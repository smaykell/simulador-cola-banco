package controlador;

import modelo.ListaDeAtencion;
import vistas.AtenderCliente;
import vistas.ContadorGeneral;
import vistas.GenerarTicket;

public class Main {
    
    Core miCore;
    ListaDeAtencion miListaDeAtencion;
    AtenderCliente miAtenderCliente;
    ContadorGeneral miContadorGeneral;
    GenerarTicket miGenerarTicket;
    
    public static void main(String[] args) {
        Main miMain = new Main();
        miMain.iniciar();
    }
    
    private void iniciar() {
        
        miCore = new Core();
        miListaDeAtencion = new ListaDeAtencion();
        miAtenderCliente = new AtenderCliente();
        miContadorGeneral = new ContadorGeneral();
        miGenerarTicket = new GenerarTicket();
        
        miListaDeAtencion.setMiCore(miCore);
        miAtenderCliente.setMiCore(miCore);
        miContadorGeneral.setMiCore(miCore);
        miGenerarTicket.setMiCore(miCore);
        
        miCore.setMiListaDeAtencion(miListaDeAtencion);
        miCore.setMiAtenderCliente(miAtenderCliente);
        miCore.setMiContadorGeneral(miContadorGeneral);
        miCore.setMiGenerarTicket(miGenerarTicket);
        
        
        miCore.mostrarVistaContadorGeneral(true);
        miCore.mostrarVistaGenerarTicket(true);
        miCore.mostrarVistaAtenderCliente(true);
        
    }
}
