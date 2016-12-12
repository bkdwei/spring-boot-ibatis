package com.yhj.mapper;

import com.yhj.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by YHJ on 2016/9/3.
 */
@Mapper
public interface UserMapper{

    int insert(User user);

    List<User> find(User user);

    int update(User user);

    int delete(Integer id);

}
