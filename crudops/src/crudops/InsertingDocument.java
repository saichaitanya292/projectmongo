package crudops;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import com.mongodb.MongoClient;
public class InsertingDocument {
	public static void main( String args[] ) {
	String[] documentname = cbobj.document();
	String key = documentname[0];
	String value = documentname[0];
	
	
	// Creating a Mongo client
	MongoClient mongo = new MongoClient( "localhost" , 27017 );
	
	// Accessing the database
	MongoDatabase database = mongo.getDatabase(dbname);
	database.createCollection(collectionname);
	
	
	// Retrieving a collection
	MongoCollection<Document> collection = database.getCollection(collectionname);
	System.out.println("Collection sampleCollection selected successfully");
	Document document = new Document();
	document.append(key, value);

	//Inserting document into the collection
	collection.insertOne(document);
	System.out.println("Document inserted successfully");
}
}   
