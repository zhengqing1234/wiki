package www.it.yuntu.wiki.dao;

import www.it.yuntu.wiki.entity.User;

import java.util.List;

/**
 * 查询用户接口
 */
public interface UserDaoMapper {
    /**
     *
     * @return List<User>
     */
    public List<User> getList();
}
