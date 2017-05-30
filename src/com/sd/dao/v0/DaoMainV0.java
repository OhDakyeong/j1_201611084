package com.sd.dao.v0;

import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DaoMainV0 {
  public static void main(String[] args){
    Connection conn=null;
    ResultSet rs=null;
    Statement stmt=null;
    try {
      String path = System.getProperty("user.dir");
      path += "/src/mysql.properties";
      Properties prop = new Properties();
      prop.load(new FileInputStream(path));
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection(
                prop.getProperty("URL")+"?useSSL=true",
                prop.getProperty("USER"),
                prop.getProperty("PASSWORD"));
      //Statement stmt=conn.createStatement();
      //String mySql="CREATE TABLE persons(id int(64) NOT NULL AUTO_INCREMENT,";
      //mySql+="name varchar(255) NOT NULL, address varchar(255) NOT NULL, UNIQUE (id))";
      String mySql="select name from persons where id<4 order by id";
      stmt=conn.createStatement();
      //stmt.execute(mySql);
      rs=stmt.executeQuery(mySql);
      while(rs.next()){
        System.out.println(rs.getString("name"));
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try{
        if(rs!=null) rs.close();
        if(stmt!=null) stmt.close();
        if(conn!=null) conn.close();
      } catch (Exception e) {};
      try{
        if(conn!=null) conn.close();
      } catch (Exception e) {};
    }
  }
}