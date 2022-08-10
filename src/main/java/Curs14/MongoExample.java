package Curs14;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class MongoExample {

	// Connect to MongoDB
	public static MongoClient connectToMongo() {

		ConnectionString connectionString = new ConnectionString(
				"mongodb+srv://testuser:testuser@cluster0.bkai1.mongodb.net/sample_analytics?retryWrites=true&w=majority");
		MongoClientSettings settings = MongoClientSettings.builder().applyConnectionString(connectionString)
				.serverApi(ServerApi.builder().version(ServerApiVersion.V1).build()).build();

		MongoClient mongoClient = MongoClients.create(settings);

		return mongoClient;
	}

	public static void closeMongoConnectio(MongoClient client) {

		try {

			System.out.println("Trying to close the connection");
			client.close();
			System.out.println("Connection closed successfully!");

		} catch (MongoException e) {

			System.out.println("Could not close the connection");
			e.printStackTrace();
		}
	}

	// create mongo collection
	public static void createMongoCollection(MongoDatabase db, String collectionName) {

		try {
			System.out.println("Trying to create collection: " + collectionName);
			db.createCollection(collectionName);
			System.out.println(collectionName + "created succesfully");

		} catch (MongoException e) {
			System.out.println("Could not create collection");
			e.printStackTrace();
		}

	}

	// get mongo collection
	public static MongoCollection<Document> getMongoCollection(MongoDatabase db, String collectionName) {

		MongoCollection<Document> collection;

		try {
			System.out.println("Trying to read collection: " + collectionName);
			collection = db.getCollection(collectionName);
			System.out.println(collectionName + "successfully get");
			return collection;

		} catch (MongoException e) {
			System.out.println("Could not get the collection");
			e.printStackTrace();
		}
		return null;
	}
	
	// insert into collection
	public static void insertOneDocumentIntoCollection(MongoCollection<Document> collection, Document doc) {
		
		try {
			System.out.println("Trying to insert document");
			collection.insertOne(doc);
			System.out.println("Document inserted successfully");
			
		}catch(MongoException e) {
			System.out.println("Could not insert into collection");
			e.printStackTrace();
		}
	}
	
	

	public static void main(String[] args) {

		MongoClient mongoClient = connectToMongo();

		MongoDatabase databaseSampleAnalytics = mongoClient.getDatabase("sample_analytics");

		// mongoClient.close();

		databaseSampleAnalytics.listCollectionNames();

		// createMongoCollection(databaseSampleAnalytics, "DanMCollection");

		for (String name : databaseSampleAnalytics.listCollectionNames()) {
			System.out.println("Collection name : " + name);
		}

		MongoCollection<Document> danmCollection = getMongoCollection(databaseSampleAnalytics, "DanMCollection");

		long documentsCount = danmCollection.countDocuments();
		System.out.println("Count documents in danmCollection: " + documentsCount);

		Document customer = new Document("id", new ObjectId())
				.append("name", "Customer")
				.append("credit", 100)
				.append("address", "strada sperantei parter")
				.append("email", "customer@mongotest.com");
		
		//insertOneDocumentIntoCollection(danmCollection, customer);
		System.out.println("Counts documents in danmCollection: " + documentsCount);
		
		
		Document customer2 = new Document("id", new ObjectId())
				.append("name", "Customer2")
				.append("credit", 100)
				.append("address", "strada sperantei parter")
				.append("email", "customer@mongotest.com");
		Document customer3 = new Document("id", new ObjectId())
				.append("name", "Customer4")
				.append("credit", 100)
				.append("address", "strada sperantei parter")
				.append("email", "customer@mongotest.com");
		Document customer4 = new Document("id", new ObjectId())
				.append("name", "Customer5")
				.append("credit", 100)
				.append("address", "strada sperantei parter")
				.append("email", "customer@mongotest.com");
		
		List<Document> customers = new ArrayList<Document>();
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		
		//danmCollection.insertMany(customers);
		long documentsCount2 = danmCollection.countDocuments();
		System.out.println("Count documents in danmCollection : " + documentsCount2);
		
		Document obj = danmCollection.find(new Document("credit", 150)).first();
		System.out.println(obj.toJson());
		
		danmCollection.updateOne(
				Filters.eq("name", "Customer4"), 
				Updates.set("credit", 150));
		
		Document obj2 = danmCollection.find(new Document("name", "Customer4")).first();
		System.out.println(obj2.toJson());

		
		Bson filter = Filters.eq("name", "Customer5");
		Bson update = Updates.set("address", "no address");
		Bson update2 = Updates.set("email", "no email");
		Bson updates = Updates.combine(update, update2);
		
		danmCollection.findOneAndUpdate(filter, updates);
		
		Document obj3 = danmCollection.find(new Document("name", "Customer4")).first();
		System.out.println(obj3.toJson());

		//delete one document
		Bson filter1 = Filters.eq("name", "Customer5");
		danmCollection.findOneAndDelete(filter1);
		
		//delete many documents
		Bson filter2 = Filters.eq("credit", 100);
		danmCollection.deleteMany(filter2);
		
		//delete collection
		danmCollection.drop();
		
		long documentsCount3 = danmCollection.countDocuments();
		System.out.println("Count documents in danmCollection : " + documentsCount3);
		
		
		closeMongoConnectio(mongoClient);

	}

}
