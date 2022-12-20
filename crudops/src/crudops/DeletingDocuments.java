package crudops;

import com.mongodb.client.FindIterable; 
import com.mongodb.client.MongoCollection; 
import com.mongodb.client.MongoDatabase; 
import com.mongodb.client.model.Filters;  
import java.util.Iterator; 
import org.bson.Document; 
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;  
public class DeletingDocuments { 
   
   public static void deletedoc() {  
      CreateDB cd = new CreateDB();
      String dbname = cd.givedbname("database");
      String collectionname = cd.givedbname("collection");
      String[] keyval = cd.document();
      String key = keyval[0];
      String val = keyval[1];
   
      // Creating a Mongo client 
      MongoClient mongo = new MongoClient( "localhost" , 27017 );
      
      // Creating Credentials 
      MongoCredential credential; 
      credential = MongoCredential.createCredential("sampleUser",dbname, 
         "password".toCharArray()); 
      System.out.println("Connected to the database successfully");  
      
      // Accessing the database 
      MongoDatabase database = mongo.getDatabase(dbname); 
      // Retrieving a collection
      MongoCollection<Document> collection = database.getCollection(collectionname);
      System.out.println("Collection sampleCollection selected successfully"); 
      // Deleting the documents 
      collection.deleteOne(Filters.eq(key,val)); 
      System.out.println("Document deleted successfully...");  
      
      // Retrieving the documents after updation 
      // Getting the iterable object 
      FindIterable<Document> iterDoc = collection.find(); 
      int i = 1; 
      // Getting the iterator 
      Iterator it = iterDoc.iterator(); 
      while (it.hasNext()) {  
         System.out.println(it.next());  
         i++; 
      }       
   } 
}