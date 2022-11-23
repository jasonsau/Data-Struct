package LinkedList.LinkedListJava;

public class LinkedList {
    
    private Node head;

    public LinkedList() {
        this.head = null;
    }
    
    public void push(int dato) {
        Node newNode = new Node(dato);
        if(head == null) {
            head = newNode;
        } else {
            newNode.setPrevNode(head);
            head.setNextNode(newNode);
            head = newNode;
        }
    }
    
    public void pop() {
        Node temp = head;

        while(temp != null) {
            System.out.println(temp.getDato());
            temp = temp.getNextNode();
        }
    }
}
