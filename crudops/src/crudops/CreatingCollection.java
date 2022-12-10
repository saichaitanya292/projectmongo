package crudops;
import com.mongodb.client.MongoDatabase; 
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential; 

public class CreatingCollection {

    public static void main( String args[] ) {  
       CreateDB db = new CreateDB();
       String dbname = db.givedbname("database");
       String collection = db.givedbname("collection");

   
      
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
        System.out.println("Collection created successfully"); 
     } 
    
}
