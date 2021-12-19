/**
 * Invariant: FIFO (first int - first out).
 *
 */
public class ArrayQueueADT<E> {
    /**
     * Pre: E element!=null;
     *      q!=null
     * Post: q.enqueue(element)
     */
    public void enqueue(E element, ArrayQueue<E> q) {
        q.enqueue(element);
    }
    /**
     * Pre: q!=null
     * Post: R=q.element()
     */
    public E element(ArrayQueue<E> q) {
        return q.element();
    }
    /**
     * Pre: q!=null
     * Post: R=q.getSize()
     */
    public int getSize(ArrayQueue<E> q) {
        return q.getSize();
    }
    /**
     * Pre: q!=null
     * Post: R=q.dequeue()
     */
    public E dequeue(ArrayQueue<E> q) {
        return q.dequeue();
    }
    /**
     * Pre: q!=null
     * Post: R=q.isEmpty()
     */
    public boolean isEmpty(ArrayQueue<E> q) {
        return q.isEmpty();
    }
    /**
     * Pre: q!=null
     * Post: q.clear()
     */
    public void clear(ArrayQueue<E> q) {
        q.clear();
    }


}
