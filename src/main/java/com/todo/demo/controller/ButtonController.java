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

import java.util.Date;

@Controller
public class ButtonController {

    @Autowired
    Service service;

    @ResponseBody
    @RequestMapping(value = "/setTodo", method = RequestMethod.POST)
    public void setTodo(@RequestParam String title, @RequestParam String content, @RequestParam Date deadline) {
        Todo todo = new Todo();
        todo.setTitle(title);
        todo.setContent(content);
        todo.setDeadline(deadline);
        service.setTodo(todo);
    }

    @RequestMapping(value = "/getTodo", method = RequestMethod.GET)
    public ModelAndView getTodo(@RequestParam int num) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/detail");
        modelAndView.addObject("model", service.getTodo(num));
        return modelAndView;
    }

//    @ResponseBody
//    @RequestMapping(value = "updateTodo", method = RequestMethod.POST)
//    public void updateTodo(@RequestParam String title, @RequestParam String content, @RequestParam Date deadline, @RequestParam boolean isComplete) {
//
//    }
//
//    @ResponseBody
//    @RequestMapping(value = "deleteTodo", method = RequestMethod.POST.POST)
//    public void deleteTodo(@RequestParam int num) {
//
//    }

}
