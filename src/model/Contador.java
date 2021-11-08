package model;

public class Contador {
    private int contador = 0;

    synchronized public void incrementar () throws InterruptedException{
        contador ++;
        notifyAll();
    }

    synchronized public void decrementar () throws InterruptedException{
        while (contador == 0) {
            wait();
        }
        contador ++;
    }
}
