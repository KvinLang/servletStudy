package com.tpadsz.servlet.utils;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;
    private static Reader reader1;

    static {
        try {
            reader1 = Resources.getResourceAsReader("mapper/config_user.xml");
            reader = Resources.getResourceAsReader("Configuration.xml");
            sqlSessionFactory = (new SqlSessionFactoryBuilder()).build(reader);
        } catch (Exception var1) {
            var1.printStackTrace();
        }
    }
    public static SqlSession getSession() {
        return sqlSessionFactory.openSession();
    }

//    public static void main(String[] args) {
//        System.out.println("sessionFactory="+getSession());
//    }
}
