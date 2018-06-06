package hello;

import com.mongodb.client.MongoDatabase;
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
        String dbName = db.getName();
        System.out.print(dbName);
    }


}
