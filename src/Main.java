public class Main {
    public static void main(String[] args) {
        ArrayQueue <Integer> q=new ArrayQueue<>(5);
        /*q.enqueue(4);
        q.enqueue(9);
        q.enqueue(2);
        q.enqueue(1);
        q.enqueue(6);
        q.isEmpty();
        System.out.println(q.element());
        q.dequeue();
        System.out.println(q.element());
        q.dequeue();
        System.out.println(q.element());
        q.enqueue(7);
        System.out.println(q.element());
        q.clear();
        q.enqueue(3);
        q.enqueue(24);
        q.enqueue(1);
        q.enqueue(85);
        q.enqueue(4);
        System.out.println(q.element());*/
        /*ArrayQueueModule <Integer> q1=new ArrayQueueModule<>(5);
        q1.enqueue(4);
        q1.enqueue(9);
        q1.enqueue(2);
        q1.enqueue(1);
        q1.enqueue(6);
        System.out.println(q1.element());
        q1.dequeue();
        System.out.println(q1.element());
        ArrayQueueADT <Integer> q2=new ArrayQueueADT<>();
        q2.enqueue(3,q);
        q2.enqueue(1,q);
        q2.enqueue(5,q);
        q2.enqueue(2,q);
        q2.enqueue(8,q);
        System.out.println(q2.element(q));*/
        LinkedQueue<Integer> a=new LinkedQueue<>();
        a.enqueue(3);
        a.enqueue(7);
        a.enqueue(9);
        a.enqueue(2);
        a.enqueue(4);
        a.dequeue();
        a.dequeue();
        System.out.println(a.element());
    }

}
