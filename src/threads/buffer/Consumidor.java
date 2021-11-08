package threads.buffer;

import model.Buffer;

public class Consumidor extends Thread {
    private Buffer buffer;

    public Consumidor(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run () {
        try {
            while (true) {
                Object object = buffer.read();
                System.out.println("Consumido " + object.toString());
            }
        } catch (InterruptedException e){
        }
    }
}
