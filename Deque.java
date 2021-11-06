import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A double-ended queue of elements of type E.
 *
 * @param <E> the type of elements in this double-ended queue
 *
 * @author ckurdelak20@georgefox.edu
 */
public class Deque<E> implements Iterable<E> {

    // for constructing iterators
    private static final boolean REVERSED = true;
    private static final boolean NOT_REVERSED = false;

    private DequeNode<E> _head;
    private DequeNode<E> _tail;
    private int _depth;


    /**
     * Creates a new Deque.
     */
    public Deque() {
        _head = null;
        _tail = null;
    }


    /**
     * Adds the specified element to the end of this Deque.
     *
     * @param element the element to be enqueued
     * @return true if this collection has changed as a result of the call
     */
    public boolean enqueue(E element) {
        DequeNode<E> newNode;
        if (isEmpty()) {
            newNode = new DequeNode<>(element);
            _head = newNode;
            _tail = newNode;
        }
        else {
            newNode = new DequeNode<>(element);
            newNode.setPrevious(_tail);
            _tail.setNext(newNode);
            _tail = newNode;
        }
        _depth ++;
        return true;
    }


    /**
     * Adds the specified element to the head of this Deque.
     *
     * @param element the element to be enqueued
     * @return true if this collection has changed as a result of the call
     */
    public boolean enqueueHead(E element) {
        DequeNode<E> newNode;
        if (isEmpty()) {
            newNode = new DequeNode<>(element);
            _head = newNode;
            _tail = newNode;
        }
        else {
            newNode = new DequeNode<>(element);
            newNode.setNext(_head);
            _head.setPrevious(newNode);
            _head = newNode;
        }
        _depth ++;
        return true;
    }


    /**
     * Enqueues all given elements.
     *
     * @param elements an iterable collection of elements to enqueue
     */
    public void enqueueAll(Iterable<E> elements) {
        for (E element : elements) {
            this.enqueue(element);
        }
    }


    /**
     * Returns the value at the head of this Deque without dequeueing it.
     *
     * @return the value at the head of this Deque.
     * @throws NoSuchElementException if the Deque is empty
     */
    public E head() {
        if (!isEmpty()) {
            return _head.getValue();
        }
        else {
            throw new NoSuchElementException();
        }
    }


    /**
     * Returns the value at the tail of this Deque without dequeueing it.
     *
     * @return the value at the tail of this Deque.
     * @throws NoSuchElementException if the Deque is empty
     */
    public E tail() {
        if (!isEmpty()) {
            return _tail.getValue();
        }
        else {
            throw new NoSuchElementException();
        }
    }


    /**
     * Removes and returns the head of this Deque.
     *
     * @return the value of the head of this Deque
     * @throws NoSuchElementException if the Deque is empty
     */
    public E dequeue() {
        if (!isEmpty()) {
            DequeNode<E> oldHead = _head;
            _head = oldHead.getNext();

            _depth --;
            return oldHead.getValue();
        }
        else {
            throw new NoSuchElementException();
        }
    }


    /**
     * Removes and returns the tail of this Deque.
     *
     * @return the value of the tail of this Deque
     * @throws NoSuchElementException if the Deque is empty
     */
    public E dequeueTail() {
        if (!isEmpty()) {
            DequeNode<E> oldTail = _tail;
            _tail = oldTail.getPrevious();

            _depth --;
            return oldTail.getValue();
        }
        else {
            throw new NoSuchElementException();
        }
    }


    /**
     * Removes all the elements from this Deque. The Deque will be empty after this call returns.
     */
    public void clear() {
        _head = null;
        _tail = null;
        _depth = 0;
    }


    /**
     * Returns true if this Deque contains no elements.
     *
     * @return true if this Deque contains no elements
     * false if this Deque contains elements
     */
    public boolean isEmpty() {
        return (_depth == 0);
    }


    /**
     * Returns the number of elements in this Deque.
     *
     * @return the number of elements in this Deque
     */
    public int depth() {
        return _depth;
    }


    /**
     * Returns a new DequeIterator object that iterates from head to tail.
     *
     * @return a new DequeIterator object that iterates from head to tail
     */
    public Iterator<E> iterator() {
        return new DequeIterator(NOT_REVERSED);
    }


    /**
     * Returns a new DequeIterator object that iterates from tail to head.
     *
     * @return a new DequeIterator object that iterates from tail to head
     */
    public Iterator<E> reverseIterator() {
        return new DequeIterator(REVERSED);
    }


    /**
     * A node that stores a single element in a Deque as well as references to its adjacent
     * nodes.
     *
     * @param <E> the type of element stored in this node
     */
    private class DequeNode<E> {

        private E _value;
        private DequeNode<E> _prev;
        private DequeNode<E> _next;

        /**
         * Constructs a new DequeNode.
         */
        public DequeNode() {
            this(null);
        }


        /**
         * Constructs a new DequeNode with the given value.
         *
         * @param value the value stored in this DequeNode
         */
        public DequeNode(E value) {
            this(value, null, null);
        }


        /**
         * Constructs a new DequeNode with the given value.
         *
         * @param value the value stored in this DequeNode
         * @param prev the previous DequeNode
         * @param next the next DequeNode
         */
        public DequeNode(E value, DequeNode<E> prev, DequeNode<E> next) {
            _value = value;
            _prev = prev;
            _next = next;
        }


        /**
         * Returns the value of this DequeNode.
         *
         * @return the value of this DequeNode
         */
        public E getValue() {
            return _value;
        }


        /**
         * Returns the previous DequeNode.
         *
         * @return the previous DequeNode
         */
        public DequeNode<E> getPrevious() {
            return _prev;
        }


        /**
         * Returns the next DequeNode.
         *
         * @return the next DequeNode
         */
        public DequeNode<E> getNext() {
            return _next;
        }


        /**
         * Sets the value of this node to a new value.
         *
         * @param value the new value of this node
         */
        public void setValue(E value) {
            _value = value;
        }


        /**
         * Sets the prev attribute to a new node.
         *
         * @param prev the new previous node
         */
        public void setPrevious(DequeNode<E> prev) {
            _prev = prev;
        }


        /**
         * Sets the next attribute to a new node.
         *
         * @param next the new next node
         */
        public void setNext(DequeNode<E> next) {
            _next = next;
        }
    }


    /**
     * Implements the Iterator<T> interface for the Deque class.
     */
    private class DequeIterator implements Iterator<E> {

        private final boolean _reverse;

        /**
         * Constructs a new DequeIterator object.
         *
         */
        public DequeIterator(boolean reverse) {
            _reverse = reverse;
        }

        /**
         * Returns true if there are more elements in this iteration, else returns false.
         *
         * @return true if there are more elements in this iteration
         * else return false
         */
        public boolean hasNext() {
            return (!isEmpty());
        }


        /**
         * Returns the next element in this iteration.
         *
         * @return the next element in this iteration
         * @throws NoSuchElementException if the iteration has no more elements
         */
        public E next() {
            if (hasNext()) {
                if (_reverse) {
                    return dequeueTail();
                }
                else {
                    return dequeue();
                }
            }
            else {
                throw new NoSuchElementException();
            }
        }
    }
}

