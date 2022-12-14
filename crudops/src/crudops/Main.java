package crudops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please choose the operation");
        System.out.println("1.Create DB\n2.Create Collection\n3.Update collection\n4.Delete collection\n5.Open collection\n6.Delete Document\n7.Insert multiple key value\n8.Insertmuldocuments");
        Scanner scan1 = new Scanner(System.in);
        String choice = scan1.nextLine();  // Read user input
        System.out.println("Performing operation");
        System.out.println(choice);
        switch (choice) {
            case "1":
                System.out.println("Create Db");
                ConnectToDB sdb = new ConnectToDB();
                sdb.connecttodb();
                break;
            case "2":
                System.out.println("Create Collection");
                CreatingCollection cc = new CreatingCollection();
                cc.createcollection();
                break;
            case "3":
                System.out.println("Update Collection");
                UpdatingDocuments ud = new UpdatingDocuments();
                ud.updatedoc();
                break;
            case "4":
                System.out.println("Delete collection");
                DropingCollection dc = new DropingCollection();
                dc.dropcollection();
                break;
            case "5":
                System.out.println("View collections in db");
                ListOfCollection s = new ListOfCollection();
                s.lc();
                break;
            case "6":
                System.out.println("Delete Document");
                DeletingDocuments dd = new DeletingDocuments();
                dd.deletedoc();
                break;
            case "7":
                System.out.println("Insert multiple key value");
                CreatingCollectionmul cm = new CreatingCollectionmul();
                cm.createcollection();
                break;
            case "8":
                System.out.println("Insert multiple documents");
                InsertingMultipleDocuments imd = new InsertingMultipleDocuments();
                imd.insertmuldoc();
                break;
            
            }
    }
    
}
