package stacks.StacksJava;

public class Manejador {
    
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.apilar('J');
        stack.apilar('A');
        stack.apilar('S');
        stack.apilar('O');
        stack.apilar('N');
        
        stack.imprimir();
    }
}
