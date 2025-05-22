public class TreeMultiSet extends MultiSet {

    // TODO add a Tree object as a private instance variable for this class.
    /**
     * Add the given item to this multiset.
     *
     * @param item the item to add
     */
    private Tree set = new Tree(null, null);
    @Override
    public void add(Integer item) {
        // TODO complete this method
        set.add(item);
    }

    public void remove(Integer item) {
        set.remove(item);
    }
    // TODO write the rest of the implementation for this class so that it uses its private Tree
    //      object to provide the MultiSet functionality.
}
