public interface DoubleEndedInterface<T extends Comparable<T>> {
    /**
     * Checks if the priority queue is empty.
     * 
     * @return true if the priority queue is empty, false otherwise.
     */
    boolean isEmpty();
    
    /**
     * Returns the number of elements in the priority queue.
     * 
     * @return the number of elements.
     */
    int size();
    
    /**
     * Adds an element to the priority queue.
     * 
     * @param data the element to be added.
     */
    void add(T data);
    
    /**
     * Retrieves, but does not remove, the first element of the priority queue.
     * 
     * @return the first element.
     */
    T peekFirst();
    
    /**
     * Retrieves, but does not remove, the last element of the priority queue.
     * 
     * @return the last element.
     */
    T peekLast();
    
    /**
     * Retrieves and removes the first element of the priority queue.
     * 
     * @return the first element.
     */
    T pollFirst();
    
    /**
     * Retrieves and removes the last element of the priority queue.
     * 
     * @return the last element.
     */
    T pollLast();
    
    /**
     * Checks if the priority queue contains the specified element.
     * 
     * @param data the element to check for.
     * @return true if the element is present, false otherwise.
     */
    boolean contains(T data);
    
    /**
     * Removes a single instance of the specified element from the priority queue.
     * 
     * @param data the element to remove.
     * @return the removed element, or null if not found.
     */
    void remove(T data);


}
