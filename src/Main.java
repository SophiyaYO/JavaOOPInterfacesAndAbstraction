import militaryElite.LieutenantGeneralImpl;
import militaryElite.PrivateImpl;
import militaryElite.interfaces.LieutenantGeneral;
import militaryElite.interfaces.Private;

public class Main {
    public static void main(String[] args) {
        Private soldier =
                new PrivateImpl(1, "piju", "milenov", 23);

        Private soldier1 = new PrivateImpl(2, "Gosho", "Peshev", 34.5);
        //Object slicing
        LieutenantGeneral general = new LieutenantGeneralImpl(100, "Boss", "General", 799);

        (general).addPrivate(soldier);
        (general).addPrivate(soldier1);


        System.out.println(general.toString());
    }
}



