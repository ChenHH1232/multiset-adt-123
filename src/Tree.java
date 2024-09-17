public class Tree {
    // TODO complete this Tree class to replicate the implementation from the Tree class in adts.py

    private Integer root;
    private Tree[] sublist;

    public Tree(Integer root, Tree[] sublist) {

        this.root = root;
        if (sublist == null) {
            this.sublist = new Tree[0]; // default to empty sublist if null is passed in.
        }
        else {
            this.sublist = sublist;
        }
    }
}

