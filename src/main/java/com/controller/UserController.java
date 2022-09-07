package com.controller;

import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    int ids;

    @Autowired
    private UserService service;

    @RequestMapping("/look")
    public  String select(Model model){
        List<User> list =
                service.selectServiceAll();
        model.addAttribute("list",list);
        return "index";
    }

    @RequestMapping("/insert")
    public String insert(){
        return "insert";
    }
    @RequestMapping("/doinsert")
    public String doInsert(Model model,String userCode,String userName){
        User user=new User();
        user.setId(999);
        user.setUserCode(userCode);
        user.setUserName(userName);
        int insert = service.insert(user);
        if (insert==1){
            List<User> list = service.selectServiceAll();
            model.addAttribute("list",list);
        }else {
            return "error";
        }
        return "index";
    }

    @RequestMapping("/update")
    public String update(int id){
        ids=id;
        return "update";
    }

    @RequestMapping("/doupdate")
    public String doupdate(Model model,String userCode,String userName){
        User user=new User();
        user.setId(ids);
        user.setUserName(userName);
        user.setUserCode(userCode);
        int update = service.update(user);
        if (update==1){
            List<User> list = service.selectServiceAll();
            model.addAttribute("list",list);
        }else {
            return "error";
        }
        return "index";
    }
    @RequestMapping("/delete")
    public String delete(Model model,int id){
        int delete = service.delete(id);
        if (delete==1){
            List<User> list = service.selectServiceAll();
            model.addAttribute("list",list);
        }else {
            return "error";
        }
        return "index";
    }
}