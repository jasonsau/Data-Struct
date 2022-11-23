
class Node {
    constructor(dato) {
        this.dato = dato;
        this.node = null;
    }

    getNextNode() {
        return this.node;
    }

    setNextNode(node) {
        this.node = node;
    }

    getDato() {
        return this.dato;
    }
    
    setDato(dato) {
        this.dato = dato;
    }
}

class Stack {

    constructor() {
        this.tos = null;
    }

    push(dato) {
        const node = new Node(dato)
        if(this.tos === null) {
            this.tos = node;
        } else {
            node.setNextNode(this.tos);
            this.tos = node;
        }
    }

    pop() {
        if(this.tos == null) {
            console.log("Cola vacia");
        } else {
            const temp = this.tos;
            this.tos = this.tos.getNextNode();
            return temp.getDato();
        }
    }

    printStack() {
        let temp = this.tos;
        while(temp !== null) {
            console.log(temp.getDato());
            temp = temp.getNextNode();
        }
    }

}

const stack = new Stack();

stack.push(1);
stack.push(2);

stack.printStack();

