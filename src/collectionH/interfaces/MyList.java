package collectionH.interfaces;

public interface MyList  extends AddRemovable{
    int getUsed();

    @Override
    String remove();

    @Override
    int add(String element);
}
