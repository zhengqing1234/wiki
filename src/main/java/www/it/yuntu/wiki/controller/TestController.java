package www.it.yuntu.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @Value("${config.txt}")
    private String name;

    @GetMapping("hello")
    public String Hello(){
        return "hello 美女"+name;
    }

    @PostMapping("helloPost")
    public String HelloPOST(){
        return "hello 帅哥";
    }

}
