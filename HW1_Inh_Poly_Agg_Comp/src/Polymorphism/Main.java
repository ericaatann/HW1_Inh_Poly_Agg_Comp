package Polymorphism;

class Ship{
    protected String name;
    protected  String yearBuilt;

    public Ship(String name, String yearBuilt){
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setYearBuilt(String yearBuilt){
        this.yearBuilt = yearBuilt;
    }

    // Getters
    public String getName(){
        return name;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    // Print function
    public void print(){
        System.out.println("Ship Name: " + name + "\nYear Built: " + yearBuilt);
    }
}

class CruiseShip extends Ship{
    private int maxPassengers;

    public CruiseShip(String name, String yearBuilt, int maxPassengers){
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    //Setters
    public void setMaxPassengers(int maxPassengers){
        this.maxPassengers = maxPassengers;
    }

    //Getter

    public int getMaxPassengers() {
        return maxPassengers;
    }
}

class CargoShip extends Ship{
    private int cargoCapacity;
    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    // Setters
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    // Getter
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    // Override print function
    @Override
    public void print() {
        System.out.println("Cargo Ship Name: " + name + "\nYear Built: " + yearBuilt
                + "\nCargo Capacity: " + cargoCapacity + " tons");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an array of Ship objects
        Ship[] ships = new Ship[3];

        // Instantiate objects of different types
        ships[0] = new Ship("ShipA", "1990");
        ships[1] = new CruiseShip("CruiseShipA", "2000", 2000);
        ships[2] = new CargoShip("CargoShipA", "2010", 5000);

        // Loop through array and call print function
        for (Ship ship : ships) {
            ship.print();
            System.out.println();
        }
    }
}
