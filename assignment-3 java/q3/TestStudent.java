package q3;
/**
 //*****************************************************************
 // TestStudents.java
 //
 //  This is a driver program to exercise the new Student methods.
 //*****************************************************************
 * @author Rupinder
 * @version 1.0
 */
public class TestStudent {
    
    /**
    * Creates some Address and Student objects and prints them.
    * @param args Unused
    */
    public static void main(String[] args) {
        
        // John's test-1 scores.
        final int johnMarks1 = 64;
        // John's test-2 scores.
        final int johnMarks2 = 55;
        // John's test-3 scores.
        final int johnMarks3 = 70;
        // Martha's test-1 scores.
        final int marthaMarks1 = 83;
        // Martha's test-2 scores.
        final int marthaMarks2 = 91;
        // Martha's test-3 scores.
        final int marthaMarks3 = 69;
        // Constant representing test Number-1.
        final int test1 = 1;
        // Constant representing test Number-2.
        final int test2 = 2;
        // Constant representing test Number-3.
        final int test3 = 3;
        
        // Sets up a new Address object for Student's school address
        Address school = new Address("3700 Willingdon Ave.", "Burnaby", "BC",
                                                         "V5G 3H2");
        // Sets up new Student object and 
        // Address object for Student's home addresses.
        Address jHome = new Address("21 Jump Street", "Langley", "BC",
                                                         "V3A 6K6");
        Student john = new Student("John", "Smith", jHome, school, johnMarks1,
                                                     johnMarks2, johnMarks3);

        Address mHome = new Address("123 Main Street", "North Pole", "NU",
                                                           "H0H 0H0");
        Student martha = new Student("Martha", "Jones", mHome, school);
        // sets-up martha's test scores.
        martha.setTestScore(test1, marthaMarks1);
        martha.setTestScore(test2, marthaMarks2);
        martha.setTestScore(test3, marthaMarks3);
        
        // calls average method to calculate average.
        john.average();
        martha.average();
        
        //print the toString methods of both Student objects.
        System.out.println(john);
        System.out.println();
        System.out.println(martha);
    }
}
