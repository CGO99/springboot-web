package com.osvaldo.curso.springboot.webapp.springboot_web.controllers;




import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.osvaldo.curso.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {

            User user = new User("Osvaldo", "Olivares");
            user.setEmail("osvaldo@email.com");
            model.addAttribute("title", "Hello World Spring Boot !");
            model.addAttribute("user", user);
            return "details";
    }   

    @GetMapping("/list")
    public String list(ModelMap model) {
        model.addAttribute("title", "List of Users");
        return "list";
    }
    
    @ModelAttribute("users")
    public List<User> usersModel(){
        List<User> users = Arrays.asList(
            new User("Pepa", "Mahones"),
            new User("Juan", "Perez","jp@email.com"),
            new User("Pedro", "Gomez","pg@email.com"),
            new User("Maria", "Gomez"));
        return users;
    }

}
