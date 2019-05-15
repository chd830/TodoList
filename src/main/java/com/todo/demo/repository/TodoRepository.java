package com.todo.demo.repository;

import com.todo.demo.data.Todo;

import java.util.List;
import java.util.Map;

public interface TodoRepository {
    List<Map<Integer, String>> selectList();
}
