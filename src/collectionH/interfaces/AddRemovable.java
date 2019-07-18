package collectionH.interfaces;

public interface AddRemovable extends Addable{
    String remove();

    @Override
    int add(String element);
}
