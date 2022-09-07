package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    List<User> selectAll();
    int insert(User user);

    int update(User user);
    int delete(@Param("id") int id);


}
