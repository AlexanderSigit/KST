package kst_assesment;

import java.util.Comparator;

/**
 *
 * @author Alexander Sigit
 */
public class Name{
    public static final String DELIMITER = " ";    

    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static String[] getName(String fullName){ //split names by delimiter " " with index
        return fullName.split(DELIMITER);
    }
    
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    @Override 
    public String toString(){ //print names to screen
        return String.join("" , this.firstName, this.lastName);
    }    
}

// sort order by last name
class LastNameComparator implements Comparator<Name>{
    @Override
    public int compare(Name a, Name b) {
        return a.getLastName().compareTo(b.getLastName());  
    }
}

// sort order by first name
class FirstNameComparator implements Comparator<Name>{
    @Override
    public int compare(Name a, Name b) {
        return a.getFirstName().compareTo(b.getFirstName());  
    }
}