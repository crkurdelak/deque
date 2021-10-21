import javax.naming.ConfigurationException;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A list of elements of type E.
 *
 * @param <E> the type of elements in this list
 *
 * @author ckurdelak20@georgefox.edu
 */
public class LinkedList<E> implements Iterable<E> {
    // TODO implement class
    // TODO use fail-fast iteration

    // TODO Ensure that your iterator class implements fail-fast semantics and throws a
    //  ConcurrentModificationException if the collection is structurally modified (i.e., if a
    //  node is removed or added) once an iterator over the list is constructed.  This should be
    //  accomplished by tracking the modification count of the list itself, and storing a
    //  snapshot of that count inside the iterator during construction.

    // TODO copy/paste method signatures/javadocs from ArrayList

    // TODO LinkedListNode and LinkedListIterator inner classes

    // uses nodes to store stuff

    // for constructing iterators
    private static boolean REVERSED = true;
    private static boolean NOT_REVERSED = false;

    private LinkedListNode<E> _head;
    private LinkedListNode<E> _tail;
    private int _size;
    private long _modCount; // TODO increment this whenever list is modified

    /**
     * Creates a new LinkedList.
     */
    public LinkedList() {
        _head = null;
        _tail = null;
        _size = 0;
        _modCount = 0;
    }


    /**
     * Inserts the specified element at the specified position in this list. Shifts the element
     * currently at that position (if any) and any subsequent elements to the right (adds one to
     * their indices).
     *
     * @param index the index where the element will be inserted
     * @param element the element to be inserted
     * @throws IndexOutOfBoundsException if the specified index is out of range
     */
    public void add(int index, E element) {
        // TODO implement insert add
    }


    /**
     * Appends the specified element to the end of this list.
     *
     * @param element the element to be appended to this list
     * @return true if this collection has changed as a result of the call
     * @throws IndexOutOfBoundsException if the specified index is out of range
     */
    public boolean add(E element) {
        LinkedListNode<E> newNode;
        if (this.size() == 0) {
            newNode = new LinkedListNode<>(element);
            _tail = newNode;
        }
        else {
            // create new node
            newNode = new LinkedListNode<>(element);
            // set newNode's prev and next to null
            // set newNode's value
            // set newNode's prev to current tail
            newNode.setPrevious(_tail);
            // set current tail's next to newNode
            _tail.setNext(newNode);
            // set newNode as tail
            _tail = newNode;
        }
        // increment _size
        _size++;
        // increment _modCount
        _modCount++;

        return true;
    }


    /**
     * Removes all the elements from this list. The list will be empty after this call returns.
     */
    public void clear() {
        // let go of head and tail
        _head.setValue(null);
        _tail.setValue(null);
        _size = 0;
        _modCount++;
    }


    /**
     * Returns the element at the specified position in this list.
     *
     * @param index the index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public E get(int index) {
        // TODO implement get
    }


    /**
     * Returns the index of the first occurrence of the specified element in this list,
     * or -1 if this list does not contain the element.
     *
     * More formally, returns the lowest index i such that
     * Objects.equals(o, get(i)), or -1 if there is no such index.
     *
     * @param element the element to search for
     * @return the index of the first occurrence of the specified element in this list,
     * or -1 if this list does not contain the element.
     */
    public int indexOf(E element) {
        // TODO implement indexOf
        // use iterator?
        // currentNode = _head
        // while there is still another node and currentNode's value != value
        //      go to next node
        //      currentNode = currentNode.getNext();
        //      i++
    }



    /**
     * Returns true if this list contains no elements.
     *
     * @return true if this list contains no elements
     * false if this list contains elements
     */
    public boolean isEmpty() {
        return (_size == 0);
    }


    /**
     * Removes and returns the element from the specified position in this list.
     * Shifts any subsequent elements to the left (subtracts one from their indices)
     *
     * @param index the index of the element to be removed
     * @return the element that was removed from the list
     * @throws IndexOutOfBoundsException if the specified index is out of range
     */
    public E remove(int index) {
        // TODO implement remove
    }


    /**
     * Replaces the element at the specified position in this list with the specified element.
     *
     * @param index the index of the element to replace
     * @param element the element to be stored at the specified position
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException if the specified index is out of range
     */
    public E set(int index, E element) {
        // TODO implement set
    }


    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
    public int size() {
        return _size;
    }


