package www.it.yuntu.wiki.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("hello")
    public String Hello(){
        return "hello 美女";
    }
    @PostMapping("helloPost")
    public String helloPOST(){
        return "hello 帅哥";
    }

}
