package collectionHierarchy;

import java.util.List;

public class AddCollectionImpl<T> implements AddCollection<T> {

    private List<T> elements;


    @Override
    public int add(T element) {
         this.elements.add(element);

         return this.elements.size() - 1;
    }
}
