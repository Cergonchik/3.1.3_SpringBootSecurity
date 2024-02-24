package ru.kata.spring.boot_security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
public class AdminController {
    @GetMapping(value = "/admin/all_users")
    public String getAllUsers(Principal principal) {
        System.out.println("Info " + principal.getName());

        return "all_users";
    }
    //------------------------------  creat
    @GetMapping("/admin/creat_user")
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
    }


}
