package collectionH;

import java.util.ArrayList;
import java.util.List;

public class AddCollection extends Collection implements Addable {
    private List<String> elements;


    protected AddCollection() {
        this.elements = new ArrayList<>();
    }

    @Override
    public int add(String element) {
        this.elements.add(element);
        return this.elements.indexOf(element);
    }

}
