package www.it.yuntu.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import www.it.yuntu.wiki.dao.MyUserMapper;
import www.it.yuntu.wiki.entity.MyUser;
import www.it.yuntu.wiki.service.MyUserService;

import javax.annotation.Resource;

@RestController
public class MyUserController {
    @Resource
    private MyUserService myUserService;

    @GetMapping("/myUser")
    public MyUser getUser(){
        return myUserService.getMyUser();
    }
}
