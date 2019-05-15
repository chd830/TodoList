package com.todo.demo.controller;

import com.todo.demo.data.Todo;
import com.todo.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class TodoController {

    @Autowired
    TodoService todoService;

    @RequestMapping(value = "/")
    public String index(Model model) {
        List<Map<Integer, String>> map = todoService.getList();
        return "index";
    }

}
