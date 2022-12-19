package crudops;

import com.mongodb.client.MongoCollection; 
import com.mongodb.client.MongoDatabase;  
import org.bson.Document;  
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;  
public class DropingCollection { 
   
   public static void dropcollection() {  

      CreateDB db = new CreateDB();
      String dbname = db.givedbname("database");
      String collectionname = db.givedbname("collection");
      // Creating a Mongo client 
      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
      // Creating Credentials 
      MongoCredential credential; 
      credential = MongoCredential.createCredential("sampleUser", dbname, 
         "password".toCharArray()); 
      System.out.println("Connected to the database successfully");  
      
      // Accessing the database 
      MongoDatabase database = mongo.getDatabase(dbname);  
      
      // Creating a collection 
      System.out.println("Collections created successfully"); 
      // Retrieving a collection
      MongoCollection<Document> collection = database.getCollection(collectionname);
      // Dropping a Collection 
      collection.drop();
      System.out.println("Collection dropped successfully");
   } 
}
