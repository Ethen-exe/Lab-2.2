import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Tree {
    // TODO complete this Tree class to replicate the implementation from the Tree class in adts.py
    private Integer root;
    private List<Tree> subtrees;

    public Tree(Integer root, List<Tree> subtrees) {
        // requireNonNullElseGet came from IntelliJ suggestions after the original implementation
        // of if statements checking if the second param is null or not
        this.subtrees = Objects.requireNonNullElseGet(subtrees, ArrayList::new);
        this.root = root;
    }

    public boolean is_empty() {
        return this.root == null;
    }

    public int length() {
        if (this.root == null) {
            return 0;
        }else {
            int counter = 1;
            for (Tree temp : this.subtrees) {
                counter += temp.length();
            }
            return counter;
        }
    }

    public int count(Integer item) {
        if (is_empty()) {
            return 0;
        }else {
            int counter = 0;
            if (Objects.equals(this.root, item)) {
                counter = 1;
            }
            for (Tree temp : this.subtrees) {
                counter += temp.count(item);
            }
            return counter;
        }
    }

    public void add(Integer item) {
        if (is_empty()) {
            this.root = item;
        }else if(this.subtrees == null){
            this.subtrees.add(new Tree(item, null));
        }
    }
}
