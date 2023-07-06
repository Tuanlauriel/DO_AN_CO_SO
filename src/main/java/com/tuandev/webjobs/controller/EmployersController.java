package com.tuandev.webjobs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employers")
public class EmployersController {

    @GetMapping
    public String employersPage() {
        return "employers/employers";
    }
}
