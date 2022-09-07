package com.service;

import com.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    List<User> selectServiceAll();
    int insert(User user);
    int update(User user);
    int delete(int id);
}
