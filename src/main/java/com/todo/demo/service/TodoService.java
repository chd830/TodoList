package com.todo.demo.service;

import com.todo.demo.data.Todo;

import java.util.List;

public interface TodoService {
    Todo getTodo(int num);
    Todo  makeTodoList2();
    List<Todo> makeTodoList();
}
