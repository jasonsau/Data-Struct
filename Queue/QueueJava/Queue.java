package Queue.QueueJava;


public class Queue {
    private Node front;
    private Node rear;
    Node testFront;
    Node testRear;
    
    public Queue() {
        front = null;
        rear = null;
    }

    public void enqueue(char dato) {
        Node newNode = new Node(dato);
        if( front == null ) {
            front = newNode;
        } else {
            rear.setNode(newNode);
        }
        rear = newNode;
    }
    
    //Prueba para verificar las referencias
    public void test(char dato, char dato2) {
        Node newNode = new Node(dato);
        Node newNode1 = new Node(dato2);
        testFront = newNode;
        testRear = newNode;
        System.out.println(testFront.getNode());
        testRear.setNode(newNode1);
        System.out.println(testFront.getNode().getDato());
    }
    
    public char dequeue() {
        if(front == null && rear == null) {
            System.out.println("La cola esta vacia");
            return ' ';
        } else {
            Node nodoEliminado = front;
            front = front.getNode();
            nodoEliminado.setNode(null);
            return nodoEliminado.getDato();
        }
    }
    
    public void printQueue() {
        if(front == null && rear == null) {
            System.out.println("Cola Vacia");
        } else {
            Node auxiliar = front;
            while(auxiliar != null) {
                System.out.println(auxiliar.getDato());
                auxiliar = auxiliar.getNode();
            }
        }
    }
    
    public char obtener() {
        if(front == null) {
            return ' ';
        }
        
        return front.getDato();
    }
}
