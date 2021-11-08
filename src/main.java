import model.Buffer;
import model.Contador;
import threads.buffer.Consumidor;
import threads.buffer.Productor;
import threads.contador.Decrementador;
import threads.contador.Incrementador;

public class main {
    public static void main ( String [] args ) throws InterruptedException {

        Buffer buffer = new Buffer();
        Productor productor = new Productor(buffer);
        Consumidor consumidor = new Consumidor(buffer);


        productor.start();
        consumidor.start();

        Thread.sleep(100);

        productor.interrupt();
        consumidor.interrupt();
    }
}
