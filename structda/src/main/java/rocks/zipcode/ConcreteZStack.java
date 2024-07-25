package rocks.zipcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class ConcreteZStack<E> implements ZStack<E>{

    Deque<E> deque = new ArrayDeque<>();

    @Override
    public void push(E item) {
        // TODO Auto-generated method stub
        deque.push(item);
      //  throw new UnsupportedOperationException("Unimplemented method 'push'");
    }

    @Override
    public E pop() {
        // TODO Auto-generated method stub
        return deque.pop();

       // throw new UnsupportedOperationException("Unimplemented method 'pop'");
    }

    @Override
    public E peek() {
        // TODO Auto-generated method stub
        return deque.peek();
       // throw new UnsupportedOperationException("Unimplemented method 'peek'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
        return deque.isEmpty();
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'size'");
        return deque.size();
    }

}
