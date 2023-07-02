public class Main {
    
    public static void main(String[] args) {
        
        int k = 6;

        int arr[] = {1,5,9,6,1,21};

        PriorityQueue<Integer> pq = new PriorityQueue<>(k);

        for(int i=0; i<arr.length; i++){

            if(pq.size() == k && pq.peek()<arr[i]){

                pq.pop();
                pq.add(arr[i]);

            }

            else{
                pq.add(arr[i]);
            }

        }

        System.out.println(pq.peek());

       

    }
    
}
