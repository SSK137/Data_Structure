public class Operations {
    Node head;

    public void add(int data){
        Node node = new Node(data);
        node.data=data;

        if(head==null){
            head=node;
        }
        else {
            Node n=head;
            while (n.next!=null){
                n=n.next;
            }
            n.next=node;
        }
    }

    public void print(){
        Node node=head;
        while (node.next!=null){
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);
    }
}