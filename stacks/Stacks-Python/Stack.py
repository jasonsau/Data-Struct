from Node import Node
class Stack:
    __tos = None
    
    def __init__(self):
        pass

    def push(self, dato):
        nuevo = Node(dato)
        if(self.__tos == None):
            self.__tos = nuevo
        else:
            nuevo.setSiguiente(self.__tos)
            self.__tos = nuevo
            
    def pop(self):
        temp = self.__tos
        self.__tos = temp.getSiguiente()
        return temp.getDato()
    
    def imprimir(self):
        temp = self.__tos
        while(temp != None):
            print(temp.getDato())
            temp = temp.getSiguiente()

        
