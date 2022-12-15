package crudops;

import com.mongodb.client.MongoDatabase; 
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;  


public class ConnectToDB {
	public static void connecttodb() {  
		CreateDB cobj = new CreateDB();
    	String database_name = cobj.givedbname("database");
	      
	      // Creating a Mongo client 
	      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
	   
	      // Creating Credentials 
	      MongoCredential credential; 
	      credential = MongoCredential.createCredential("sampleUser", database_name, 
	         "password".toCharArray()); 
	      System.out.println("Connected to the database successfully");  
	      
	      // Accessing the database 
	      MongoDatabase database = mongo.getDatabase(database_name); 
	      System.out.println("Credentials ::"+ credential);     
	   } 
}
