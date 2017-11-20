public class LinkedListVector {

    private static Node head;
    private static Node tail;
    private static int size;

    public void add(int data){
        Node node = new Node(data);

        if(tail==null){
            head=node;
            tail=node;
        }
        else {
            tail.nextNode = node;
            tail = node;
        }
        size++;
    }

    public Node delete(int data){

        Node nodeToReturn = null;
        if(size==0){
            return null;
        }
        if(size==1){
            nodeToReturn=head;
            head=null;
            tail=null;
            size--;
            return nodeToReturn;
        }

        Node nodeBtoDel = findNodeBefore(data);

        if(nodeBtoDel.data==0){
            head=head.nextNode;
            size--;
        }
        else if (nodeBtoDel!=null){
            if(tail.data==data){
                nodeBtoDel.nextNode=null;
                tail = nodeBtoDel;
            }
            else{
                nodeBtoDel.nextNode=nodeBtoDel.nextNode.nextNode;
            }
            size--;
        }
        return null;
    }

    public Node findNodeBefore(int data){

        if(head.data==data){
            return new Node();
        }
        Node node = head;

        while(head.nextNode!=null){
            if(node.nextNode.data==data){
                return node;
            }
            else {
                node = node.nextNode;
            }
        }
        return null;
    }

    public Node find(int data){
        if(head==null){
            return null;
        }

        if(head.data==data){
            return head;
        }
        Node node = head;

        while(node.nextNode!=null){
            node = node.nextNode;
            if(node.data==data){
                return node;
            }
        }
        return null;
    }

    /*public void out(){
        if(head!=null){
            Node node = head;
            System.out.print(node);
            while(node.nextNode!=null){
                node=node.nextNode;
                System.out.print(node+" ");
            }
        }
    }*/

    public static int getSize(){
        return size;
    }

    public static double norm(LinkedListVector list){
        double normal=0;
        Node node = head;
        while(node.data<list.getSize()){
            normal=head.data*head.nextNode.data+normal;
    }
        return Math.sqrt(normal);
    }

}
