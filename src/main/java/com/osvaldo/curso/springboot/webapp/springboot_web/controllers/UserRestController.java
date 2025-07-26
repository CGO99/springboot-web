package com.osvaldo.curso.springboot.webapp.springboot_web.controllers;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osvaldo.curso.springboot.webapp.springboot_web.models.User;
import com.osvaldo.curso.springboot.webapp.springboot_web.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
        public UserDto details() {
        
        User user = new User("Osvaldo", "Olivares");
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot !");


        return userDto;
    }   

    @GetMapping("/list")
    public List<User> list() {
        User user = new User("Osvaldo", "Olivares");
        User user2 = new User("John", "Doe");
        User user3 = new User("Jane", "Doe");
        
        List<User> users = Arrays.asList(user, user2, user3);
        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);

        return users;
    }

   @GetMapping("/details-map")
        public Map<String, Object> detailsMap() {
        

        User user = new User("Osvaldo", "Olivares");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola Mundo Spring Boot !");
        body.put("user", user);

        return body;
    }   
}


/// Take on account we can do it with @RestController or @Controller
// @RestController is a convenience annotation that combines @Controller and @ResponseBody.
// @Controller
// @RequestMapping("/api")
// public class UserRestController {

//     @GetMapping("/details")
//     @ResponseBody
//         public Map<String, Object> details() {
//         Map<String, Object> body = new HashMap<>();

//         body.put("title", "Hola Mundo Spring Boot !");
//         body.put("name", "Osvaldo");
//         body.put("lastname", "Olivares");
//         return body;
//     }   
// }
