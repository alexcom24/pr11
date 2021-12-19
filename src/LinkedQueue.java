import java.util.*;
public class LinkedQueue<E> extends AbstractQueue<E> implements QueueJava<E> {
    private LinkedList<E> q;
    private int size=0;
    public LinkedQueue() {
        q=new LinkedList<>();
    }
    public void enqueue(E element) {
        q.add(element);
        size++;
    }
    public E element() {
        return q.peekFirst();
    }
    public E dequeue() {
        size--;
        return q.poll();

    }

    public int getSize() {
        return size;
    }
    public boolean isEmpty() {
        return size==0;
    }
    public void clear() {
        while (!isEmpty())
            dequeue();
    }
}
