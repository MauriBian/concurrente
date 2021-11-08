package threads.buffer;

import model.Buffer;

public class Productor extends Thread{
    private Buffer buffer;

    public Productor(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run () {
        try {
            int i = 0;
            while (true) {
                buffer.write(i);
                i ++;
            }
        } catch (InterruptedException e){
        }
    }
}
