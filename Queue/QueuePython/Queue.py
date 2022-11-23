from Node import Node
class Queue:

    __front = None
    __rear = None

    def __init__(self):
        pass


    def enqueue(self, dato):
        newNode = Node(dato)
        if (self.__front == None):
            self.__front = newNode
        else:
            self.__rear.setNode(newNode)
        self.__rear = newNode
        
    def dequeue(self):
        temp = self.__front
        self.__front = self.__front.getNode()
        return temp.getDato()
    
    def print_queue(self):
        temp = self.__front
        while(temp != None):
            print(temp.getDato())
            temp = temp.getNode()
