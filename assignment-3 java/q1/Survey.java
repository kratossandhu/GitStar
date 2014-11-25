package q1;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
 //*****************************************************************
 //  Survey.java
 //
 //  This program perform various analysis, and display  various
 //  results such as creating household list and calculating average.
 //******************************************************************
 * @author Rupinder
 * @version 1.0
 */
public class Survey {

    /**
     * Variable to store numeric value 1.
     */
    private static final int ONE = 1;
    
    /**
     * Variable to store numeric value 2.
     */
    private static final int TWO = 2;
    
    /**
     * Variable to store numeric value 3.
     */
    private static final int THREE = 3;
    /**
     * Variable to store numeric value 4.
     */

    private static final int FOUR = 4;
   
    /**
     * Variable to store numeric value 5.
     */
    private static final int FIVE = 5;
    
    /**
     * Variable to store numeric value 6.
     */
    private static final int SIX = 6;
    
    /**
     * Variable to store numeric value 7.
     */
    private static final int SEVEN = 7;
    
    /**
     * Variable to store one of the numeric value in Low Income cutoff Level.
     */
    private static final float INCOME1 = 22229;
    
    /**
     * Variable to store one of the numeric value in Low Income cutoff Level.
     */
    private static final float INCOME2 = 27674;
    
    /**
     * Variable to store one of the numeric value in Low Income cutoff Level.
     */
    private static final float INCOME3 = 34022;
    
    /**
     * Variable to store one of the numeric value in Low Income cutoff Level.
     */
    private static final float INCOME4 = 41307;
    
    /**
     * Variable to store one of the numeric value in Low Income cutoff Level.
     */
    private static final float INCOME5 = 46850;
    
    /**
     * Variable to store one of the numeric value in Low Income cutoff Level.
     */
    private static final float INCOME6 = 52838;
    
    /**
     * Variable to store one of the numeric value in Low Income cutoff Level.
     */
    private static final float INCOME7 = 58827;
    
    /**
     * Variable to store numeric value of additional income
     *  in Low Income cutoff Level.
     */
    private static final float EXCESS = 5989;
    
    /**
     * Variable to store dashes as a String.
     */
    private static final String DASH = "---------------";
    
    /**
     * Creates ArrayList of Household type objects.
     */
    private static ArrayList<Household> householdList 
        = new ArrayList<Household>();
    /**
     // ------------------------------------------------------------------------
     // This method reads the data from survey.txt file and creates 
     // Household items and ArrayList of Household items, executes 
     // averageLister() and licoLevel() methods.
     // ------------------------------------------------------------------------
     * @param args unused
     * @throws IOException if file from which the data is read/extracted
     *                 is not found.
     */
    public static void main(String[] args) throws IOException {
        
        String results;
        Scanner txtScan;
        Scanner itemScan;
        // Scanner object reads/scans a txt file located in src folder.
        txtScan = new Scanner(new File("src\\survey.txt"));
        int idNumber = 0;
        float income = 0;
        int numOfMembers = 0;
        
        //  Read and process each line of the file      
        while (txtScan.hasNext())      {         
             
            results = txtScan.nextLine();         
            //  Read and process each token separated by tab.            
            itemScan = new Scanner(results);         
            itemScan.useDelimiter("\t");
            // Token values are assigned to int variables after
            // converting using Integer class methods.
            while (itemScan.hasNext()) {          
                idNumber = Integer.parseInt(itemScan.next());
                income = Float.parseFloat(itemScan.next());
                numOfMembers = Integer.parseInt(itemScan.next());
            }
            // Household type objects are created.
            Household house = new Household(idNumber, income, numOfMembers);
            householdList.add(house);
        }
        
        System.out.println(DASH + DASH + DASH + DASH + DASH);
        System.out.println("Identification number \t"
                                     + "Annual income \t"
                                     + "Household members");
        System.out.println(DASH + DASH + DASH + DASH + DASH);
        // Prints each HouseHold object.
        for (Household listItem : householdList) {

            System.out.println(listItem);
        }
        System.out.println(DASH + DASH + DASH + DASH + DASH);
        
        // Executes both averageLister() and licoLevel() methods
        averageLister();
        licoLevel();
    }
    
    /**
    // ------------------------------------------------------------------
    // This method calculates the average household income and
    // prints a list of Households that exceed average income.
    // ------------------------------------------------------------------
    */
    public static void averageLister() {
        
        float sum = 0;
        float averageSalary;
        

        for (Household listItem : householdList) {

            sum += listItem.getSalary(); 
        }
        // throws an Arithmetic Exception when householdList.size()==0.
        if (householdList.size() == 0) {
            
            
            throw new IllegalStateException("No Household items listed.");
        }
        averageSalary = sum / (householdList.size());

        System.out.println("List of Households that exceed average income: ");
        System.out.println("Identification number \t"
                           + "Annual income \t");
        for (Household listItem : householdList) {
        
            if (listItem.getSalary() > averageSalary) {
            
                System.out.println(listItem.getIdNum() + "\t\t\t\t" 
                                             + listItem.getSalary() + "\t\t\t");
            }
        } 
        System.out.print(DASH + DASH + DASH + DASH + DASH);
        System.out.println(DASH + DASH + DASH + DASH + DASH);
    }
    
    /**
    // ------------------------------------------------------------------------
    // This method calculates and prints the percentage of households
    // with incomes below the low income cut-off (LICO) level published
    // by Stats Canada.
    // ------------------------------------------------------------------------
    */
    public static void licoLevel() {
        
        int addPerson = 0;
        int lowIncome = 0;
        float excessIncome = 0;
        float percentage;
        // Creates numberFormat object to format the output in percntage.
        NumberFormat fmt = NumberFormat.getPercentInstance();
        
        for (Household listItem : householdList) {
                    
            if (listItem.getMembers() == ONE 
                    && listItem.getSalary() <= INCOME1) {
                        
                lowIncome++; 
            }
            if (listItem.getMembers() == TWO 
                    && listItem.getSalary() <= INCOME2) {
                        
                lowIncome++; 
            }
            if (listItem.getMembers() == THREE 
                    && listItem.getSalary() <= INCOME3) {
                        
                lowIncome++; 
            }
            if (listItem.getMembers() == FOUR 
                    && listItem.getSalary() <= INCOME4) {
                        
                lowIncome++; 
            }
            if (listItem.getMembers() == FIVE 
                    && listItem.getSalary() <= INCOME5) {
                        
                lowIncome++; 
            }
            if (listItem.getMembers() == SIX
                    && listItem.getSalary() <= INCOME6) {
                        
                lowIncome++; 
            }
            if (listItem.getMembers() == SEVEN 
                    && listItem.getSalary() <= INCOME7) {
                        
                lowIncome++; 
            }
            if (listItem.getMembers() > SEVEN) { 
                
                addPerson = SEVEN - listItem.getMembers();
                excessIncome = INCOME7 + ((float) (addPerson * EXCESS));
                
                if (listItem.getSalary() <= excessIncome) {
                        
                    lowIncome++; 
                }
            }
        }
        // throws an Arithmetic Exception when householdList.size()==0.
        if (householdList.size() == 0) {
            
            
            throw new IllegalStateException("No Household items listed.");
        }
        percentage = (float) lowIncome / householdList.size();
                
        System.out.println("Percentage of households with incomes below the"
                                     + " low income cut-off (LICO) level "
                                     + "published by Stats Canada are: "
                                     +  fmt.format(percentage));
    }
}
