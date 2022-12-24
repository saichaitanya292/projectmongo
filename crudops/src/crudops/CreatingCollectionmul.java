package crudops;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential; 

public class CreatingCollectionmul {

    public static void createcollection() {  
       CreateDB db = new CreateDB();
       String dbname = db.givedbname("database");
       String collectionname = db.givedbname("collection");
      String[][] kvp = db.documentmul();

        // Creating a Mongo client 
        MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
       
        // Creating Credentials 
        MongoCredential credential; 
        credential = MongoCredential.createCredential("sampleUser","abc123" , 
           "password".toCharArray()); 
        System.out.println("Connected to the database successfully");  
        //Accessing the database 
        MongoDatabase database = mongo.getDatabase(dbname);  
        
        //Creating a collection 
        database.createCollection(collectionname);
        Document document = new Document();
        for(int i =0;i<kvp.length;i++)
    {
      
        document.append(kvp[i][0], kvp[i][1]);
    }
       
        System.out.println("Collection created successfully"); 

      System.out.println("retrive the added collection");
      MongoCollection<Document> collection = database.getCollection(collectionname);
      //Retrieving the documents
      collection.insertOne(document);
      FindIterable<Document> iterDoc = collection.find();
      Iterator it = iterDoc.iterator();
      while (it.hasNext()) {
         System.out.println(it.next());
      }
     } 
    
}
