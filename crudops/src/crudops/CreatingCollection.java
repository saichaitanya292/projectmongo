package crudops;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential; 

public class CreatingCollection {

    public static void createcollection() {  
       CreateDB db = new CreateDB();
       String dbname = db.givedbname("database");
       String collectionname = db.givedbname("collection");
       String[] a = db.document();
       String key = a[0];
       String value = a[1];
       System.out.println(key);
       System.out.println(value);

        // Creating a Mongo client 
        MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
       
        // Creating Credentials 
        MongoCredential credential; 
        credential = MongoCredential.createCredential("sampleUser",dbname, 
           "password".toCharArray()); 
        System.out.println("Connected to the database successfully");  
        //Accessing the database 
        MongoDatabase database = mongo.getDatabase(dbname);  
        
        //Creating a collection 
        //database.createCollection("orange1");
        Document document = new Document();
        
        document.append(key,value);
        System.out.println("Collection created successfully"); 

      System.out.println("retrive the added collection");
      MongoCollection<Document> collection = 
   database.getCollection(collectionname);
      //Retrieving the documents
      collection.insertOne(document);
      FindIterable<Document> iterDoc = collection.find();
		
		// Getting the iterator
		Iterator it = iterDoc.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

     } 
    
}
