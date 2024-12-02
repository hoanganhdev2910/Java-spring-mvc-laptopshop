package vn.hoidanit.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.hoidanit.laptopshop.sevice.UserService;
import org.springframework.web.bind.annotation.GetMapping;

// @Controller //Mo hinh MVC
// public class UserController {
//     @RequestMapping("/")
//     public String getHomePage() {
//         return "hello from controller";
//     }
// }

@RestController // Mo hinh Restful API
public class UserController {
    // DI : dependency injection
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public String getHomePage() {
        return this.userService.handleHello();
    }
}