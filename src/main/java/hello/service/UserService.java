package hello.service;

import hello.domain.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {

    public List<User> userList = new ArrayList<>();

}
