import java.net.UnknownHostException;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;

import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;

public class updatingDocument{
	public static void main(String args[]) throws UnknownHostException{
		MongoClient mongo=new MongoClient ("localhost",27017);
		System.out.println("Connected to the database successfully");

		DB database = mongo.getDB("myproject"); //using getDB so that id does not create db when it is not avaiable as we have to update

		DBCollection col = db.getCollection("test");
		System.out.println("Collection test selected successfully")

		//update single field in a single document
		DBObject query = new BasicDBObject("id","10");
		DBObject update = new BasicDBObject();

		update.put("$set",new BasicDBObject("likes",300));
		WriteResult result = col.update(query,update);
		System.out.println("Error update);
		//mongo.close();
	
	}
}
