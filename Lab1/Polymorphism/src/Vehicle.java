public class Vehicle {
    public Vehicle(){}

    public void Running(int speed) {
        System.out.println("The vehicle is going at " + speed + " km/h");
    }

    public void Running(String model , int speed ) {
        System.out.println("The " + model + " is going at " + speed + " km/h");
    }

    public void Running(String model , String name , int speed ){
        System.out.println("The " + name + " whose model is " + model + " is going at " + speed +  " km/h" );
    }
}
