public class Linked_List {
    public static void main(String[] args) {
        System.out.println("Welcome To Linked List");

        Node node = new Node(56);
        Node node1 = new Node(30);
        Node node2 = new Node(70);
        node.next = node1;
        node1.next = node2;
        Node temp = node;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
