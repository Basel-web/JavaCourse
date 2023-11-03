public class Truck extends Vehicle{
    private int capacity;
    private static int numberOfVehicles;

    public Truck(String name, String color, double price, int cylinders, int capacity) {
        super(name, color, price, cylinders);
        this.capacity = capacity;
        numberOfVehicles++;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public static int getNumberOfVehicles() {
        return numberOfVehicles;
    }
    public void display(){
        System.out.println("The Truck info");
        super.display();
        System.out.println("The Capacity: " + capacity + " Number of Trucks until now: " + numberOfVehicles);
    }
    public double getPrice(){
        double tax;
        if(getNumberOfVehicles() < 7 && capacity < 3500)
            tax = 0.10;
        else
            tax = 0.20;
        return getprice() - (getprice() * tax);
    }
}
