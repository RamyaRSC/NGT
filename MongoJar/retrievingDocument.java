import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

import org.bson.Document;
import java.util.Interator;
import com.mongodb.client.FinfIterable;

public class retrievingDocument{
	public static void main(String args[]){
		MongoClient mongo = new MongoClient ("localhost",27017); //creating a mongo client
		System.out.printIn("Connected to db successfully"); //accessing the database
		MongoDatabase database = mongo.getDatabase("myproject"); //accessing the collection

		MongoCollection<Document> collection=database.getCollection("test");
		System.out.println("Collection sampleCollection selected successfullly");

		FindIterable<Document> iterableDocument= collection.find();
		int i =1;
		Iterator it= interableDocument.interator();
		while(it.hasNext()){
			System.out.println(it.next());
			i++;
		}
	
		collection.insertOne(document);
		System.out.println("Document insearted successfully");
	}
}
