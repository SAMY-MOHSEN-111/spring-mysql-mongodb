package com.global.multidb.controller;

import com.global.multidb.model.User;
import com.global.multidb.service.AnalyticsService;
import com.global.multidb.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/users")
public class UserController {

    private final UserService userService;
    private final AnalyticsService analyticsService;

    @GetMapping("/{userId}")
    public String getUser(@PathVariable("userId") String userId) {
        // update count of user access
        analyticsService.addUserAccess(userId);
        return "Done for simplicity";
    }

    @PostMapping
    public String createUser(@RequestBody User user) {
        // insert user into db
        userService.insert(user);
        return "Done for simplicity";
    }
}
