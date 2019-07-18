package collectionH;

import java.util.ArrayList;
import java.util.List;

 abstract class Collection {
    private  final int maxSize = 100;
    private List<String> items;

    protected Collection() {
        this.items = new ArrayList<>();
    }
}
