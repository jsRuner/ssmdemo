package cn.wuwenfu.ssmdemo.dao;


import cn.wuwenfu.ssmdemo.pojo.User;

import java.util.List;

public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}