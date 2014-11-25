package q4;
import q3.Address;
import q3.Student;

/**
 //*****************************************************************
 // TestCourse.java
 //
 //  This is a driver program to exercise the new Student methods.
 //*****************************************************************
 * @author Rupinder
 * @version 1.0
 */
public class TestCourse {
    
    /**
    * Creates some Address, Course and Student objects and prints them.
    * @param args Unused
    * @throws StudentLimitException if more than 5 students are 
    *                 added to a course.
    */
    public static void main(String[] args) throws StudentLimitException {
        
        // John's test-1 scores.
        final int sampleMarks1 = 64;
        // John's test-2 scores.
        final int sampleMarks2 = 55;
        // John's test-3 scores.
        final int sampleMarks3 = 70;
        // Martha's test-1 scores.
        final int altMarks1 = 83;
        // Martha's test-2 scores.
        final int altMarks2 = 91;
        // Martha's test-3 scores.
        final int altMarks3 = 69;
        // Variable stores overall course test average.
        float courseAverage;
        
        // Sets up a new Address object for Student's school address
        Address school = new Address("3700 Willingdon Ave.", "Burnaby", "BC",
                                                         "V5G 3H2");
         // Sets up new Student object and 
         // Address object for Student's home addresses.
        Address mmHome = new Address("21 Jump Street", "Langley", "BC",
                                                         "V3A 6K6");
        Student mm = new Student("Eminem", "MM", mmHome, school, sampleMarks1,
                                                   sampleMarks2, sampleMarks3);

        Address westHome = new Address("123 Main Street", "North Pole", "NU",
                                                           "H0H 0H0");
        Student west = new Student("Kanye", "West", westHome, school, altMarks1,
                                                   altMarks2, altMarks3);
        
        Address wizHome = new Address("22 Jump Street", "Langley", "BC",
                                                              "V3A 6K6");
        Student wiz = new Student("Wiz", "Kifa", wizHome, school, sampleMarks1,
                                                   sampleMarks2, sampleMarks3);
        
        Address jimHome = new Address("420 Main Street", "South Pole", "NU",
                                                             "H1H 1H1");
        Student jim = new Student("Jim", "Pattison", jimHome, school, altMarks1,
                                                     altMarks2, altMarks3);
        
        Address jayHome = new Address("180 Flip Street", "Langley", "BC",
                                                             "V3D 4K4");
        Student jay = new Student("Jay", "Z", jayHome, school, sampleMarks1,
                                                   sampleMarks2, sampleMarks3);
        
        // Creates a new course.
        Course comp1510 = new Course("COMP-1510");
        
        // adds several students to the course.
        comp1510.addStudent(mm);
        comp1510.addStudent(west);
        comp1510.addStudent(wiz);
        comp1510.addStudent(jim);
        comp1510.addStudent(jay);
        
        //print the roll method of the Course object.
        System.out.println(comp1510.roll());
                
        // Calculates the average method to calculate 
        // the overall course test average.
        
        courseAverage = comp1510.average();
        
        // prints the overall course test average.
        System.out.println("Overall course test average of the course: "
                                     + courseAverage);
    }
}
