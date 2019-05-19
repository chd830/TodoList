package com.todo.demo.controller;

import com.todo.demo.data.Todo;
import com.todo.demo.service.Service;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ListController {

    @Autowired
    Service service;

    @RequestMapping(value = "/setTodoList", method = RequestMethod.POST)
    @ResponseBody
    public List<Todo> getTodo() {
        List<Todo> todo = service.makeTodoList();
        return todo;
    }

    @RequestMapping(value = "/updateIsComplete", method = RequestMethod.POST)
    @ResponseBody
    public void updateIsComplete(@RequestParam int todoNo) {
        service.updateIsComplete(todoNo);
    }
}