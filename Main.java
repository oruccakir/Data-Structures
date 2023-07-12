public class Main {
    
    public static void main(String[] args) {
        
        int k = 6;

        Integer arr[] = {1,5,9,6,1,21,12,15,14};

        PriorityQueue<Integer> pq = new PriorityQueue<>("Min",arr.length);

        for(int i=0; i<arr.length; i++){

                pq.add(arr[i]);
        }
    
        System.out.println();

        pq.pop();
        pq.add(0);
        pq.pop();
        pq.pop();
        pq.pop();
        pq.pop();
        pq.pop();
        pq.pop();
        pq.pop();
        pq.pop();
        pq.pop();

        pq.print_as_tree();

       

       
       
       


    }
}
