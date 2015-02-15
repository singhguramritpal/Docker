package demo;

import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

@SpringBootApplication
public class MongodblabApplication {

    public static void main(String[] args) throws UnknownHostException {
        //SpringApplication.run(MongodblabApplication.class, args);
        
        MongoClientURI uri  = new MongoClientURI("mongodb://Guramritpal:win123)(*&@ds043991.mongolab.com:43991/dockerfile"); 
        MongoClient client = new MongoClient(uri);
        DB db = client.getDB(uri.getDatabase());
    	DBCollection dbc= db.getCollection("Amrit");
    	BasicDBObject basicdbobject=new BasicDBObject();
    	basicdbobject.put("name", "Guramrit");
    	basicdbobject.put("Course", "Software Engineering");
    	dbc.insert(basicdbobject);
    	
    	DBCursor docs = dbc.find(basicdbobject);
    	
    	while(docs.hasNext()){
	        DBObject doc = docs.next();
	        System.out.println(
	            "In the " + doc.get("name") + ", " + doc.get("Course"));
		}
    }
}
