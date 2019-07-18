package collectionH;

import collectionH.interfaces.MyList;

public class MyListImpl extends Collection implements MyList {

    protected MyListImpl() {
        super();
    }

    @Override
    public String remove() {
        if (super.getCollectionSize() > 0) {
            String firstElement = super.getElements().get(0);

            if (super.getElements().size() > 0) {
                super.getElements().remove(0);
            } else {
                return null;
            }

            return firstElement;
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

    @Override
    public int getUsed() {
        return super.getCollectionSize();
    }
}
