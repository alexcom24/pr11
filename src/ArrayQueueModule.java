/**
 * Invariant: FIFO (first int - first out).
 *
 */
public class ArrayQueueModule<E>  {
    private ArrayQueue<E> q1;
    /**
     * Pre: capacity!=null
     * Post: q1=new ArrayQueue<>(capacity)
     *
     */
    public ArrayQueueModule(int capacity) {
        q1=new ArrayQueue<>(capacity);
    }
    /**
     * Pre: E element!=null
     *
     * Post: q1.enqueue(element)
     */
    public void enqueue(E element) {
        q1.enqueue(element);
    }
    /**
     * Pre: -
     * Post: R=q1.element()
     */
    public E element() {
        return q1.element();
    }
    /**
     * Pre: -
     * Post: R=q1.getSize()
     */
    public int getSize() {
        return q1.getSize();
    }
    /**
     * Pre: -
     * Post: R=q1.dequeue()
     */
    public E dequeue() {
        return q1.dequeue();
    }
    /**
     * Pre: -
     * Post: R=q1.isEmpty()
     */
    public boolean isEmpty() {
        return q1.isEmpty();
    }
    /**
     * Pre: -
     * Post: q1.clear()
     */
    public void clear() {
        q1.clear();
    }
}
