package model;

public class Buffer {

    public int capacidad = 10;
    private Object[] data = new Object[capacidad + 1];
    private int begin = 0;
    private int end = 0;

    synchronized public void write (Object object) throws InterruptedException {
        while(isFull()) {
            wait();
        }
        data[begin] = object;
        begin = next(begin);
        notifyAll();
    }

    synchronized public Object read () throws InterruptedException {
        while (isEmpty()) {
            wait();
        }
        Object result = data[end];
        end = next(end);
        notifyAll();
        return result;
    }

    private boolean isEmpty() { return begin == end; }
    private boolean isFull () { return  next(begin) == end;  }
    private int next (int i) { return (i + 1) % (capacidad + 1 ); }
}
