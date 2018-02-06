package com.tungphan.designpatternsample.creational.objectpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by TungPhan on 1/3/18.
 */

public class JDBCConnectionPool extends ObjectPool<Connection> {

    private String dsn;
    private String usr;
    private String pwd;

    public JDBCConnectionPool(String driver, String dsn, String usr, String pwd) {
        super();
        try {
            Class.forName(driver).newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        this.dsn = dsn;
        this.usr = usr;
        this.pwd = pwd;
    }

    @Override
    protected Connection create() {
        try {
            return (DriverManager.getConnection(dsn, usr, pwd));
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public void expire(Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean validate(Connection connection) {
        try {
            return connection.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
}
