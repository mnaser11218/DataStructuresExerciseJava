package rocks.zipcode;

import java.util.*;

public class ZQueueImpl<E> implements ZQueue<E>{
   // ZQueue<E> queue = new ZQueueImpl<>();
   // Queue<E> queue = new

    Deque<E>queuer = new ArrayDeque<>();

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
//throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
        return queuer.isEmpty();
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
      //  throw new UnsupportedOperationException("Unimplemented method 'size'");
        return queuer.size();
    }

    @Override
    public void enqueue(E element) {
        // TODO Auto-generated method stub
      queuer.add(element);
       // throw new UnsupportedOperationException("Unimplemented method 'enqueue'");
    }

    @Override
    public E dequeue() {
        // TODO Auto-generated method stub
      return queuer.removeFirst();
       //throw new UnsupportedOperationException("Unimplemented method 'dequeue'");
    }

    @Override
    public E peek() {
        // TODO Auto-generated method stub
        return queuer.peek();
       // throw new UnsupportedOperationException("Unimplemented method 'peek'");
    }

}
