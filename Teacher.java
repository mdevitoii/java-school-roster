// Michael DeVito II

public class Teacher extends Person { // Child Class
    
    private final String subject;
    private final int yearsOfExperience;

    public Teacher(String name, int age, String subject, int yearsOfExperience) {
        super(name, age);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I teach " + this.subject + " and I have " + this.yearsOfExperience + " years of experience.";
    }

    public boolean isVeteran() {
        return (yearsOfExperience >= 10);
    }

}
