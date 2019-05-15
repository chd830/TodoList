package com.todo.demo.repository;

import com.todo.demo.data.Todo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TodoRepositoryImpl implements TodoRepository{

    @Autowired
    private SqlSession sqlSession;

    public Todo selectList() {
        Todo todo = sqlSession.selectOne("mapper.selectOne");
        return todo;
    }
}
