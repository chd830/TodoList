package com.todo.demo.controller;

import com.todo.demo.data.Todo;
import com.todo.demo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TodoController {

    @Autowired
    Service service;

    @ResponseBody
    @RequestMapping(value = "/setTodo", method = RequestMethod.POST)
    public void setTodo(@RequestParam String title, @RequestParam String content, @RequestParam String deadline, @RequestParam int priority) {
        Todo todo = new Todo();
        todo.setTitle(title);
        todo.setDeadline(deadline);
        todo.setContent(content);
        todo.setPriority(priority);
        service.setTodo(todo);
    }

    @ResponseBody
    @RequestMapping(value = "/setTodoWithoutDeadline", method = RequestMethod.POST)
    public void setTodo(@RequestParam String title, @RequestParam String content, @RequestParam int priority) {
        Todo todo = new Todo();
        todo.setTitle(title);
        todo.setContent(content);
        todo.setPriority(priority);
        service.setTodo(todo);
    }

    @RequestMapping(value = "/setTodoList", method = RequestMethod.POST)
    @ResponseBody
    public List<Todo> getTodo() {
        List<Todo> todo = service.makeTodoList();
        return todo;
    }

    @RequestMapping(value = "/getTodo", method = RequestMethod.GET)
    public ModelAndView getTodo(@RequestParam int todoNo) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/detail");
        modelAndView.addObject("model", service.getTodo(todoNo));
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping(value = "/updateIsComplete", method = RequestMethod.POST)
    public void updateIsComplete(@RequestParam int todoNo) {
        service.updateIsComplete(todoNo);
    }

    @ResponseBody
    @RequestMapping(value = "/updateTodo", method = RequestMethod.POST)
    public void updateTodo(@RequestParam int todoNo, @RequestParam String content) {
        Todo todo = new Todo();
        todo.setTodoNo(todoNo);
        todo.setContent(content);
        service.updateTodo(todo);
    }

    @ResponseBody
    @RequestMapping(value = "/deleteTodo", method = RequestMethod.POST)
    public void deleteTodo(@RequestParam int todoNo) {
        service.deleteTodo(todoNo);
    }

}
