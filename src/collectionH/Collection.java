package collectionH;

import java.util.ArrayList;
import java.util.List;

abstract class Collection {
    private static final int maxSize = 100;
    private List<String> items;

    protected Collection() {
        this.items = new ArrayList<>(maxSize);

    }

    protected int getMaxSize() {
        return maxSize;
    }

    protected int getCollectionSize() {
        return this.items.size();
    }

    protected List<String> getItems() {
        return this.items;
    }
}
