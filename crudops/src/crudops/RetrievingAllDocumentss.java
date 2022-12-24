package crudops;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.Iterator;
import org.bson.Document;
import com.mongodb.MongoClient;
public class RetrievingAllDocumentss {
   public static void main( String args[] ) {
      //Creating a MongoDB client
      MongoClient mongo = new MongoClient( "localhost" , 27017 );
      //Connecting to the database
      MongoDatabase database = mongo.getDatabase("carsabc");
      //Creating a collection object
      MongoCollection<Document> collection = database.getCollection("marutiabc");
      //Retrieving the documents
      FindIterable<Document> iterDoc = collection.find();
      Iterator it = iterDoc.iterator();
      while (it.hasNext()) {
         System.out.println(it.next());
      }
   }
}