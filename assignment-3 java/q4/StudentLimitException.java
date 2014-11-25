package q4;

/**
 //******************************************************************** 
 //  StudentLimitException.java
 // 
 //  Represents an exceptional condition in which aadded student in a
 //  course is more than allowed.
 //********************************************************************
  * @author Rupinder
  * @version 1
  */
public class StudentLimitException extends Exception {   
    
    /**
     * <p> Generated serialVersionUID by eclipse.
     */
    private static final long serialVersionUID = 2621859502923964380L;

    /**
     //-----------------------------------------------------------------
     // Sets up the exception object with a particular message.   
     //-----------------------------------------------------------------
      * @param message Message printed when exception is thrown
     */
    StudentLimitException(String message) {      
        
    super(message);   
    }
}

