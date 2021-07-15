package www.it.yuntu.wiki.service;

import org.springframework.stereotype.Service;
import www.it.yuntu.wiki.dao.MyUserMapper;
import www.it.yuntu.wiki.entity.MyUser;

import javax.annotation.Resource;

@Service
public class MyUserService {
    @Resource
    private MyUserMapper myUserMapper;

    public MyUser getMyUser(){
        return myUserMapper.selectByPrimaryKey(1);
    }
}
