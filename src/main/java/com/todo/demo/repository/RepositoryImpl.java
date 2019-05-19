package com.todo.demo.repository;

import com.todo.demo.data.Todo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Repository
public class RepositoryImpl implements Repository {

    @Autowired
    private SqlSession sqlSession;

    public Todo selectTodo(int todoNo) {
        return sqlSession.selectOne("mapper.selectTodo", todoNo);
    }

    public int selectMaxTodoNo() {
        return sqlSession.selectOne("mapper.selectMaxTodoNo");
    }

    public void insertTodo(Todo todo) {
        sqlSession.selectOne("mapper.insertTodo", todo);
    }

    public void updateTodo(Todo todo) { sqlSession.selectOne("mapper.updateTodo", todo); }

    public void deleteTodo(int todoNo) { sqlSession.selectOne("mapper.deleteTodo", todoNo); }
}
