package collectionHierarchy;

import java.util.ArrayList;
import java.util.List;

public abstract class Collection<T> {
    private  int maxSize;
    private List<T> items;

    public Collection() {
        this.maxSize = 100;
        this.items = new ArrayList<>();
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public int getCollectionSiza() {
        return this.items.size();
    }

    public List<T> getItems() {
        return this.items;
    }
}
