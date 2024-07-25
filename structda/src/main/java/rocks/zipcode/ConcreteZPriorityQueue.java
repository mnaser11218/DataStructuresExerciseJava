package rocks.zipcode;

import java.util.*;

public class ConcreteZPriorityQueue<E> implements ZPriorityQueue<E>{
//    static class Item {
//        public String value;
//        public Integer priority;
//    };
//    static Item[] item = new Item[10000];
//
//    // Pointer to the last index
//    static int size =-1;
//Queue<E>elements= new PriorityQueue<E>();
    //Queue<Obj> queue = new PriorityQueue<Obj> ();
private static class PriorityQueueElement<E> {
    E element;
    Integer priority;

    PriorityQueueElement(E element, Integer priority) {
        this.element = element;
        this.priority = priority;
    }
}
    List<PriorityQueueElement<E>> elements = new ArrayList<>();


    @Override
    public void enqueue(E element, Integer priority) {
        // TODO Auto-generated method stu
       // Queue<String>queue= new Qu<>();
        //queue.
       /// queue.add((String) element);
        elements.add(new PriorityQueueElement<>(element, priority));
        // Optional: Reorder elements based on priority
        elements.sort((e1, e2) -> e2.priority - e1.priority);

        // throw new UnsupportedOperationException("Unimplemented method 'enqueue'");
    }

    @Override
    public E dequeue(Integer priority) {
        // TODO Auto-generated method stub
       // return (E) queue.
       // throw new UnsupportedOperationException("Unimplemented method 'dequeue'");
        for (PriorityQueueElement<E> elem : elements) {
            if (elem.priority.equals(priority)) {
                elements.remove(elem);
                return elem.element;
            }
        }
        // Return null or throw an exception if no element with the specified priority is found
        return null;
       // throw new UnsupportedOperationException("Unimplemented method 'peek'");
    }

    @Override
    public E peek(Integer priority) {
        // TODO Auto-generated method stub
        for (PriorityQueueElement<E> elem : elements) {
            if (elem.priority.equals(priority)) {
                return elem.element;
            }
        }
        // Return null if no element with the specified priority is found
        return null;
       // throw new UnsupportedOperationException("Unimplemented method 'peek'");
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
       return elements.size();
       // throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public int size(Integer priority) {
        // TODO Auto-generated method stub
        int count = 0;
        for (PriorityQueueElement<E> elem : elements) {
            if (elem.priority.equals(priority)) {
                count++;
            }
        }
        return count;
       // throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();


        // TODO Auto-generated method stub
      //  throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

}
