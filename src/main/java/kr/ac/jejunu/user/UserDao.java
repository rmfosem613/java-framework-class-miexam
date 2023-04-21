package kr.ac.jejunu.user;

import java.sql.*;

public class UserDao {
    private final JdbcContext jdbcContext;

    public UserDao(JdbcContext jdbcContext) {
        this.jdbcContext = jdbcContext;
    }

    public User findById(Long id) throws SQLException {
        StagementStrategy stagementStrategy = new GetStatementStrategy(id);
        return jdbcContext.jdbcContextForGet(stagementStrategy);
    }

    public void insert(User user) throws SQLException {
        StagementStrategy stagementStrategy = new InsertStatementStrategy(user);
        jdbcContext.jdbcContextForInsert(user, stagementStrategy);
    }

    public void update(User user) throws SQLException {
        StagementStrategy stagementStrategy = new UpdateStatementStrategy(user);
        jdbcContext.jdbcContextForUpdate(stagementStrategy);
    }

    public void delete(Long id) throws SQLException {
        StagementStrategy stagementStrategy = new DeleteStatementStrategy(id);
        jdbcContext.jdbcContextForUpdate(stagementStrategy);
    }
}