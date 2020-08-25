
import java.util.LinkedList;

public class PruebaCola {

    public static void main(String[] args) {
        try {
            LinkedList cola = new LinkedList();
            //encolar
            cola.offer("C01");
            cola.offer("C02");
            cola.offer("C03");

            //mostar cola
            System.out.println(cola);

            //desencolar
            cola.poll();

            //mostrar cola
            System.out.println(cola);
        } catch (Exception e) {
        }

    }
}
