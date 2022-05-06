public class Operations {
    Node head,tail;

    public void add(int data){
        Node node = new Node(data);

        if(head==null){
            head=node;
            tail=node;
        }
        else {
            Node node1=head;
            this.head=node;
            node.next=node1;
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