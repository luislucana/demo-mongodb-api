package br.com.exemplo.client;

import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import org.bson.Document;

/**
 * https://www.baeldung.com/java-mongodb
 */
public class MongoExample {
    /*public static void main(String[] args) {

        MongoClient mongoClient = new MongoClient("localhost", 27017);

        //DB database = mongoClient.getDB("myMongoDb");
        MongoDatabase mongoDatabase = mongoClient.getDatabase("myMongoDb");

        // print existing databases
        MongoIterable<String> mongoDatabases = mongoClient.listDatabaseNames();

        for (String mongoDatabaseName : mongoDatabases) {
            System.out.println(mongoDatabaseName);
        }

        mongoDatabase.createCollection("customers", null);

        // print all collections in customers database
        mongoDatabase.getCollectionNames().forEach(System.out::println);

        // create data
        //DBCollection collection = mongoDatabase.getCollection("customers");
        MongoCollection<Document> collection = mongoDatabase.getCollection("customers");
        Document document = new Document();
        document.put("name", "Shubham");
        document.put("company", "Baeldung");
        collection.insertOne(document);

        // update data
        BasicDBObject query = new BasicDBObject();
        query.put("name", "Shubham");
        BasicDBObject newDocument = new BasicDBObject();
        newDocument.put("name", "John");
        BasicDBObject updateObject = new BasicDBObject();
        updateObject.put("$set", newDocument);
        collection.update(query, updateObject);

        // read data
        BasicDBObject searchQuery = new BasicDBObject();
        searchQuery.put("name", "John");
        DBCursor cursor = collection.find(searchQuery);
        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }

        // delete data
        BasicDBObject deleteQuery = new BasicDBObject();
        deleteQuery.put("name", "John");
        collection.remove(deleteQuery);
    }*/
}