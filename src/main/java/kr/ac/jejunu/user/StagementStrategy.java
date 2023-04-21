package kr.ac.jejunu.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface StagementStrategy {
    PreparedStatement makeStatement(Connection connection) throws SQLException;
}