from Stack import Stack
def __main__():
    stack = Stack()
    
    stack.push('J');
    stack.push('A');
    stack.push('S');
    
    print("Datos insertados")
    stack.imprimir();
    
    stack.pop()
    print("Datos eliminados")
    stack.imprimir();

if __name__ == '__main__':
    __main__()