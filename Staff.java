// Michael DeVito II

public class Staff extends Person { // Child Class
    
    private final String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I work in the " + this.department + " department.";
    }

    
}
