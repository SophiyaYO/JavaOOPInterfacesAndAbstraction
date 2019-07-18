package collectionH;

import collectionH.interfaces.Addable;

public class AddCollection extends Collection implements Addable {

    public AddCollection() {
        super();
    }

    @Override
    public int add(String element) {
        if (Validator.collectionSize(super.getCollectionSize())) {
            super.getElements().add(element);
            return super.getCollectionSize()-1;
        }else {
            throw new IllegalArgumentException("Collection size is out of limit. You CANNOT add more elements!");
        }

    }

}
