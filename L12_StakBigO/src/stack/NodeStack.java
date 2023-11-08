package stack;

import java.util.NoSuchElementException;

public class NodeStack implements StackI{
private Node top;
private int size;
    class Node
    {
        public Object data;
        public Node next;

        public Node(Object data) {
            this.data = data;
//            this.next = next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return next;
        }

        public Object getData() {
            return data;
        }
    }

    public NodeStack() {
    }

    @Override
    public void push(Object element) {

        Node node = new Node(element);

        if(top == null){
            top = node;
        }else {
            node.setNext(top);
            top=node;
        }
        size++;
    }

    @Override
    public Object pop() {

        if(top!=null) {
            Node removed = top;
            top = top.getNext();
            size--;
            return removed.data;

        }else {
            throw new NoSuchElementException();
            }
    }

    @Override
    public Object peek() {
        if(top!=null) {
            return  top.data;

        }else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if(top!=null) {
            return false;

        }else {
            return true;
        }

    }
}
