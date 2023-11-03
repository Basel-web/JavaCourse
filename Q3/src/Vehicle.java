public class Vehicle {
    private String name;
    private String color;
    private double price;
    private int cylinders;
    private static int numberOfVehicles;

    public Vehicle(String name, String color, double price, int cylinders) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.cylinders = cylinders;
        numberOfVehicles++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getprice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public static int getNumberOfVehicles() {
        return numberOfVehicles;
    }

    public void display(){
        System.out.println("Name: " + name + " Color: " + color + " Number Of Cylinders: " + cylinders);
    }
    public double getPrice(){
        double ratio = 0.10;
        return price - (ratio * price);
    }
}
