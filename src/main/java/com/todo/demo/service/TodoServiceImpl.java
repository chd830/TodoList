package com.todo.demo.service;

import com.todo.demo.data.Todo;
import com.todo.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public Todo getTodo(int num) {
        Todo todo = todoRepository.select(num);
        return todo;
    }

    public Todo makeTodoList2() {
        return getTodo(2);
    }

    public List<Todo> makeTodoList() {
        List<Todo> todoList = new ArrayList();

        int n = todoRepository.selectTodoNo();
        for (int i = 0; i < n; i++) {
            Todo todo = getTodo(i + 1);
            todoList.add(todo);
        }
        return todoList;
    }
}
