public class PriorityQueue<T extends Comparable<T>> implements PriorityInterface<T> {

    private MaxHeap<T> maxHeap;
    private MinHeap<T> minHeap;
    String type = "Min";
    public int capacity;

    public PriorityQueue(){

        minHeap = new MinHeap<>();
        this.capacity = minHeap.capacity;

    }

    public PriorityQueue(int capacity){

        minHeap = new MinHeap<>(capacity);
        this.capacity = minHeap.capacity;

    }

    public PriorityQueue(String type){

        if(type.equals("Max")) {

            maxHeap = new MaxHeap<>();
            this.capacity = maxHeap.capacity;

        }
        else{
            minHeap = new MinHeap<>();
            this.capacity = minHeap.capacity;
        } 

        this.type = type;

    }



    public PriorityQueue(String type,int capacity){

        if(type.equals("Max")) {

            maxHeap = new MaxHeap<>(capacity);
            this.capacity = maxHeap.capacity;

        }
        else{

            minHeap = new MinHeap<>(capacity);
            this.capacity = minHeap.capacity;

        } 

        this.type = type;

    }

    @Override
    public void add(T data) {

        if(this.type.equals("Min")){

            if(minHeap.isFull()) return;

            minHeap.insertKey(data);

        }
        else{

            if(maxHeap.isFull()) return;

            maxHeap.insertKey(data);

        }

    }

    @Override
    public void clear() {
        
        if(this.type.equals("Min")){

            minHeap.heap_array = new Object[minHeap.capacity];
            minHeap.heap_size = 0;
            minHeap.index = -1;

        }

        else{

            maxHeap.heap_array = new Object[maxHeap.capacity];
            maxHeap.heap_size = 0;
            maxHeap.index = -1;

        }
        
    }

    @Override
    public boolean contains(Object data) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isEmpty() {
        
        if(type.equals("Min")){
            return minHeap.isEmpty();
        }
        else{
            return maxHeap.isEmpty();
        }

    }

    @Override
    public boolean isFull() {
        
        if(type.equals("Min")){
            return minHeap.isFull();
        }
        else{
            return maxHeap.isFull();
        }

    }

    @Override
    public T peek() {
        
        if(type.equals("Min")){
            return minHeap.getMin();
        }
        
        else{
            return maxHeap.getMax();
        }
    }

    @Override
    public T pop() {
        
        if(type.equals("Min")){
            return minHeap.extractMin();
        }
        
        else{
            return maxHeap.extractMax();
        }

    }

    @Override
    public int size() {
       
        if(type.equals("Min")){
            return minHeap.heap_size;
        }
        
        else{
            return maxHeap.heap_size;
        }
       
    }

    @Override
    public T[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
