package Queue.QueueJava;

public class Node {
    private char dato;
    private Node next;
    
    public Node(char dato) {
        this.dato = dato;
    }
    
    public char getDato() {
        return this.dato;
    }
    
    public Node getNode() {
        return next;
    }
    
    public void setNode(Node next) {
        this.next = next;
    }
}
