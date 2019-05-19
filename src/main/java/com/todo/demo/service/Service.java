package com.todo.demo.service;

import com.todo.demo.data.Todo;

import java.util.List;

public interface Service {
    Todo getTodo(int todoNo);
    List<Todo> makeTodoList();
    void setTodo(Todo todo);
    void updateTodo(Todo todo);
    void updateIsComplete(int todoNo);
    void deleteTodo(int todoNo);
}
