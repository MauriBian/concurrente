package model;

public class Semaphore {
    private int permisos = 1;

    synchronized public void release () throws  InterruptedException {
        permisos ++;
        notify();
    }

    synchronized public void acquire () throws InterruptedException {
        while(permisos == 0) {
            wait();
        }
        permisos --;
    }

}
