package com.todo.demo.service;

import com.todo.demo.data.Todo;

import java.util.List;

public interface Service {
    Todo getTodo(int num);
    List<Todo> makeTodoList();
    void setTodo(Todo todo);
}
