package hello;


import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URISyntaxException;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    public MongodbBean mongodbBean;

    public static  void main (String args[]) {
        SpringApplication.run(Application.class,args);
    }
    public Socket socket;
    @Override
    public void run(String... args) throws URISyntaxException {
//        mongodbBean.example();
        System.out.print("run success!!");
        socket = IO.socket("http://47.100.39.70:80");
        socket.on(Socket.EVENT_CONNECT, new Emitter.Listener() {
            @Override
            public void call(Object... args) {
                System.out.print("connect successful!!!!!!!!!!!!!!!!!!!!!!");
            }
        });
        socket.on("alarm", new Emitter.Listener() {

            @Override
            public void call(Object... args) {
                System.out.print(args);
                JSONObject obj = (JSONObject) args[0];
                System.out.print(obj);
            }

        });
        socket.connect();
    }
}
