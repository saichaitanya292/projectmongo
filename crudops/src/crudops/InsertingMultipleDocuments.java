package crudops;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.bson.Document;
import com.mongodb.MongoClient;
public class InsertingMultipleDocuments {

   public void insertmuldoc() {
      //Creating a MongoDB client
      MongoClient mongo = new MongoClient( "localhost" , 27017 );
      //Connecting to the database
      MongoDatabase database = mongo.getDatabase("myDatabase");
      //Creating a collection object
      MongoCollection<Document> collection =
      database.getCollection("sampleCollection");
      List<Document> list = new ArrayList<Document>();
      System.out.println("please enter number of documents");
      Scanner ndk = new Scanner(System.in);
      int nd = ndk.nextInt();
      for(int i=0;i<nd;i++)
      {
         Document document4 = new Document();
         System.out.println("please enter number of key value pairs");
         Scanner kv = new Scanner(System.in);
         int nkv = kv.nextInt();

         for(int j=0;j<nkv;j++)
         {
            Scanner scan = new Scanner(System.in);
            System.out.println("please enter key value pairs");
            String k1 = scan.nextLine();
            String v1 = scan.nextLine();
            document4.append(k1,v1);
         }
         
         list.add(document4);
      }
      
      collection.insertMany(list);
      System.out.println("Documents Inserted");
   }

   
}