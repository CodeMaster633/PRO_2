package train;

import java.util.NoSuchElementException;

public class LinkedListTrain
{
    private WagonNode firstWagon;

    /**
     * Constructs an empty linked list train.
     */
    public LinkedListTrain()
    {
        this.firstWagon = null;
    }

    /**
     * Returns the first wagon node in the linked list train.
     * 
     * @return the first wagon node
     * 
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode getFirst()
    {
        if (this.firstWagon == null)
        {
            throw new NoSuchElementException();
        }
        return this.firstWagon;
    }

    /**
     * Adds a wagon node to the front of the linked list train.
     * 
     * @param wagon the wagon node to add
     */
    public void addFirst(WagonNode wagon)
    {
        if(firstWagon==null){
            firstWagon=wagon;
        }else{
            wagon.setNextWagon(firstWagon);
            firstWagon=wagon;
        }
    }

    /**
     * Removes the first wagon node in the linked list train.
     * 
     * @return the removed wagon node
     * 
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode removeFirst()
    {
        WagonNode removedWagon = getFirst();
        if(firstWagon.getNextWagon()==null){
            firstWagon=null;
        } else{
            firstWagon=firstWagon.getNextWagon();
        }

        return removedWagon;
    }

    /**
     * Counts the total number of wagon nodes in the linked list train.
     * 
     * @return the number of wagon nodes
     */
    public int count()
    {
        WagonNode wagon = firstWagon;
        int count = 1;
        while(wagon.getNextWagon()!=null){
            wagon=wagon.getNextWagon();
            count++;
        }
        return count;
    }

    /**
     * Removes the first wagon node in the linked list train.
     * 
     * @param wagon the wagon node to remove
     * @return <code>true</code> if the wagon node was found and removed;
     *         <code>false</code> otherwise
     */
    public boolean remove(WagonNode wagon)
    {
        WagonNode actualWagon = firstWagon;
        while(actualWagon.getNextWagon()!=null){
            if(actualWagon==wagon && wagon.getPreviousWagon()!=null){
                wagon.getPreviousWagon().setNextWagon(wagon.getNextWagon());
                return true;
            }else if(actualWagon==wagon && wagon.getPreviousWagon()==null && wagon.getNextWagon()!=null){
                removeFirst();
            }else{actualWagon=actualWagon.getNextWagon();
            }
        }

        return false;
    }

    /**
     * Inserts a wagon node at a given position in the linked list train.
     * 
     * @param wagon    the wagon node to add
     * @param position the position where to add the wagon node
     */
    public void insertAt(WagonNode wagon, int position)
    {
        // TODO: Assignment 5: Implement this insert method...

        throw new UnsupportedOperationException("Not implemented");
    }
}
