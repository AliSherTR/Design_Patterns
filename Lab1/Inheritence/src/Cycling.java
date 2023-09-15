public class Cycling extends Workout {
    private String workoutType = "cycling";

    public Cycling() {
        super.workoutTime = 59;
        super.workoutDistance = 30;
    }

    public void displayInfo() {
        System.out.println("I did " + workoutType + " and covered a distance of " + workoutDistance + " km in " + workoutTime + " minutes");
    }
}
