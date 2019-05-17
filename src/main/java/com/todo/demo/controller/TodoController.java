package com.todo.demo.controller;

import com.todo.demo.data.Todo;
import com.todo.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TodoController {

    @Autowired
    TodoService todoService;

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/getList", method = RequestMethod.POST)
    @ResponseBody
    public List<Todo> getTodo() {
        List<Todo> todo = todoService.makeTodoList();
        return todo;
    }
}
