

public class MinHeap <T extends Comparable<T> >{

    public Object[] heap_array;
    public int heap_size;
    public int capacity;
    public int index = -1;

    public MinHeap(){

        this.capacity = 16;
        heap_array = new Object[capacity];

    }

    public MinHeap(int capacity){

        this.capacity = capacity;
        heap_array = new Object[capacity];

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
    
    public T getMin(){

        if(isEmpty()) return null;

        return (T)heap_array[0];

    }

    public boolean isEmpty(){

        return index == -1;

    }

    public boolean isFull(){
        return heap_size == capacity;
    }


    public void swap(int index1, int index2){

        Object temp = heap_array[index1];
        heap_array[index1] = heap_array[index2];
        heap_array[index2] = temp;

    }

    public void MinHeapify(int index){

        int l = leftIndex(index);
        int r = rightIndex(index);

        int minIndex = index;

        if(l < heap_size &&  ((T)heap_array[l]).compareTo((T)heap_array[minIndex])< 0) minIndex = l;

        if(r < heap_size &&  ((T)heap_array[r]).compareTo((T)heap_array[minIndex])< 0) minIndex = r;

        if(minIndex != index){

            swap(index, minIndex);

            MinHeapify(minIndex);

        }

    }

    public T extractMin(){

        if(isEmpty()) return null;

        if(heap_size == 1){

            T deletedElement = (T)heap_array[index];

            heap_array[index] = null;

            index --;

            heap_size--;

            return deletedElement;

        }

        T deletedElement = (T)heap_array[0];

        heap_array[0] = heap_array[index];

        heap_array[index] = null;

        heap_size --;

        index--;

        MinHeapify(0);

        return deletedElement;

    }

    public void decreaseKey(int index){

        heap_array[index] = Integer.MIN_VALUE;

        while(index != 0 && ((T)heap_array[parentIndex(index)]).compareTo((T) heap_array[index])>0){

            swap(index, parentIndex(index));

            index = parentIndex(index);

        }

    }


    public T deleteKey(int index){

        if(isEmpty()) return null;

        decreaseKey(index);

        return extractMin();

    }

    public void insertKey(T data){

        if(isFull()) return;

        heap_size++;
        this.index++;

        int index = this.index;

        heap_array[index] = data;

        while(index != 0 && ((T)heap_array[parentIndex(index)]).compareTo((T) heap_array[index])>0){

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
