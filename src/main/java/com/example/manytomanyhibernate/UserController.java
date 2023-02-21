package com.example.manytomanyhibernate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {

    private final MainService mainService;

    public UserController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/")
    public void create() {
        mainService.test();
    }


}
