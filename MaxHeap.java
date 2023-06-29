public class MaxHeap <T>{
    
    public Object[] heap_array;
    public int heap_size;
    public int capacity;

    public MaxHeap(){

        this.capacity = 16;
        heap_array = new Object[capacity];

    }

    public MaxHeap(int capacity){

        this.capacity = capacity;
        heap_array = new Object[capacity];

    }

}
