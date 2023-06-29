public class Main {
    
    public static void main(String[] args) {
        
        MinHeap heap = new MinHeap(10);

        for(int i=0; i<heap.capacity; i++) heap.insertKey(i);

        heap.deleteKey(5);
        heap.deleteKey(2);
        System.out.println(heap);


       

    }
    
}
