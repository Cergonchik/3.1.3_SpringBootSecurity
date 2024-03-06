package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.kata.spring.boot_security.demo.dao.RoleRepository;
import ru.kata.spring.boot_security.demo.dao.UserRepository;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.servise.RoleService;
import ru.kata.spring.boot_security.demo.servise.UserService;
//import ru.kata.spring.boot_security.demo.servise.UserServiceS;
//import ru.kata.spring.boot_security.demo.servise.UserServicelmpl;

import java.security.Principal;
import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    private RoleService roleService;
    private UserService userService;

    @Autowired
    public AdminController(RoleService roleService, UserService userService ) {
        this.roleService = roleService;
        this.userService = userService;

    }



    @GetMapping("/admin")
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.findAll());
        return "all_users";
    }
    //------------------------------  creat


    @GetMapping("/creat_user")
    public String getCreatUser(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("role", roleService.getAll());
        return "creat_user";
    }

    @PostMapping("/creat_user")
    public String getAddUser(@ModelAttribute(value = "user") User user) {
        userService.save(user);
        return "redirect:/admin";
    }


    //-------------------------------------------- update
    @GetMapping("/update_user")
    public String getWhatUpdateUser(Model model, @ModelAttribute("userU") User user) {
        model.addAttribute("userU", new User());
        return "update_user";
    }
    @PostMapping("/update_user")
    public String updateUser(@ModelAttribute("userU") User user) {
        try {
            userService.update(user);
        } catch (Exception e) {
            System.out.println("No this user!");
        }
        return "redirect:/admin";
    }

    //------------------------------------- delete
    @GetMapping("/delete_user")
    public String getWhatDeleteUser(Model model) {
        model.addAttribute("userD", new User());
        return "delete_user";
    }
    @PostMapping("/delete_user")
    public String getDeleteUser(@ModelAttribute(value = "userD") User user) {

        try {
            userService.getDelete(user.getId());
        } catch (Exception e) {
            System.out.println("No this user!");
        }
        return "redirect:/admin";
    }



}
