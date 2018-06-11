package hello;

import com.mongodb.Block;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.stereotype.Component;

@Component
public class MongodbBean {

    public final MongoDbFactory mongo;

    public MongodbBean(MongoDbFactory mongo) {
        this.mongo = mongo;
    }

    public void example() {
        MongoDatabase db = mongo.getDb("rspeed");
        MongoCollection usergroups = db.getCollection("usergroups");
        FindIterable<Document> result = usergroups.find();
        result.forEach(new Block<Document>() {
            @Override
            public void apply(Document document) {
                System.out.print(document);
            }
        });
    }


}
