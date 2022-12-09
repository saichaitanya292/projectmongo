package crudops;

import java.util.Scanner;

public class CreateDB {

public String givedbname()
{
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter database name");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("database name: " + userName);  // Output user input
    return userName;

}  




    
}
