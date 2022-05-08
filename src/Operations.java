public class Operations {
    Node head,tail;
    public int size=0;

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

    public void appending(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            tail = node;
        }else {
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
    }
    public void addNode(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            //If list is empty then both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        //Size will count the number of nodes present in the list
        size++;
    }
    public void InsertInBetween(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            Node temp, position;
            int count = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
            temp = head;
            position = null;

            for (int i = 0; i < count; i++) {
                //Node current will point to temp
                position = temp;
                //Node temp will point to node next to it.
                temp = temp.next;
            }
            position.next = node;
            node.next = temp;
        }
        size++;
    }
    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List Is Empty");
        } else {

            while (temp != null) {
                System.out.print(temp.data+ "\t");
                temp = temp.next;
            }
        }
    }
}