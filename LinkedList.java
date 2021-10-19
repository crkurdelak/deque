import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A list of elements of type E.
 *
 * @param <E> the type of elements in this list
 *
 * @author ckurdelak20@georgefox.edu
 */
public class LinkedList<E> {
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

    private LinkedListNode<E> _head;
    private LinkedListNode<E> _tail;
    private int _size;

    public void LinkedList() {
        // TODO implement ctor
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
        // TODO implement append add
    }


    /**
     * Removes all the elements from this list. The list will be empty after this call returns.
     */
    public void clear() {
        // TODO implement clear
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
    }



    /**
     * Returns true if this list contains no elements.
     *
     * @return true if this list contains no elements
     * false if this list contains elements
     */
    public boolean isEmpty() {
        return _index == 0;
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
        return _index;
    }


    /**
     * Returns a new LinkedListIterator object that iterates from head to tail.
     *
     * @return a new LinkedListIterator object that iterates from head to tail
     */
    public Iterator<E> iterator() {
        // TODO implement iterator
    }


    /**
     * Returns a new LinkedListIterator object that iterates from tail to head.
     *
     * @return a new LinkedListIterator object that iterates from tail to head
     */
    public Iterator<E> reverseIterator() {
        // TODO implement reverseIterator
    }


    /**
     * A node that stores a single element in a LinkedList as well as references to its adjacent
     * nodes.
     *
     * @param <E> the type of element stored in this node
     */
    private class LinkedListNode<E> {
        // TODO implement class LinkedListNode

        /**
         * Constructs a new LinkedListNode.
         */
        public LinkedListNode() {
            // TODO implement LLN default ctor
        }


        /**
         * Constructs a new LinkedListNode with the given value.
         *
         * @param value the value stored in this LinkedListNode
         */
        public LinkedListNode(E value) {
            // TODO implement LLN ctor with value parameter
        }


        /**
         * Constructs a new LinkedListNode with the given value.
         *
         * @param value the value stored in this LinkedListNode
         * @param prev the previous LinkedListNode
         * @param next the next LinkedListNode
         */
        public LinkedListNode(E value, LinkedListNode<E> prev, LinkedListNode<E> next) {
            // TODO implement LLN ctor with value, prev, and next parameters
        }


        /**
         * Returns the value of this LinkedListNode.
         *
         * @return the value of this LinkedListNode
         */
        public E getValue() {
            // TODO implement getValue
        }


        /**
         * Returns the previous LinkedListNode.
         *
         * @return the previous LinkedListNode
         */
        public LinkedListNode<E> getPrevious() {
            // TODO implement getPrevious
        }


        /**
         * Returns the next LinkedListNode.
         *
         * @return the next LinkedListNode
         */
        public LinkedListNode<E> getNext() {
            // TODO implement getNext
        }


        /**
         * Sets the value of this node to a new value.
         *
         * @param value the new value of this node
         */
        public void setValue(E value) {
            // TODO implement setValue
        }


        /**
         * Sets the prev attribute to a new node.
         *
         * @param prev the new previous node
         */
        public void setPrevious(LinkedListNode<E> prev) {
            // TODO implement setPrevious
        }


        /**
         * Sets the next attribute to a new node.
         *
         * @param next the new next node
         */
        public void setNext(LinkedListNode<E> next) {
            // TODO implement setNext
        }
    }


    /**
     * Implements the Iterator<T> interface for the LinkedList class.
     *
     * Uses fail-fast iteration.
     */
    private class LinkedListIterator {
        // TODO implement LinkedListIterator

        /**
         * Constructs a new LinkedListIterator object.
         *
         * @param reverse true if this iterator is a reverse iterator, else false
         */
        public LinkedListIterator(boolean reverse) {
            // TODO implement LLI ctor
        }

        /**
         * Returns true if the current index is less than the size of the LinkedList, else
         * returns false.
         *
         * @return true if the current index is less than the size of the LinkedList
         * else return false
         */
        public boolean hasNext() {
            // TODO implement hasNext
        }


        /**
         * Returns the next element in this iteration.
         *
         * @return the next element in this iteration
         * @throws NoSuchElementException if the item at the current index is null
         */
        public E hasNext() {
            // TODO implement hasNext
        }
    }
}

