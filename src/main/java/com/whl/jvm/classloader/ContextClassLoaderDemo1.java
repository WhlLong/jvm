package com.whl.jvm.classloader;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.ServiceLoader;

public class ContextClassLoaderDemo1 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

       /* Class.forName("com.mysql.jdbc.Driver");
        DriverManager.getConnection("","","");
*/

        System.out.println("======================");

        ServiceLoader<Driver> sl = ServiceLoader.load(Driver.class);

        //java.sql.Driver 是一个接口，由启动类加载器加载。
        System.out.println(Driver.class.getClassLoader());

        Iterator<Driver> iterator = sl.iterator();
        while (iterator.hasNext()){
            Driver driver = iterator.next();
            System.out.println(driver);
            System.out.println(driver.getClass().getClassLoader());
        }

        System.out.println("==========");

    }

}
