package www.it.yuntu.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import www.it.yuntu.wiki.entity.User;
import www.it.yuntu.wiki.service.UserService;


import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
    @Resource
    private UserService userService;


    @Value("${config.txt}")
    private String name;

    @GetMapping("hello")
    public String Hello(){
        return "hello美女22"+name;
    }

    @PostMapping("helloPost")
    public String HelloPOST(){
        return "hello 帅哥";
    }


    @GetMapping("user")
    public List<User> getList(){
        return userService.getList();
    }


}
