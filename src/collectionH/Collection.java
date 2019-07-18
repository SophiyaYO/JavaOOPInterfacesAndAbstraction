package collectionH;

import java.util.ArrayList;
import java.util.List;

 abstract class Collection {
    private int maxSize = 100;
    private List<String> items;

    protected Collection() {
        this.items = new ArrayList<>();
    }
}
