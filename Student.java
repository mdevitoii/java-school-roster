// Michael DeVito II

public class Student extends Person { // Child Class
    
    private final int gradeLevel;
    private final double gpa;

    public Student(String name, int age, int gradeLevel, double gpa) {
        super(name, age); // Call the constructor of the Person class using "super"
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I'm a grade " + this.gradeLevel + " student and my GPA is " + this.gpa; 
    }

    public boolean isHonorRoll() {
        return (this.gpa >= 3.5);
    }

}
