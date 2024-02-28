package ru.kata.spring.boot_security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.kata.spring.boot_security.demo.dao.RoleRepository;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.servise.UserService;

import java.security.Principal;
import java.util.List;

@Controller
public class AdminController {
    private RoleRepository roleRepository;
    private UserService userService;

    @GetMapping(value = "/admin/all_users")
    public String getAllUsers(Principal principal) {
        System.out.println("Info " + principal.getName());

        return "all_users";
    }
    //------------------------------  creat


    /*@GetMapping("/admin/creat_user")
    public String getCreatUser() {

        return "creat_user";
    }

    @PostMapping("/creat_user")
    public String getAddUser() {

        return "redirect:/all_users";
    }


    //-------------------------------------------- update
    @GetMapping("/admin/update_user")
    public String getWhatUpdateUser() {

        return "update_user";
    }
    @PostMapping("/update_user")
    public String getUpdateUser() {

        return "redirect:/all_users";
    }

    //------------------------------------- delete
    @GetMapping("/admin/delete_user")
    public String getWhatDeleteUser() {

        return "delete_user";
    }
    @PostMapping("/delete_user")
    public String getDeleteUser() {


        return "redirect:/all_users";
    }*/


}
