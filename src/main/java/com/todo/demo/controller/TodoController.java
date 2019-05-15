package com.todo.demo.controller;

import com.todo.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class TodoController {

    @Autowired
    TodoService todoService;

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
    @RequestMapping(value = "/map")
    @ResponseBody
    public List<Map<Integer, String>> getMap() {
        return todoService.getList();
    }

}
