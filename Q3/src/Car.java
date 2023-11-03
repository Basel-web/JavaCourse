public class Car extends Vehicle{
    private int passengers;
    private static int numberOfVehicles;

    public Car(String name, String color, double price, int cylinders, int passengers) {
        super(name, color, price, cylinders);
        this.passengers = passengers;
        numberOfVehicles++;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public static int getNumberOfVehicles() {
        return numberOfVehicles;
    }

    @Override
    public void display() {
        System.out.println("The Car Info");
        super.display();
        System.out.println("Number of passenger: " + passengers + "\nNumber of vehicles until now: " + numberOfVehicles + "\nPrice after tax: " + getPrice());
    }
    public double getPrice(){
        double tax;
        if(getNumberOfVehicles() < 5)
            tax = 0.15;
        else
            tax = 0.30;
        return getprice() - (getprice() * tax);
    }
}
