import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

import org.bson.Document;

public class insertDocument{
	public static void main(String args[]){
	MongoClient mongo = new MongoClient ("localhost",27017); //creating a mongo client
	System.out.printIn("Connected to db successfully"); //accessing the database
	MongoDatabase database = mongo.getDatabase("myproject"); //accessing the collection

	MongCollection<Document> collection=database.getCollection("SampleCollection");
	System.out.println("Collection sampleCollection selected successfullly");

	Document document=new Document();
	document.append("id",1);
	document.append("description","database");
	document.apppend("likes",100);
	document.append("url","http://www.mongodb.com");
	document.append("by","NoSQL");

	collection.insertOne(document);
	System.out.println("Document insearted successfully");
	}
}
