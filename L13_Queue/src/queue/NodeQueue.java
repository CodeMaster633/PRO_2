package queue;

import net.bytebuddy.dynamic.scaffold.MethodGraph;

import java.util.NoSuchElementException;

/**
 * An implementation of a queue as a linked list.
 */
public class NodeQueue implements QueueI
{
    private Node head;
    private Node tail;
    private int size;

    public class Node{
        public Object data;
        public Node next;
        public Node (Object data) {
            this.data=data;
        }

        public void setNext(Node node){
            next = node;
        }

        public Node getNext() {
            return next;
        }

        public Object getData() {
            return data;
        }
    }
    public NodeQueue()
    {
    this.size = 0;
    }

    @Override
    public void enqueue(Object element)
    {
        Node node = new Node (element);

        if(head==null){
            head = node;
            tail = node;
        }else{
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    @Override
    public Object dequeue()
    {
        if(head==null){
            throw new NoSuchElementException();
        }

        Node fjernet = head;
        this.head=head.getNext();
        size--;

        return fjernet.getData();
    }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public boolean isEmpty()
    {
        if(size == 0){
            return true;
        }else {
            return false;
        }
    }
}
