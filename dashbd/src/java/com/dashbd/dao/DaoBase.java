package com.dashbd.dao;
import java.sql.Connection;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author I301095
 */
public class DaoBase {
    public Connection conn;
    public DaoBase() throws Exception
    {
        /*
        //for hana
        ConnectionPool connPool = new ConnectionPool("com.sap.db.jdbc.Driver",
                "jdbc:sap://slc-dashboard.pgdev.sap.corp:30015/DB_SYS?reconnect=true",
                "SYSTEM",
                "Initial1");
        */     
        
        //for mysql
        ConnectionPool connPool = new ConnectionPool("com.mysql.jdbc.Driver",
                "jdbc:mysql://localhost:3306/db_sys",
                "root",
                "");
       
        connPool .createPool();
        this.conn = connPool .getConnection();
    }
}
