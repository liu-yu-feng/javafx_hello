package com.liu.controller;

import com.liu.domain.User;
import com.liu.service.UserService;
import com.liu.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    @RequestMapping("/queryAllUser")
    public String queryAllUser(Model model){
        List<User> list = userService.queryUser();
//        for (User user : list) {
//            System.out.println(user);
//        }
        model.addAttribute("userResultSet",list);
        return "queryAllUser";
    }
    //跳转到新增书籍界面
    @RequestMapping("/toAddUser")
    public String toAddUser(){
        return "addUser";
    }
    //新增用户
    @RequestMapping("/addUser")
    public String addUser(User user){
        System.out.println("addUser=>"+user);
        userService.addUser(user);
        return "redirect:queryAllUser";
    }
    @RequestMapping("/toUpdateUser")
    public String toUpdateUser(Integer id,Model model){
        User user = userService.queryUserById(id);
        System.out.println(user);
        model.addAttribute("user",user);
        return "updateUser";
    }

    @RequestMapping("/updateUser")
    public String updateUser(User user){
        System.out.println("updateUser==>"+user);
        userService.updateUser(user);
        return "redirect:queryAllUser";
    }
    @RequestMapping("/deleteUser")
    public String deleteUser(Integer id){
        userService.deleteUser(userService.queryUserById(id));
        return "redirect:queryAllUser";
    }
}
