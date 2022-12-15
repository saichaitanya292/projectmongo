package crudops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please choose the operation");
        System.out.println("1.Create DB\n2.Create Collection\n3.Update collection\n4.Delete collection\n5.Open collection");
        Scanner scan1 = new Scanner(System.in);
        String choice = scan1.nextLine();  // Read user input
        System.out.println("Performing operation");
        System.out.println(choice);
        switch (choice) {
            case "1":
                System.out.println("Create Db");
                ConnectToDB sdb = new ConnectToDB();
                System.out.println("calling connectdb");
                sdb.connecttodb();

                break;
            case "2":
                System.out.println("Create Collection");
                CreatingCollection cc = new CreatingCollection();
                cc.createcollection();
                break;
            case "3":
                System.out.println("Update Collection");
                break;
            case "4":
                System.out.println("Delete collection");
                break;
            case "5":
                System.out.println("Open collection");
                break;

        }
       


    }
    
}
