package LinkedList.LinkedListJava;

public class Node {
    
    private int dato;
    private Node prevNode;
    private Node nextNode;
    
    public Node(int dato) {
        this.dato = dato;
    }
    
    public int getDato() {
        return this.dato;
    }
    
    public void setDato(int dato) {
        this.dato = dato;
    }
    
    public Node getPrevNode() {
        return this.prevNode;
    }
    
    public void setPrevNode(Node prevNode) {
        this.prevNode = prevNode;
    }
    
    public Node getNextNode() {
        return this.nextNode;
    }
    
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
    
}
