import java.util.Scanner;

class Vehicle {
    private String Brand;
    private int Speed;
    private String FuelType;

    public Vehicle(String Brand,int Speed, String FuelType) {
    this.Brand = Brand;
    this.Speed = Speed;
    this.FuelType = FuelType;
    }
    public String getBrand() {
    return this.Brand;
    }
    public int getSpeed() {
    return Speed;
    }
    public String getFuelType() {
    return this.FuelType;
    }
    public void displayInfo() {
    System.out.println("Brand: " + Brand);
    System.out.println("Speed: " + Speed);
    System.out.println("FuelType: " + FuelType);
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car (String Brand,int Speed, String FuelType, int numDoors) {
        super(Brand, Speed, FuelType);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
    System.out.println("Number of Doors: " + numDoors);

    }
}

class Motorcycle extends Vehicle {
    private boolean hasSideCar;
    public Motorcycle (String Brand,int Speed, String FuelType, boolean hasSideCar) {
        super(Brand, Speed, FuelType);
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void displayInfo() {
    super.displayInfo();
    System.out.println("Has Sidecar: " + (hasSideCar? "Yes" : "No") );

    }
}

public class VehicleTest {
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

      
        System.out.println("Enter Car Details:");  
        System.out.print("Brand: ");  
        String carBrand = scanner.nextLine();  
        System.out.print("Speed: ");  
        int carSpeed = scanner.nextInt();  
        scanner.nextLine();  
        System.out.print("Fuel Type: ");  
        String carFuel = scanner.nextLine();  
        System.out.print("Number of Doors: ");  
        int numDoors = scanner.nextInt();
        scanner.nextLine(); 
 
        System.out.println("\nEnter Motorcycle Details:");  
        System.out.print("Brand: ");  
        String motoBrand = scanner.nextLine();  
        System.out.print("Speed: ");  
        int motoSpeed = scanner.nextInt();  
        scanner.nextLine(); 
        System.out.print("Fuel Type: ");  
        String motoFuel = scanner.nextLine();  
        System.out.print("Has Sidecar? (true/false): ");  
        boolean hasSidecar = scanner.nextBoolean();  
 
        Vehicle car = new Car(carBrand, carSpeed, carFuel, numDoors);  
        Vehicle motorcycle = new Motorcycle(motoBrand, motoSpeed, motoFuel, hasSidecar);  
 
        System.out.println("\nCar Details:");  
        car.displayInfo();  
        System.out.println();  
        System.out.println("Motorcycle Details:");  
        motorcycle.displayInfo();  
   
        scanner.close();
    }
}  