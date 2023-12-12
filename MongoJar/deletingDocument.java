import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

import org.bson.Document;
import com.mongodb.client.model.Filters; //it store filter property

public class deletingDocuments{
	public static void main(String args[]){
	MongoClient mongo= new MongoClient("localhost",27017); //creating a mongo client
	System.out.println("connected to the database successfully");
	MongoDatabase database=mongo.getDatabase("mydb"); //accessing the database
	MongoCollection<Document> collection= database.getCollection("samplecollection");
	System.out.println("Collection samplecollection selected successfully");
	
	//deleting the documents
	collection.deleteOne(Filters.eq("id",1);
	System.out.println("document deleted successfully");
	}
}