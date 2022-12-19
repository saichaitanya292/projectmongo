package crudops;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;

import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential; 

public class CreatingCollection {

    public static void createcollection() {  
       CreateDB db = new CreateDB();
       String dbname = db.givedbname("database");
       String collection = db.givedbname("collection");
       String[] a = db.document();
       String key = a[0];
       String value = a[1];

        // Creating a Mongo client 
        MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
       
        // Creating Credentials 
        MongoCredential credential; 
        credential = MongoCredential.createCredential("sampleUser",dbname , 
           "password".toCharArray()); 
        System.out.println("Connected to the database successfully");  
        //Accessing the database 
        MongoDatabase database = mongo.getDatabase(dbname);  
        
        //Creating a collection 
        database.createCollection(collection);
        Document document = new Document();
        document.append(key, value);
        System.out.println("Collection created successfully"); 
     } 
    
}
