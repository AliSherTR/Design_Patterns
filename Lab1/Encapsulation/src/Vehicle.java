public class Vehicle {

    private String name = "Toyota Corolla 87";

    private int model = 1987;
    private String variant = "Sedan";


    public String getName(){
        return name;
    }
    public String getVariant(){
        return variant;
    }
    public int getModel(){
       return model;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setVariant(String variant) {
        this.variant = variant;
    }
    public void setModel(int model) {
        this.model = model;
    }
}
