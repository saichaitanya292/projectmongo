package crudops;

import java.lang.reflect.Array;
import java.util.Scanner;

public class CreateDB {

public String givedbname(String instance)
{
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter "+ instance+ "name");

    String instancename = myObj.nextLine();  // Read user input
    System.out.println(instance + " name: " + instancename);  // Output user input
    return instancename;


} 


public String[] document()
{

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter Key");
    String keyname = myObj.nextLine(); 
    Scanner vobj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter Value");
    String valuename = vobj.nextLine(); 
    String[] values = new String[2]; // Output user input
    values[0] = keyname;
    values[1] = valuename;
    return values;


}




    
}
