package crudops;

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




    
}
