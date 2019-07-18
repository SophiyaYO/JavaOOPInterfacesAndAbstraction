package collectionH;

import java.util.ArrayList;
import java.util.List;

public class AddRemoveCollection extends Collection implements Addable, AddRemovable {
    private List<String> elements;

    protected AddRemoveCollection() {
        this.elements = new ArrayList<>();
    }

    @Override
    public String remove() {
        return this.elements.remove(this.elements.size() - 1);
    }

    @Override
    public int add(String element) {
        this.elements.add(0, element);
        return this.elements.indexOf(element);
    }
}
