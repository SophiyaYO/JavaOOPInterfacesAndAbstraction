package collectionH;

import collectionH.interfaces.MyList;

import java.util.ArrayList;
import java.util.List;

public class MyListImpl extends Collection implements MyList {
    private List<String> elements;

    public MyListImpl() {
        this.elements = new ArrayList<>();
    }

    @Override
    public String remove() {
        return this.elements.remove(0);
    }

    @Override
    public int add(String element) {
        this.elements.add(0,element);
        return this.elements.indexOf(element);
    }

    @Override
    public int getUsed() {
        return this.elements.size();
    }
}
