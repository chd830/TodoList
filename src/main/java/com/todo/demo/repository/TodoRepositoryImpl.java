package com.todo.demo.repository;

import com.todo.demo.data.Todo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TodoRepositoryImpl implements TodoRepository {

    @Autowired
    private SqlSession sqlSession;

    public Todo select(int num) {
        return sqlSession.selectOne("mapper.selectList", num);
    }

    public int selectTodoNo() {
        return sqlSession.selectOne("mapper.selectTodoNo");
    }
}
