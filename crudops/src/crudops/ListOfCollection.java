package crudops;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;

import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;  
public class ListOfCollection { 
   
   public void lc() {  
      CreateDB db = new CreateDB();
      String dbname = db.givedbname("database");

      
      // Creating a Mongo client 
      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
      // Creating Credentials 
      MongoCredential credential; 
      credential = MongoCredential.createCredential("sampleUser", dbname, 
         "password".toCharArray()); 
      System.out.println("Connected to the database successfully");  
      
      // Accessing the database 
      MongoDatabase database = mongo.getDatabase(dbname); 
      for (String name : database.listCollectionNames()) { 
         System.out.println("collections");
         System.out.println("collections"+ " " +name); 
      } 

      
   }
} 