import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creating an array of Cars
        Scanner cin = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        while (true){
            double avg = 0;
            System.out.println("Pleas Enter the name, color, price, number of cylinders for the car, number of passenger");
            String name,color;
            double price;
            int cylinders,passenger;

            name = cin.next();
            color = cin.next();
            price = cin.nextDouble();
            cylinders = cin.nextInt();
            passenger = cin.nextInt();
            Car car = new Car(name,color,price,cylinders,passenger);
            cars.add(car);
            avg += car.getPrice();
            car.display();
            System.out.println("if u finished press 0 else press 1");
            int f = cin.nextInt();
            if(f == 0) {
                System.out.println("the average price of the total prices is " + avg);
                break;
            }
        }

        //Creating an array of Cars
        ArrayList<Truck> trucks = new ArrayList<>();
        while (true){
            double avg = 0;
            System.out.println("Pleas Enter the name, color, price, number of cylinders for the car, number of capacity");
            String name,color;
            double price;
            int cylinders,capacity;

            name = cin.next();
            color = cin.next();
            price = cin.nextDouble();
            cylinders = cin.nextInt();
            capacity = cin.nextInt();
            Truck truck = new Truck(name,color,price,cylinders,capacity);
            trucks.add(truck);
            avg += truck.getPrice();
            truck.display();
            System.out.println("if u finished press 0 else press 1");
            int f = cin.nextInt();
            if(f == 0) {
                System.out.println("the average price of the total prices is " + avg);
                break;
            }
        }
    }
}