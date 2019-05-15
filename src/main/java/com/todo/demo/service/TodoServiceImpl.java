package com.todo.demo.service;

import com.todo.demo.data.Todo;
import com.todo.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService{

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public Todo getList() {
        Todo todo = todoRepository.selectList();
        return todo;
    }
}
