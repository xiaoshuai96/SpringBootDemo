package com.example.springbootdemo.controller;

import com.example.springbootdemo.dao.UserMapper;
import com.example.springbootdemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;

    /**
     * 查询所有用户信息
     * @return
     */
    @RequestMapping(value = "/selectAll")
    @ResponseBody
    public List<User> findAllUser() {
        return userMapper.findAll();
    }

    @RequestMapping(value = "/insertUser")
    public String addUser(){
        User user = new User();
        user.setName("wanger02");
        user.setAge(15);
        user.setEmail("4588666121@163.com");
        userMapper.addUser(user.getName(), user.getAge(), user.getEmail());
        return "add_success";
    }

    @RequestMapping(value = "/deleteUserById")
    public String deleteUser() {
        Integer id = 10;
        if (userMapper.findUserById(id) == null) {
            return "del_failure";
        }
        userMapper.deleteUserById(id);
        return "del_success";
    }





}
