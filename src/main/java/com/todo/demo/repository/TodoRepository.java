package com.todo.demo.repository;

import com.todo.demo.data.Todo;

public interface TodoRepository {
    Todo select(int num);
    int selectTodoNo();
}
