
class Node:

    __dato = None
    __node = None
    
    def __init__(self, dato):
        self.__dato = dato
    
    def setDato(self, dato):
        self.__dato = dato
    
    def getDato(self):
        return self.__dato
    
    def setNode(self, node):
        self.__node = node

    def getNode(self):
        return self.__node