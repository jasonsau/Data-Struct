package stacks.StacksJava;

public class Stack {
    
    Nodo tos;

    public void apilar(char dato) {
        Nodo nuevo = new Nodo(dato);

        if(tos == null) {
            tos = nuevo;
        } else  {
            nuevo.setSiguiente(tos);
            tos = nuevo;
        }
    }
    
    public char desapilar() {
        Nodo temp = tos;
        tos = tos.getSiguiente();
        return temp.getDato();
    }
    
    public void imprimir() {
        Nodo temp = tos;
        while(temp != null) {
            System.out.println(temp.getDato());
            temp = temp.getSiguiente();
        }
    }
}
