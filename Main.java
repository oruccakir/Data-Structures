public class Main {
    
    public static void main(String[] args) {
        
        MinHeap<Integer> heap2 = new MinHeap<>(10);

        for(int i=0; i<10; i++) heap2.insertKey(i);
        
        System.out.println(heap2);


       

    }
    
}
