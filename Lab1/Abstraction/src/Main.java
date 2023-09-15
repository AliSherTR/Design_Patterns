public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(2.3);

        circle.calculateArea();
        circle.calculatePerimeter();
        circle.displayInfo();

        Car toyota = new Car("Toyota");
        toyota.Start();
        toyota.Stop();

    }
}

// 1_ abstraction aims to hide complexity from the users and only show them the relevant information.
// Like if you are driving a car you don't need to know the internal workings of the car
// 2_ you can hide implementation details using abstract classes or interfaces
// 3_ on the abstract level you only need to define the method name and its parameters and let each class implement them in their own way
// 4_ interfaces do not have constructors since they do not have any instance variable.