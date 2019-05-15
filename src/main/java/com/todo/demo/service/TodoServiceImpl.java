package com.todo.demo.service;

import com.todo.demo.data.Todo;
import com.todo.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TodoServiceImpl implements TodoService{

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public List<Map<Integer, String>> getList() {
        List<Map<Integer, String>> map = todoRepository.selectList();
        return map;
    }
}
