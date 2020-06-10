package com.example.springbootdemo.service;

import com.example.springbootdemo.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IUserService {
    /**
     * 添加单个用户信息
     * @param name
     * @param age
     * @param email
     */
    void addUser(@Param("name") String name,
                 @Param("age") Integer age, @Param("email") String email);

    /**
     * 根据id删除指定用户信息
     * @param id
     */
    void deleteUserById(Integer id);

    /**
     * 查询所有
     *
     * @return
     */
    List<User> findAll();

    /**
     * 查询数据库中是否存在该用户信息
     * @return
     */
    User findUserById(Integer id);

}
