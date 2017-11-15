public class Node {

    public int data;
    public Node nextNode;

    public Node() {

    }

    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString(){
        return ""+data;
    }



}
