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

public String[][] documentmul()
{
    Scanner nv = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter number of key pairs");
    Integer arraysize = nv.nextInt();
    String[][] valuesmul = new String[arraysize][2];
    System.out.println("enter values");
    Scanner data = new Scanner(System.in);  // Create a Scanner object
    
    for(int i =0;i<valuesmul.length;i++)
{
    System.out.println("Enter key");
    String key = data.nextLine();
    System.out.println("Enter value");
    String value = data.nextLine();
    valuesmul[i][0] = key;
    valuesmul[i][1] = value;

 }
    for(int i =0;i<valuesmul.length;i++)
    {
        System.out.println(valuesmul[i][0]);
        System.out.println(valuesmul[i][1]);

    }
    return valuesmul;

    }




public static void main(String[] args) {
    CreateDB cdb = new CreateDB();
    cdb.documentmul();
}



    
}
