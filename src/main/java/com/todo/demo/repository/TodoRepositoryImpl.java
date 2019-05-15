package com.todo.demo.repository;

import com.todo.demo.data.Todo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class TodoRepositoryImpl implements TodoRepository{

    @Autowired
    private SqlSession sqlSession;

    public List<Map<Integer, String>> selectList() {
        return sqlSession.selectList("mapper.selectList");
    }
}
