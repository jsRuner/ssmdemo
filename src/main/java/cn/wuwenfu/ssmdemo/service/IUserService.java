package cn.wuwenfu.ssmdemo.service;

import cn.wuwenfu.ssmdemo.pojo.User;

import java.util.List;

public interface IUserService {
    public User getUserById(int userId);

    public List<User> getUsers();

    public void addUser(User user);

    public void deleteUser(int userId);

    public void editUser(User user);
}


