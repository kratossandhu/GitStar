package q3;
/**
 * Represents a college student.
 * @author Rupinder
 * @version 1
 */
public class Student {
    /** First name of this student. */
    private String firstName;

    /** Last name of this student. */
    private String lastName;

    /** Home address of this student. */
    private Address homeAddress;

    /** School address of this student.  Can be shared by other students */
    private Address schoolAddress;
    
    /** score for test-1. */
    private int testScore1;
    
    /** score for test-2. */
    private int testScore2;
    
    /** score for test-3. */
    private int testScore3;
    
    /** average of the scores of the three test scores. */
    private float averageScore;
    
    /** Constant representing number 3. */
    private final int three = 3;

    /**
    * Constructor: Sets up this student with the specified values.
    * @param first The first name of the student
    * @param last The last name of the student
    * @param home The home address of the student
    * @param school The school address of the student
    * @param score1 Holds score for test-1
    * @param score2 Holds score for test-2
    * @param score3 Holds score for test-3
    */
    public Student(String first, String last, Address home, Address school,
                            int score1, int score2, int score3) {
        
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        testScore1 = score1;
        testScore2 = score2;
        testScore3 = score3;
    }
    
    /**
     * Constructor: Sets up this student with the specified values
     * without parameters for scores. 
     * @param first The first name of the student
     * @param last The last name of the student
     * @param home The home address of the student
     * @param school The school address of the student
     */
    public Student(String first, String last, Address home,
            Address school) {
        
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        testScore1 = 0;
        testScore2 = 0;
        testScore3 = 0;
    }

    /**
    * Sets-up score of the given test number of this Student object.
    * @param testNumber The test number of the student.
    * @param score score for the specific test.
    */
    public void setTestScore(int testNumber, int score) {
        
        int testNum = testNumber;
        
        if (testNum == 1) {
            
            testScore1 = score;
        } else if (testNum == 2) {
            
            testScore2 = score;
        } else {
            
            testScore3 = score;
        } 
    }
    
    /**
     * Sets-up score of the given test number of this Student object.
     * @param testNumber The test number of the student.
     * @return appropriate test score called by driver class. 
     */
    public int getTestScore(int testNumber) {
        
        int testNum = testNumber;
        if (testNum == 1) {
        
            return testScore1;
        } else if (testNum == 2) {
            
            return testScore2;
        } else {
            
            return testScore3;
        } 
    }
    /**
     * Calculates average of the scores of the three test
     * scores of this Student object.
     * @return average of the test scores of the student. 
     */
    public float average() {
        averageScore = (float) ((testScore1 + testScore2 + testScore3) / three);
        return averageScore;
    }

    /**
    * Returns a string description of this Student object.
    * @return formatted name and addresses of student
    */
    public String toString() {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        result += "Test Scores:\n";
        result += "Test1:\t" + testScore1 + "\n";
        result += "Test2:\t" + testScore2 + "\n";
        result += "Test3:\t" + testScore3 + "\n";
        result += "Average:\t" + average() + "\n";
        
        return result;
    }
}
