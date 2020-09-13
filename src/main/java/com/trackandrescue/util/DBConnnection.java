package com.trackandrescue.util;

import java.sql.*;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 7/15/20
 * Time: 5:12 PM
 */
public class DBConnnection {
    private Connection connection = null;
    public DBConnnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql//localhost:3306/TrackAndRescue","trackandrescue","trackandrescue");

    }
    public int executeUpdate(String sql) throws SQLException {
        Statement statement = connection.createStatement();
        return  statement.executeUpdate(sql);
    }
    public ResultSet executeQuery(String sql) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        return rs;
    }
    public void close() throws SQLException {
        if(connection!=null & !connection.isClosed()){
            connection.close();
            connection = null;
        }
    }
}
