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

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class ButtonController {

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

    @RequestMapping(value = "/getTodo", method = RequestMethod.GET)
    public ModelAndView getTodo(@RequestParam int todoNo) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/detail");
        modelAndView.addObject("model", service.getTodo(todoNo));
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping(value = "/updateTodo", method = RequestMethod.POST)
    public void updateTodo(@RequestParam int todoNo, @RequestParam String title, @RequestParam String content) {
        Todo todo = new Todo();
        todo.setTodoNo(todoNo);
        todo.setTitle(title);
        todo.setContent(content);
        service.updateTodo(todo);
    }
//"Fri May 17 09:00:00 GMT+09:00 2019"
    @ResponseBody
    @RequestMapping(value = "/deleteTodo", method = RequestMethod.POST)
    public void deleteTodo(@RequestParam int todoNo) {
        service.deleteTodo(todoNo);
    }

}
