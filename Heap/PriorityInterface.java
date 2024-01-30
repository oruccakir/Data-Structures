

public interface PriorityInterface <T> {
    
    public void add(T data);

    public T peek();

    public T pop();

    public boolean isEmpty();

    public boolean isFull();

    public boolean contains(Object data);

    public T[] toArray();

    public void clear();

    public int size();

    public boolean equals(Object o);

    public String toString();



}
