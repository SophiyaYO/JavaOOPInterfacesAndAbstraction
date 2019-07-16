import militaryElite.PrivateImpl;
import militaryElite.interfaces.Soldier;

public class Main {
    public static void main(String[] args) {
        Soldier soldier =
                new PrivateImpl(1, "piju", "milenov", 23);

        System.out.println(soldier);
    }
}



