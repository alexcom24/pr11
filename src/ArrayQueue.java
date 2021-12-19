/**
 * Invariant: FIFO (first int - first out).
 *
 */
public class ArrayQueue<E> extends AbstractQueue<E> {
    private E[] q;
    private int size; // текущий размер очереди(сколько элементов сейчас находится в очереди)
    private int elementa; // указатель на первый элемент очереди
    private int end; // указатель на последний элемент очереди
    private int capacity; // вместимость очереди

    /**
     * Pre: capacity!=null
     * Post: q=(E[]) new Object[this.capacity];
     *       size=0;
     *       elementa=-1;
     *       end=-1
     *
     */
    public ArrayQueue(int capacity) {
        this.capacity=capacity;
        q=(E[]) new Object[this.capacity];
        size=0;
        elementa=-1;
        end=-1;
    }

    /**
     * Pre: E element!=null;
     *      size!=q.length
     * Post: end=(end+1)%q.length;
     *       q[end]=element;
     *       size+=1;
     *       this.elementa=0 (if it was '-1')
     */
    public void enqueue(E element) {
        if (size!=q.length) {
            end=(end+1)%q.length;
            q[end]=element;
            if (this.elementa==-1) this.elementa=0;
            size+=1;
        }
        else System.out.println("Очередь заполнена");
    }

    /**
     * Pre: size>0
     * Post: R=q[elementa]
     */
    public E element() {
        return q[elementa];
    }

    /**
     * Pre: -
     * Post: R=size
     */
    public int getSize() {
        return size;
    }

    /**
     * Pre: size>0
     * Post: size--;
     *       elementa=end=-1 (if elementa==end before);
     *       elementa=(elementa+1)%q.length (if elementa!=end before);
     *       R=el
     */
    public E dequeue() {
        if (size==0) {
            System.out.println("Нечего удалять, очередь и так пуста");
            return null;
        }
        if (elementa==end) {
            size--;
            E el=q[elementa];
            int el1=elementa;
            elementa=-1;
            end=-1;
            System.out.println("Элемент удалён");
            E[] q1=(E[]) new Object[this.capacity];
            for (int i=0;i< q.length;i++) {
                if (i!=el1) q1[i]=q[i];
            }
            q=null;
            q=q1;
            return el;
        }
        E el=q[elementa];
        E[] q1=(E[]) new Object[this.capacity];
        for (int i=0;i< q.length;i++) {
            if (i!=elementa) q1[i]=q[i];
        }
        q=null;
        q=q1;
        elementa=(elementa+1)%q.length;
        size--;
        System.out.println("Элемент удалён");
        return el;
    }

    /**
     * Pre: -
     * Post: R=(size==0);
     */
    public boolean isEmpty() {
        return size==0;
    }

    /**
     * Pre: !isEmpty()
     * Post: size=0
     */
    public void clear() {
        while (!isEmpty())
            dequeue();
    }




}
