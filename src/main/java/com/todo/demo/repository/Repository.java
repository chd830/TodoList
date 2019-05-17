package com.todo.demo.repository;

import com.todo.demo.data.Todo;

public interface Repository {
    Todo select(int num);
    int selectTodoNo();
    void insertTodo(Todo todo);
}
