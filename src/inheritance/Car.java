package inheritance;

class Car extends Vehicle {
    protected int numberOfSeats = 0;
 
    public Car(int i_NumberOfSeats) {
        super();
        //perform other initialization here
        numberOfSeats = i_NumberOfSeats;
    }
 
    public void setLicensePlate(String license) {
        super.setLicensePlate(license);
    }
 
    public String toString() {
        return "The car has " + numberOfSeats + " seats. Its license is " + licensePlate;
    }
 
    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }
 
}
