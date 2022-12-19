package crudops;
import com.mongodb.client.MongoCollection; 
import com.mongodb.client.MongoDatabase; 
import org.bson.Document; 
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;



public class selectingCollection {

    public void viewcollection() {  
      
        // Creating a Mongo client 
        CreateDB db = new CreateDB();
        String dbname = db.givedbname("database");
        String collectionname = db.givedbname("collection");


        MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
       
        // Creating Credentials 
        MongoCredential credential; 
        credential = MongoCredential.createCredential("sampleUser", dbname, 
           "password".toCharArray()); 
        System.out.println("Connected to the database successfully");  
        
        // Accessing the database 
        MongoDatabase database = mongo.getDatabase(dbname);  
        
    
        // Retrieving a collection
        MongoCollection<Document> collection = database.getCollection(collectionname); 
        System.out.println("Collection myCollection selected successfully"); 


     }
   
}
