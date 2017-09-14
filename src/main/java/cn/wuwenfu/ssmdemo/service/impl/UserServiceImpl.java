package cn.wuwenfu.ssmdemo.service.impl;


import cn.wuwenfu.ssmdemo.dao.IUserDao;
import cn.wuwenfu.ssmdemo.pojo.User;
import cn.wuwenfu.ssmdemo.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("UserService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userDao.selectByPrimaryKey(userId);
    }

}