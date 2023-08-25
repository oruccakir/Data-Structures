import java.util.Stack;

public class DoubledEndedPriorityQueue <T extends Comparable<T>> implements DoubleEndedInterface<T > {

    private int size;
    private Node root;

    public DoubledEndedPriorityQueue(){

    }

    private Node insert(Node root, T key){

        if(root == null) {
            size++;
            return new Node(key);
        }

        else{

            Node curr = root;
            Node pointer = null;
            boolean isThere = false;

            while(curr != null && isThere == false){

                pointer = curr;

                if(curr.data.compareTo(key) < 0)
                    curr = curr.right;
                else if(curr.data.compareTo(key) > 0)
                    curr = curr.left;
                else
                    isThere = true;
            }

            if(!isThere){

                size++;

                if(pointer.data.compareTo(key) > 0)
                    pointer.left = new Node(key);
                else
                    pointer.right = new Node(key);

            }

            return root;

        }

    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T data) {
        root = insert(root, data);
    }

    
    @Override
    public T peekFirst() {

        if(root == null) return null;

        Node left = root;

        while(left.left != null)
            left = left.left;

        return left.data;
    }

    @Override
    public T peekLast() {

        if(root == null) return null;

        Node right = root;

        while(right.right != null)
            right = right.right;
            
        return right.data;
    }

    @Override
    public T pollFirst() {

        return null;
    }

    @Override
    public T pollLast() {
        return null;
    }

    @Override
    public boolean contains(T data) {
        return search(root, data);
    }

    @Override
    public T remove(T data) {
        return null;
    }

    public boolean search(Node root, T data){

        if(root == null) return false;

        else if(root.data.compareTo(data) > 0)
            return search(root.left, data);
        else if(root.data.compareTo(data) < 0)
            return search(root.right, data);
        else
            return true; 

    }
    
    
    public String toString(){

        StringBuilder str = new StringBuilder();
        Node curr = root;
        Stack<Node> stack = new Stack<>();
        str.append("[ ");
        while(curr != null || !stack.isEmpty()){

            if(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
                
            else{
                curr = stack.pop();
                str.append(curr+" ");
                curr = curr.right;
            }

        }
        str.append("]");
        return str.toString();
    }

    private class Node{

        public Node left;
        public Node right;
        public T data;

        public Node(T data){
            this.data = data;
        }

        public String toString(){
            return ""+data;
        }

    }



    public static void main(String[] args) {

        DoubledEndedPriorityQueue<Integer> db = new DoubledEndedPriorityQueue<>();

        int[] randomIntegers = {83, 47, 29, 56, 72, 13, 64, 91, 35, 68, 42, 77, 19, 50, 61, 88, 25, 59, 95, 33};

        for(int i=0; i<randomIntegers.length; i++)
            db.add(randomIntegers[i]);
        
        System.out.println(db);
        System.out.println(db.peekFirst());
        System.out.println(db.peekLast());
        System.out.println(db.contains(68));


    }

    
}
