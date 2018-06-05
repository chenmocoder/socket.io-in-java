package hello;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.sun.deploy.net.HttpResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public List hello() {
        List<Map> list = new ArrayList<Map>();
        Map<String,String> map = new HashMap<String, String>();
        map.put("name","lisa");
        list.add(map);
        map.put("password","qwerty");
        list.add(map);
        return list;
    }
}
