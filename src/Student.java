public class Student {

    private String name;
    private int maths;
    private int physics;
    private int chemistry;


    // Constructor
    public Student(String name, int maths, int physics, int chemistry) {

        this.name = name;
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getMaths() {
        return maths;
    }

    public int getPhysics() {
        return physics;
    }

    public int getChemistry() {
        return chemistry;
    }

    // Calculate total
    public int calculateTotal() {

        return maths + physics + chemistry;
    }

    // Calculate average
    public double calculateAverage() {

        return calculateTotal() / 3.0;
    }

    // Calculate grade
    public String calculateGrade() {

        double avg = calculateAverage();

        if (avg >= 90) {
            return "A";
        } else if (avg >= 75) {
            return "B";
        } else if (avg >= 60) {
            return "C";
        } else {
            return "D";
        }
    }
}