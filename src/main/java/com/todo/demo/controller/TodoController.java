package com.todo.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

}
