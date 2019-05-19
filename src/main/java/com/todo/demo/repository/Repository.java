package com.todo.demo.repository;

import com.todo.demo.data.Todo;

public interface Repository {
    Todo selectTodo(int todoNo);
    int selectMaxTodoNo();
    void insertTodo(Todo todo);
    void updateTodo(Todo todo);
    void deleteTodo(int todoNo);
}
