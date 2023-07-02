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

        if(data == null) return false;
        
        boolean isContain = false;

        Object [] data_arrray = null;

        if(type.equals("Min")){
            data_arrray = minHeap.heap_array;
        }
        else{
            data_arrray = maxHeap.heap_array;
        }

        int index = 0;

        while(index < data_arrray.length && !isContain){

            if(data_arrray[i].equals(data)) isContain = true;

        }
        

        return isContain;


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
        
        Object[] arr = null;

        Object [] data_arrray = null;

        if(type.equals("Min")){
            data_arrray = minHeap.heap_array;
        }
        else{
            data_arrray = maxHeap.heap_array;
        }

        arr = new Object[data_arrray.length];

        for(int i=0; i<arr.length; i++){
            arr[i] = data_arrray[i];
        }

        return (T[])arr;
    }

    
    
}
