public abstract class AbstractQueue<E> {
    public abstract void enqueue(E element);
    public abstract E element();
    public abstract E dequeue();
    public abstract int getSize();
    public abstract boolean isEmpty();
    public abstract void clear();

}
