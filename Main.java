import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        int arr[] = {4,1,3,2,7,9,10,14,8,16};

        Heap.heapSortIncrease(arr, arr.length);
       
        System.out.println(Arrays.toString(arr));
       
       
       


    }
}
