package com.todo.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping(value = "/")
    public String index() {
        return "list";
    }

    @RequestMapping(value = "/input")
    public String input() {
        return "input";
    }

    @RequestMapping(value = "/detail")
    public String detail() {
        return "detail";
    }
}
