public class Main {
    
    public static void main(String[] args) {
        
        MaxHeap heap = new MaxHeap(10);
        MinHeap heap2 = new MinHeap(10);

        for(int i=9; i>=0; i--) heap.insertKey(i);
        for(int i=0; i<10; i++) heap2.insertKey(i);

        heap.deleteKey(7);
        heap.extractMax();
        heap.extractMax();

        System.out.println(heap);
        System.out.println(heap2);


       

    }
    
}
