package collectionH;

import collectionH.interfaces.AddRemovable;

public class AddRemoveCollection extends Collection implements AddRemovable {

    protected AddRemoveCollection() {
        super();
    }

    @Override
    public String remove() {
        if (super.getCollectionSize() > 0) {
            String lastElement = super.getElements().get(super.getCollectionSize() - 1);
            if ( lastElement != null) {
                super.getElements().remove(super.getCollectionSize() - 1);
            }
            return lastElement;
        } else {
            throw new IllegalArgumentException("Invalid Operation! Nothing to remove");
        }

    }

    @Override
    public int add(String element) {
        if (Validator.collectionSize(super.getCollectionSize())) {
            super.getElements().add(0, element);
            return 0;
        } else {
            throw new IllegalArgumentException("Collection size is out of limit. You CANNOT add more elements!");
        }
    }
}
