package com.todo.demo.repository;

import com.todo.demo.data.Todo;

public interface Repository {
    Todo selectTodo(int num);
    int selectTodoNo();
    void insertTodo(Todo todo);
}
