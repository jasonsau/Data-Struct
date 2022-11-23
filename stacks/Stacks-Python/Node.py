
class Node:
    __siguiente = None

    def __init__(self, dato):
        self.__dato = dato

    def getDato(self) -> str:
        return self.__dato

    def setDato(self, dato):
        self.__dato = dato
    
    def getSiguiente(self):
        return self.__siguiente;

    def setSiguiente(self, siguiente):
        self.__siguiente = siguiente
