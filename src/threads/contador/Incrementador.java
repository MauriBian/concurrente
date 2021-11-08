package threads.contador;

import model.Contador;

public class Incrementador extends Thread {
    private Contador contador;

    public Incrementador(Contador contador) {
        this.contador = contador;
    }

    public void run () {
        try {
            while(true) {
                contador.incrementar();
            }

        } catch (InterruptedException e){
        }
    }
}
