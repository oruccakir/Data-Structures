import java.util.Arrays;

public class Heap {

    public static void swap(int arr[], int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    
    public static void minHeapify(int arr[], int i,int n){

        int smallest = i;
        int left = 2*i+1, right = 2*i+2;

        if(left < n && arr[left] < arr[smallest]) smallest = left;

        if(right < n && arr[right] < arr[smallest]) smallest = right;

        if(smallest != i){

            swap(arr, smallest,i);
            minHeapify(arr, smallest, n);

        }


    }

    public static void maxHeapify(int arr[], int i,int n){

        int largest = i;
        int left = 2*i+1, right = 2*i+2;

        if(left < n && arr[left] > arr[largest]) largest = left;

        if(right < n && arr[right] > arr[largest]) largest = right;

        if(largest != i){

            swap(arr, largest,i);
            maxHeapify(arr, largest, n);

        }


    }


    public static void buildMinHeap(int arr[],int n){

        for(int i=n/2-1; i>=0; i--){
            minHeapify(arr, i, n);
        }

    }

    public static void buildMaxHeap(int arr[],int n){

        for(int i=n/2-1; i>=0; i--){
            maxHeapify(arr, i, n);
        }

    }

    public static void heapSortDecrease(int arr[],int n){

        buildMinHeap(arr, n);

        for(int i=n-1; i>=0; i--){

            swap(arr, 0, i);

            minHeapify(arr, 0, i);

        }

    }

    public static void heapSortIncrease(int arr[],int n){

        buildMaxHeap(arr, n);

        for(int i=n-1; i>=0; i--){

            swap(arr, 0, i);

            maxHeapify(arr, 0, i);

        }

    }

    public static <T> int height(T[] heap,int index,int size){

        int left = 2*index+1;
        int right = 2*index+2;

        if((left < size && heap[left] == null || left >= size ) && (right < size && heap[right] == null || right >= size ) ) return 0;

        return 1 + Math.max(height(heap, left,size),height(heap, right,size));

    }

    public static void main(String[] args) {
        
        int arr[] = {1,8,6,5,1,4,2,9};

        heapSortDecrease(arr, arr.length);

        heapSortIncrease(arr, arr.length);

        System.out.println(Arrays.toString(arr));

    }

}
