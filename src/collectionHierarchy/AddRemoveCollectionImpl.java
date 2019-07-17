package collectionHierarchy;

import java.util.List;

public class AddRemoveCollectionImpl<T> implements AddRemoveCollection<T> {

    private List<T> elements;

    @Override
    public T remove() {
        return this.elements.remove(this.elements.size()-1);
    }

    @Override
    public int add(T element) {

        this.elements.add(0, element);
        return 0;
    }
}
