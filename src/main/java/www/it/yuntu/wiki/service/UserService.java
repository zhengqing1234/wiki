package www.it.yuntu.wiki.service;

import org.springframework.stereotype.Service;
import www.it.yuntu.wiki.dao.UserDaoMapper;
import www.it.yuntu.wiki.entity.User;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    UserDaoMapper userDaoMapper;


    public List<User> getList(){
        return userDaoMapper.getList();
    }
}
