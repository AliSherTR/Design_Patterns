public class Car implements Vehicle{
public String name;
    public Car(String name) {
        this.name = name;
    }

    public void Start(){
        System.out.println("The " + name + " is Starting");
    }
    public void Stop(){
        System.out.println("The " + name + " is Stopping");
    }
}
