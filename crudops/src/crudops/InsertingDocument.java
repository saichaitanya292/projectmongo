package crudops;

import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import com.mongodb.MongoClient;
public class InsertingDocument {
   public static void main( String args[] ) {
      //Creating a MongoDB client
      MongoClient mongo = new MongoClient( "localhost" , 27017 );
      //Connecting to the database
      MongoDatabase database = mongo.getDatabase("myDatabase");
      //Creating a collection
      database.createCollection("students");
      //Preparing a document
      Document document = new Document();
      document.append("name", "Ram");
      document.append("age", 26);
      document.append("city", "Hyderabad");
      //Inserting the document into the collection
      database.getCollection("students").insertOne(document);
      System.out.println("Document inserted successfully");
   }

}