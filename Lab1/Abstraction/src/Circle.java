class Circle extends Shape{

    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        System.out.println("The Area of the circle with the given radius of " + radius + " is " +  Math.PI * radius * radius);
        return  Math.PI * radius * radius;
    }
    @Override
    public  double calculatePerimeter(){
        System.out.println("The Perimeter of the circle with the given radius of " + radius + " is " +  Math.PI * radius);
        return  2 * Math.PI * radius;
    }

    @Override
    public void displayInfo(){
        System.out.println("This is a circle");
    }
}
