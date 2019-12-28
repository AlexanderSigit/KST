package kst_assesment;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class KST_Assesment {
    private static List<Name> names = new ArrayList<>();
    public static void main(String[] args) {        
        String firstName;
        String lastName;
        String fileName;
        String command;
        String[] completeName;
        Boolean error = false;
        ArrayList<String> list_unsorted_name = new ArrayList<String>(); 
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter command to execute the program: ");
        command = input.nextLine();        
                
        if(command.split(" ")[0].equalsIgnoreCase("name-sorter")){
            fileName = command.split(" ")[1];
            
            // Read unsorted names list      
            list_unsorted_name = readFile(fileName);
            
            // Store names from txt file into List
            for (String fullName : list_unsorted_name) {
                completeName = Name.getName(fullName);       
                if(completeName.length > 1 && completeName.length <5){ //check length names
                    lastName = completeName[completeName.length-1]; // Get last name from last index
                    firstName = fullName.replace(lastName, ""); // get first name from replace fullname with lastname            
                    names.add(new Name(firstName, lastName));
                }else{
                    error = true;
                }                
            }
                        
            if(error == false){
                // Sort order that set first by last name, then by any given names the person may have         
                names.sort(new LastNameComparator().thenComparing(new FirstNameComparator()));

                // Print into screen
                names.forEach(System.out::println);  

                // Write sorted names list
                writeFile("./sorted-names-list.txt");  
            }else{
                System.out.println("A name must have at least 1 given name and may have up to 3 given names");
            }            
        }else{
            System.out.println("Invalid command!");
        }                                      
    }   
    
    public static ArrayList<String> readFile(String file){
        // This will reference one line at a time
        String fileName = file;      
        String line = null;        
        ArrayList<String> list_unsorted_name = new ArrayList<String>(); 

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                list_unsorted_name.add(line);
            }               
            // Always close files.
            bufferedReader.close();                      
        }
        catch(FileNotFoundException ex) { // Show err 
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                              
            // ex.printStackTrace();
        }                            
        return list_unsorted_name;
    }
    
    public static void writeFile(String file){        
        String fileName = file;                               

        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);            
            
            //Overwrite txtfile
            for (int i = 0; i < names.size(); i++) {
                bufferedWriter.write(names.get(i).toString()); // Note that write() does not automatically            
                bufferedWriter.newLine();  // append a newline character.
            }
                     
            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");            
            // ex.printStackTrace();
        }
    }
}
