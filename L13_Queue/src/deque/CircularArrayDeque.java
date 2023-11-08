package deque;

import queue.QueueI;

import java.lang.annotation.ElementType;
import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * An implementation of a queue as a circular array.
 */
public class CircularArrayDeque implements DequeI
{
    private Object[] elements;
    private int currentSize;
    private int head;
    private int tail;

    public CircularArrayDeque(int size)
    {
        elements = new Object[size];
        currentSize = 0;
        head = 0;
        tail = 0;
    }
    @Override
    public void addFirst(Object element) {
        growIfNecessary();
        currentSize++;
        elements[head] = element;
        head = (head + 1) % elements.length; //Hvorfor/Hvordan virker det?
    }

    @Override
    public void addLast(Object element) {
        growIfNecessary();
        currentSize++;
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
    }

    @Override
    public Object removeFirst() {

        if (currentSize == 0)
        {
            throw new NoSuchElementException();
        }
        Object removed = elements[head];
        head = (head + 1) % elements.length;
        currentSize--;
        return removed;
    }

    @Override
    public Object removeLast() {
        if (currentSize == 0)
        {
            throw new NoSuchElementException();
        }
        Object fjernet = elements[tail];
        tail = (tail + 1) % elements.length;
        currentSize--;

        return fjernet;
    }

    @Override
    public Object getFirst() {
        return elements[head];
    }

    @Override
    public Object getLast() {
        return elements[tail];
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        if(currentSize == 0){
            return true;
        }

        return false;
    }

    private void growIfNecessary()
    {
        if (currentSize == elements.length)
        {
            Object[] newElements = new Object[2 * elements.length];
            for (int i = 0; i < elements.length; i++)
            {
                newElements[i] = elements[(head + i) % elements.length];
            }
            elements = newElements;
            head = 0;
            tail = currentSize;
        }
    }
}
