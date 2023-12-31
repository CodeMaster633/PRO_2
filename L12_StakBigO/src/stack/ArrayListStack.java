package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ArrayListStack implements StackI{
    private List<Object> stack;
    private int top;

    /**
     * Constructs an empty stack.
     */
    public ArrayListStack()
    {
        top = -1;
        stack = new ArrayList<>();
    }

    /**
     * Adds an element to the top of the stack.
     *
     * @param element the element to add
     */
    @Override
    public void push(Object element)
    {
        growIfNeccassary();
        top++;
        stack.add(top,element);
    }

    /**
     * Removes the element from the top of the stack.
     *
     * @return the removed element
     */
    @Override
    public Object pop()
    {
        if (top < 0)
        {
            throw new NoSuchElementException();
        }
        Object obj = stack.get(top);
        stack.remove(top);
        top--;
        return obj;
    }

    /**
     * Returns the element from the top of the stack. The stack is unchanged
     *
     * @return the element from the top of the stack
     */
    @Override
    public Object peek()
    {
        if (top < 0)
        {
            throw new NoSuchElementException();
        }
        return stack.get(top);

    }

    /**
     * The number of elements on the stack.
     *
     * @return the number of elements on the stack
     */
    @Override
    public int size()
    {
        return top + 1;
    }

    /**
     * Checks whether this stack is empty.
     *
     * @return true if the stack is empty
     */
    @Override
    public boolean isEmpty()
    {
        return top == -1;
    }

    private void growIfNeccassary()
    {
//        if (top + 1 == stack.length)
//        {
//            Object[] newElements = new Object[stack.length * 2];
//            for (int i = 0; i < stack.length; i++)
//            {
//                newElements[i] = stack[i];
//            }
//            stack = newElements;
//        }

    }
}
