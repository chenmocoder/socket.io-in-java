package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    public MongodbBean mongodbBean;
    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @RequestMapping("/hello")
    public List hello() {
        logger.info("in hello controller!!!!!");
        List<Map> list = new ArrayList<Map>();
        Map<String,String> map = new HashMap<String, String>();
        map.put("name","lisa");
        list.add(map);
        map.put("password","qwerty");
        list.add(map);
        return list;
    }
}
