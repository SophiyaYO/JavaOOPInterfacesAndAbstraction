import Ferrari.Car;
import Ferrari.Ferrari;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        Ferrari newCar = new Ferrari(name) {
            @Override
            public String brakes() {
                return super.brakes();
            }

            @Override
            public String gas() {
                return super.gas();
            }

            @Override
            public String toString() {
                return super.toString();
            }
        };

        System.out.println(newCar.toString());
    }
}
