package com.buzz.mysite.until;

import com.mysql.cj.protocol.Resultset;

import java.lang.reflect.Field;
import java.sql.*;

public class JdbcUntil<T> {
    private Connection connection;
    private Statement statement;
    private  PreparedStatement preparedStatement;
    private  ResultSet resultset;
    static
    {
        try {
            Class.forName(com.mysql.jdbc.Driver.class.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public  JdbcUntil() throws SQLException {
       this.connection =DriverManager.getConnection("jdbc:mysql://47.105.95.251:3306/buzz?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "buzzuser", "96mhLv0SvKKosdaM");

    }
    public  static<T>  JdbcUntil<T> instance() throws SQLException {
        return  new  JdbcUntil<T>();
    }
    public T getSingle(String sql,Class<T> tClass) throws IllegalAccessException, InstantiationException, SQLException {
        statement = connection.createStatement();
        ResultSet resultset = null;
        try {
           resultset =statement.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        T  t = mapResult(tClass,resultset);
        if (resultset!=null)
        {
            resultset.close();
        }
        return   t;
    }
    private T mapResult(Class<T> tClass,ResultSet resultset) throws SQLException, IllegalAccessException, InstantiationException {
        T resultObject = tClass.newInstance();
        ResultSetMetaData metaData = resultset.getMetaData();
        int colsLen = metaData.getColumnCount();
        Field[] fields = tClass.getDeclaredFields();
        while (resultset.next()) {
            for (int i = 1; i < colsLen + 1; i++) {
                String filedName = metaData.getColumnName(i);
                Field field = null;
                for (Field f:fields
                        ) {
                    if(f.getName().equalsIgnoreCase(filedName)) field = f;
                    else
                        continue;
                }
                Object value = resultset.getObject(i);
                if (value == null) {
                    value = "";
                }
                field.setAccessible(true);
                field.set(resultObject, value);
            }
        }
        return  resultObject;
    }
    public  void  Dispose()
    {
      if (statement!=null)
      {
          try {
              statement.close();
          } catch (SQLException e) {
              e.printStackTrace();
          }
      }
      if (connection!=null)
      {
          try {
              connection.close();
          } catch (SQLException e) {
              e.printStackTrace();
          }
      }
    }
}
