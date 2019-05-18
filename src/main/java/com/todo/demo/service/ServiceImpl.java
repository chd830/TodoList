package com.todo.demo.service;

import com.todo.demo.data.Todo;
import com.todo.demo.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    @Autowired
    private Repository repository;

    @Override
    public Todo getTodo(int num) {
        Todo todo = repository.selectTodo(num);
        return todo;
    }


    public List<Todo> makeTodoList() {
        List<Todo> todoList = new ArrayList();

        int n = repository.selectTodoNo();
        for (int i = 0; i < n; i++) {
            Todo todo = getTodo(i + 1);
            todoList.add(todo);
        }
        return todoList;
    }

    public void setTodo(Todo todo) {
        repository.insertTodo(todo);
    }
}
