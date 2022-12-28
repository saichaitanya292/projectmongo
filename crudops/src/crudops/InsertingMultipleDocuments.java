package crudops;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import com.mongodb.MongoClient;
public class InsertingMultipleDocuments {
   public static void main( String args[] ) {
      //Creating a MongoDB client
      MongoClient mongo = new MongoClient( "localhost" , 27017 );
      //Connecting to the database
      MongoDatabase database = mongo.getDatabase("myDatabase");
      //Creating a collection object
      MongoCollection<Document> collection =
      database.getCollection("sampleCollection");
      Document document1 = new Document("name", "Ram").append("age", 26).append("city", "Hyderabad");
      Document document2 = new Document("name", "Robert").append("age", 27).append("city", "Vishakhapatnam");
      Document document3 = new Document("name", "Rhim").append("age", 30).append("city", "Delhi");
      //Inserting the created documents
      List<Document> list = new ArrayList<Document>();
      list.add(document1);
      list.add(document2);
      list.add(document3);
      collection.insertMany(list);
      System.out.println("Documents Inserted");
   }
}