public class MaxHeap {
    
    public Integer[] heap_array;
    public int heap_size;
    public int capacity;
    public int index = -1;

    public MaxHeap(){

        this.capacity = 16;
        heap_array = new Integer[capacity];

    }

    public MaxHeap(int capacity){

        this.capacity = capacity;
        heap_array = new Integer[capacity];

    }

    public int leftIndex(int index){
        return 2*index +1;
    }

    public int rightIndex(int index){
        return 2*index+2;
    }

    public int parentIndex(int index){
        return (index - 1) / 2;
    }

    public Integer getMax(){

        if(isEmpty()) return null;

        return heap_array[0];

    }

    public boolean isEmpty(){

        return index == -1;

    }

    public boolean isFull(){
        return heap_size == capacity;
    }

    public void swap(int index1, int index2){

        Integer temp = heap_array[index1];
        heap_array[index1] = heap_array[index2];
        heap_array[index2] = temp;

    }

    public void MaxHeapify(int index){

        int l = leftIndex(index);
        int r = rightIndex(index);

        int maxIndex = index;

        if(l < heap_size &&  heap_array[l] > heap_array[maxIndex]) maxIndex = l;

        if(r < heap_size &&  heap_array[r] > heap_array[maxIndex]) maxIndex = r;

        if(maxIndex != index){

            swap(index, maxIndex);

            MaxHeapify(maxIndex);

        }

    }

    public Integer extractMax(){

        if(isEmpty()) return null;

        if(heap_size == 1){

            Integer deletedElement = heap_array[index];

            heap_array[index] = null;

            index --;

            heap_size--;

            return deletedElement;

        }

        Integer deletedElement = heap_array[0];

        heap_array[0] = heap_array[index];

        heap_array[index] = null;

        heap_size --;

        index--;

        MaxHeapify(0);

        return deletedElement;

    }


    public void increaseKey(int index){

        heap_array[index] = Integer.MAX_VALUE;

        while(index != 0 && heap_array[parentIndex(index)] < heap_array[index]){

            swap(index, parentIndex(index));

            index = parentIndex(index);

        }

    }

    public Integer deleteKey(int index){

        if(isEmpty()) return null;

        increaseKey(index);

        return extractMax();

    }


    public void insertKey(Integer data){

        if(isFull()) return;

        heap_size++;
        this.index++;

        int index = this.index;

        heap_array[index] = data;

        while(index != 0 && heap_array[parentIndex(index)] < heap_array[index]){

            swap(index, parentIndex(index));

            index = parentIndex(index);

        }

    }



    public String toString(){

        StringBuilder str = new StringBuilder();

        str.append("[ ");

        for(int i=0; i<=index; i++){

            str.append(heap_array[i]+ " ");

        }

        str.append("]");

        return str.toString();

    }

}
