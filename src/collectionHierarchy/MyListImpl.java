package collectionHierarchy;

import java.util.List;

public class MyListImpl<T> implements MyList<T> {
    private List<T> elements;


    @Override
    public int size() {
        return 0;
    }

    @Override
    public T remove() {
        return this.elements.remove(this.elements.size() -1);
    }

    @Override
    public int add(T element) {
        elements.add(0, element);
        return 0;
    }
}
