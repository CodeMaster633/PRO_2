package train;

import java.util.NoSuchElementException;

public class LinkedListTrain {
    private WagonNode firstWagon;

    /**
     * Constructs an empty linked list train.
     */
    public LinkedListTrain() {
        this.firstWagon = null;
    }

    /**
     * Returns the first wagon node in the linked list train.
     *
     * @return the first wagon node
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode getFirst() {
        if (this.firstWagon == null) {
            throw new NoSuchElementException();
        }
        return this.firstWagon;
    }

    /**
     * Adds a wagon node to the front of the linked list train.
     *
     * @param wagon the wagon node to add
     */
    public void addFirst(WagonNode wagon) {
        if (firstWagon == null) {
            firstWagon = wagon;
        } else {
            wagon.setNextWagon(this.firstWagon);
            this.firstWagon = wagon;

//            firstWagon.setNextWagon(wagon);
        }
    }

    /**
     * Removes the first wagon node in the linked list train.
     *
     * @return the removed wagon node
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode removeFirst() {
        WagonNode removedWagon = getFirst();
        if (firstWagon.getNextWagon() == null) {
            firstWagon = null;
        } else {
            firstWagon = firstWagon.getNextWagon();
        }

        return removedWagon;
    }

    /**
     * Counts the total number of wagon nodes in the linked list train.
     *
     * @return the number of wagon nodes
     */
    public int count() {
        WagonNode wagon = firstWagon;
        int count = 1;
        while (wagon.getNextWagon() != null) {
            wagon = wagon.getNextWagon();
            count++;
        }
        return count;
    }

    /**
     * Removes the first wagon node in the linked list train.
     *
     * @param wagon the wagon node to remove
     * @return <code>true</code> if the wagon node was found and removed;
     * <code>false</code> otherwise
     */
    public boolean remove(WagonNode wagon) {
        WagonNode current = firstWagon;
        WagonNode previous = null;

        while (current != null) {
            if (current == wagon) {
                previous.setNextWagon(current.getNextWagon());
                wagon.setNextWagon(null);
                return true;
            }
            previous = current;
            current = current.getNextWagon();

        }
        return false;
        }

        /**
         * Inserts a wagon node at a given position in the linked list train.
         *
         * @param wagon    the wagon node to add
         * @param position the position where to add the wagon node
         */
        public void insertAt (WagonNode wagon,int position)
        {
            boolean found = false;
            WagonNode current = firstWagon;
            WagonNode previous = null;
            int count = 0;

//            if(position==0){
//                addFirst(wagon);
//            }else{

            while (current!=null) {
//                System.out.println(current.getWagonName());
                if (position == count) {
                    found = true;
                    previous.setNextWagon(wagon);
                    wagon.setNextWagon(current);
                }
                previous = current;
                current = current.getNextWagon();
                count++;

            }
        }
    }

