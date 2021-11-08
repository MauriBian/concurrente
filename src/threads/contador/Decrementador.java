package threads.contador;

import model.Contador;

public class Decrementador extends Thread {
    private Contador contador;

    public Decrementador(Contador contador) {
        this.contador = contador;
    }

    public void run () {
        try {
            while(true) {
                contador.decrementar();
            }

        } catch (InterruptedException e){
        }
    }
}
