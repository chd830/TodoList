package com.todo.demo.controller;

import com.todo.demo.data.Todo;
import com.todo.demo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class InputController {

    @Autowired
    Service service;

    @RequestMapping(value = "/input")
    public String input() {
        return "input";
    }
    @RequestMapping(value = "/detail")
    public String detail() {
        return "detail";
    }
    @ResponseBody
    @RequestMapping(value = "/setTodo", method = RequestMethod.POST)
    public void setTodo(@RequestParam String title, @RequestParam String content, @RequestParam Date deadline) {
        Todo todo = new Todo();
        todo.setTitle(title);
        todo.setContent(content);
        todo.setDeadline(deadline);
        service.setTodo(todo);
    }

    @ResponseBody
    @RequestMapping(value = "/getTodo", method = RequestMethod.GET)
    public Todo getTodo() {
        Todo todo = service.getTodo(1);
        return todo;
    }
//<td><a href="${{path}/board/view.do?bno=${row.bno}">${row.title}</a></td>
}
