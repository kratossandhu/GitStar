package q1;

/**
// ************************************************************
//  Household.java
//
//  This program creates a household Object and store the data
//  for a household object.
// ************************************************************
* @author Rupinder
* @version 1.0
*/
public class Household {
    
    /** Identification number for household Object. */
    private int idNum;
    /** Income for household Object. */
    private float salary;
    /** Number of members for household Object. */
    private int members;
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param idNum Holds Identification number
     * @param salary Holds income
     * @param members Holds number of members
     */
    public Household(int idNum, float salary, int members) {
        
        this.idNum = idNum;
        this.salary = salary;
        this.members = members;        
    }
    
    /**
     * Accessor method to access Identification number value.
     * @return Identification number
     */
    public int getIdNum() {
        
        return idNum;
    }
    
    /**
     * Accessor method to access Income value.
     * @return Income
     */
    public float getSalary() {
        
        return salary;
    }
    
    /**
     * Accessor method to access members value.
     * @return members
     */
    public int getMembers() {
        
        return members;
    }
    
    /**
    * Returns a string description of this Household object.
    * @return formatted Identification number, Income and number of members
    */
    public String toString() {
        
        String result = "";
        result += idNum + "\t\t\t\t";
        result += salary + "\t\t\t";
        result += members;
        
        return result;
    }

}