    /**
     * Returns a new LinkedListIterator object that iterates from head to tail.
     *
     * @return a new LinkedListIterator object that iterates from head to tail
     */
    public Iterator<E> iterator() {
        // TODO implement iterator
        return new LinkedListIterator(NOT_REVERSED);
    }


    /**
     * Returns a new LinkedListIterator object that iterates from tail to head.
     *
     * @return a new LinkedListIterator object that iterates from tail to head
     */
    public Iterator<E> reverseIterator() {
        // TODO implement reverseIterator
        return new LinkedListIterator(REVERSED);
    }


    /**
     * A node that stores a single element in a LinkedList as well as references to its adjacent
     * nodes.
     *
     * @param <E> the type of element stored in this node
     */
    private class LinkedListNode<E> {
        // TODO implement class LinkedListNode

        E _value;
        LinkedListNode<E> _prev;
        LinkedListNode<E> _next;

        /**
         * Constructs a new LinkedListNode.
         */
        public LinkedListNode() {
            this(null);
        }


        /**
         * Constructs a new LinkedListNode with the given value.
         *
         * @param value the value stored in this LinkedListNode
         */
        public LinkedListNode(E value) {
            this(value, null, null);
        }


        /**
         * Constructs a new LinkedListNode with the given value.
         *
         * @param value the value stored in this LinkedListNode
         * @param prev the previous LinkedListNode
         * @param next the next LinkedListNode
         */
        public LinkedListNode(E value, LinkedListNode<E> prev, LinkedListNode<E> next) {
            // TODO find out what to do about validation
            _value = value;
            _prev = prev;
            _next = next;
        }


        /**
         * Returns the value of this LinkedListNode.
         *
         * @return the value of this LinkedListNode
         */
        public E getValue() {
            return _value;
        }


        /**
         * Returns the previous LinkedListNode.
         *
         * @return the previous LinkedListNode
         */
        public LinkedListNode<E> getPrevious() {
            return _prev;
        }


        /**
         * Returns the next LinkedListNode.
         *
         * @return the next LinkedListNode
         */
        public LinkedListNode<E> getNext() {
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
        public void setPrevious(LinkedListNode<E> prev) {
            _prev = prev;
        }


        /**
         * Sets the next attribute to a new node.
         *
         * @param next the new next node
         */
        public void setNext(LinkedListNode<E> next) {
            _next = next;
        }
    }


    /**
     * Implements the Iterator<T> interface for the LinkedList class.
     *
     * Uses fail-fast iteration.
     */
    private class LinkedListIterator implements Iterator<E> {
        // TODO implement LinkedListIterator
        // TODO have a copy of _modCount as it was when iterator was constructed
        // TODO check against LL's _modCount, and if it is different, stop iteration

        private int _currentIndex;
        private boolean _reverse;
        private long _modCountCopy;

        /**
         * Constructs a new LinkedListIterator object.
         *
         * @param reverse true if this iterator is a reverse iterator, else false
         */
        public LinkedListIterator(boolean reverse) {
            _currentIndex = 0;
            _reverse = reverse;
            _modCountCopy = _modCount;
        }

        /**
         * Returns true if the current index is less than the size of the LinkedList, else
         * returns false.
         *
         * @return true if the current index is less than the size of the LinkedList
         * else return false
         * @throws ConcurrentModificationException if the list has been modified since iteration
         * started
         */
        public boolean hasNext() {
            if (_modCountCopy == _modCount) {
                // TODO hangle reverse iteration
                return _currentIndex < _size;
            }
            else {
                throw new ConcurrentModificationException();
            }
        }


        /**
         * Returns the next element in this iteration.
         *
         * @return the next element in this iteration
         * @throws ConcurrentModificationException if the list has been modified since iteration
         * started
         */
        public E next() {
            if (_modCountCopy == _modCount) {
                // TODO handle reverse iteration
                E item = get(_currentIndex);
                if (item == null) {
                    throw new NoSuchElementException();
                }
                _currentIndex++;
                return item;
            }
            else {
                throw new ConcurrentModificationException();
            }
        }
    }
}

