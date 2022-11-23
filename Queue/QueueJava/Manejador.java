package Queue.QueueJava;

public class Manejador {
    
    public static void main(String[] args ) {

        Queue queue = new Queue();
        queue.enqueue('J');
        queue.enqueue('A');
        queue.enqueue('S');
        queue.enqueue('O');
        queue.enqueue('N');
        queue.printQueue();
        
        queue.dequeue();
        System.out.println("\n");

        queue.printQueue();
        
        

    }
    
}
