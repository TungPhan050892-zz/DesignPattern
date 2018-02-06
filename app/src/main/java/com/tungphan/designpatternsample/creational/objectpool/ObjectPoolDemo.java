package com.tungphan.designpatternsample.creational.objectpool;

import java.sql.Connection;

/**
 * Created by TungPhan on 1/3/18.
 */

public class ObjectPoolDemo {

    public void usingObjectPool() {
        JDBCConnectionPool pool = new JDBCConnectionPool("org.hsqldb.jdbcDriver",
                "jdbc:hsqldb://localhost/mydb",
                "sa", "secret");
        Connection cn = pool.checkOut();
        pool.checkIn(cn);
    }
}
