package com.decido.decido.app.server.controller;

import com.decido.decido.app.server.mapper.UsersMapper;
import com.decido.decido.app.server.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private UsersMapper userMapper;



    @RequestMapping("/h")
    public String hello()
    {
        return "hello";
    }


    @RequestMapping(value = "/getById",method = RequestMethod.POST,produces = "application/json")
    public Users getById(@RequestBody Users user)
    {
        Users userGot = new Users();
        userGot = userMapper.selectByPrimaryKey(user.getId());
        return userGot;
    }

    @RequestMapping(value = "/delById",method = RequestMethod.POST,consumes = "application/json")
    public String delById(@RequestBody Users user)
    {
       int result = userMapper.deleteByPrimaryKey(user.getId());
       return result == 1 ? "DEL SUCCESS" : "DEL FAILED";
    }

    @RequestMapping(value = "/updateById", method = RequestMethod.POST, consumes = "application/json")
    public String updateById(@RequestBody Users user)
    {
        int result = userMapper.updateByPrimaryKey(user);
        return result == 1 ? "UPDATE SUCCESS" : "UPDATE FAILED";
    }

    @RequestMapping(value = "addNewUser",method = RequestMethod.POST,consumes = "application/json")
    public String addNewUser(@RequestBody Users user)
    {
        int result = userMapper.insert(user);
        return result == 1 ? "UPDATE SUCCESS" : "UPDATE FAILED";
    }


}
