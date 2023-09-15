public class Running extends Workout {
    private String workoutType = "running";

    public Running() {
        super.workoutTime = 10.5;
        super.workoutDistance = 20;
    }

    public void displayInfo() {
        System.out.println("I did " + workoutType + " and covered a distance of " + workoutDistance + " km in " + workoutTime + " minutes");
    }
}
