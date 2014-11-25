package q4;
import java.util.ArrayList;
import q3.Student;

/**
//*****************************************************************
//  Course.java
//
//  This program creates Student objects and provides methods to
//  print students enrolled and overall course test average.
//*****************************************************************
* @author Rupinder
* @version 1.0
*/
public class Course {

    /**
     * Variable to store numeric value 4.
     */
    private static final int FOUR = 4;
    /**
     * Variable to count number of students added in a course object.
     */
    private int addStudent;
    
    /**
     * Stores course's name.
     * 
     */
    private String courseName;
    
    /**
     * ArrayList to store references to Student objects.
     */
    private ArrayList<Student> studentList;
    
    /**
     * Variable to store overall course test average.
     */
    private float average;
    
    /**
     * This a constructor to create a course object.
     * @param name It is the name of the course object.
     */
    public Course(String name) {
        
        courseName = name;
        studentList = new ArrayList<Student>();
    }
    
    /**
     * This method adds Students to the Course object.
     * @param candidate Student object being added to the course.
     * @throws StudentLimitException if more than 5 students are 
     *                 added to a course.
     */
    public void addStudent(Student candidate) throws StudentLimitException {
        
        
        // Creates an exception object.   
        StudentLimitException problem;
        problem = new  StudentLimitException("More that 5 students cannot be"
                                            + " added to a course.");
        //  Determine if the exception should be thrown 
        if (addStudent > FOUR) {
            
            throw problem;
        }
        Student enrollStudent = candidate;
        studentList.add(enrollStudent);
        addStudent++;
    }
    
    /**
     * This method returns overall course test average.
     * @return the overall course test average.
     */    
    public float average() {
        
        float sum = 0;
        for (Student studentObject : studentList) {
            
            sum += studentObject.average();
        }
        average = (sum / studentList.size());
        return average;
    }
    
    /**
     * This method prints the Students in the course.
     * @return the Students in the course.
     */        
    public String roll() {
        
        String rollCall = "";
        System.out.println("Students in the course \"" + courseName
                                     + "\" are: \n");
        for (Student studentObject : studentList) {
            
            rollCall += "" + studentObject + "\n"; 
        }
        return rollCall;
    }
    
    /**
    * Returns a string description of this Course object.
    * @return formatted Course name and enrolled students
    *                and overall course test average of the students.
    */
    public String toString() {
        
        String result = "";
        result += "Course Name: " + courseName + "\n";
        result += "Enrolled Students: \n" + roll() + "\n";
        result += "Overall Course Test Average: " + average();
        
        return result;
    } 

}
