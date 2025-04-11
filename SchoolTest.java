// Michael DeVito II
import java.util.ArrayList;


public class SchoolTest { // Main Class (to be run)
    
    public static void main(String[] args) {

        ArrayList<Person> school = new ArrayList<>();
        
        school.add(new Student("Michael",19,13,3.8));
        school.add(new Student("Drew", 18, 13, 4.0));

        school.add(new Teacher("Jared",25,"Programming",1));
        school.add(new Teacher("Dr. B",40,"Computer Science",10));
        
        school.add(new Staff("Joe",30,"Building Services"));

        for (int i = 0; i < school.size(); i++) {

            Person person = school.get(i);

            System.out.println(person.introduce());

            if (person instanceof Person) {

                System.out.println(person.name + " is a Person.");

            } 
            if (person instanceof Student) {

                System.out.println(person.name + " is a Student.");

                if (((Student) person).isHonorRoll()) {

                    /* VScode told me that I needed to cast to the Student class because 
                     * isHonorRoll() was not accessible. This is because the array is
                     * a Person array and not a Student array.
                     */

                    System.out.println(person.name + " is on the honor roll!");

                }
            } 
            if (person instanceof Teacher) {

                System.out.println(person.name + " is a Teacher.");

                if (((Teacher) person).isVeteran()) {

                    System.out.println(person.name + " is a veteran teacher.");

                }
            } 
            if (school.get(i) instanceof Staff) {

                System.out.println(school.get(i).name + " is a Staff member.");

            }

            System.out.println("\n"); // Spacing between prints


        }



    }

}
