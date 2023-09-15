public class Main {
    public static void main(String[] args) {
       Vehicle ob = new Vehicle();
        System.out.println("The model of the car is " + ob.getModel());
        System.out.println("The variant of the car is " + ob.getVariant());
        System.out.println("The name of the car is " + ob.getName());

        ob.setModel(1993);
        System.out.println("The changed model of the car is " + ob.getModel());
        ob.setName("Nissan");
        System.out.println("The changed name of the car is " + ob.getName());
        ob.setVariant("hatchback");
        System.out.println("The changed variant of the car is " + ob.getVariant());
    }
}

// 1_ Encapsulation enable system-wide security so that the data in a class cannot be accessed directly from anywhere
// 2_ It safeguards the internal contents of a class like a capsule