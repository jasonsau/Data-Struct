from Queue import Queue
def __main__():

    queue = Queue()
    queue.enqueue(1)
    queue.enqueue(2)
    queue.enqueue(3)
    queue.enqueue(4)
    queue.enqueue(5)
    queue.enqueue(6)
    queue.print_queue()
    queue.dequeue()
    queue.print_queue()
    
if(__name__ == '__main__'):
    __main__()
