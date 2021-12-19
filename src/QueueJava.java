/**
 * Метод enqueue реализует вставку элемента в конец очереди
 * Метод element реализует возвращение первого элемента очереди без удаления
 * Метод dequeue реализует удаление первого элемента очереди
 */
public interface QueueJava<E> {
    public void enqueue(E element);
    public E element();
    public E dequeue();

}
