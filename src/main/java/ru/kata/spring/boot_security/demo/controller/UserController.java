package ru.kata.spring.boot_security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.servise.UserService;

import java.security.Principal;

@Controller
public class UserController {
    private UserService userService;

 @GetMapping("/user")
    public String user(/*Model model, Principal principal*/) {
     /*User user = userService.findByUserUsername(principal.getName());
     model.addAttribute("userS", user);*/
     return "user";
 }

    /*@PostMapping("/user")
    public String getShowUser(@ModelAttribute("userS") User user1) {
        model.userService.findByUserUsername(user1.getUsername());
        return "redirect:/show_user";
    }*/
}
