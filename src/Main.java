import Ferrari.Car;
import Ferrari.Ferrari;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        Ferrari newCar = new Ferrari(name);

        System.out.println(newCar.toString());
    }
}
