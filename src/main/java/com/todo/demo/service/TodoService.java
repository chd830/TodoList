package com.todo.demo.service;

import com.todo.demo.data.Todo;

import java.util.List;
import java.util.Map;

public interface TodoService {
    List<Map<Integer, String>> getList();
}
