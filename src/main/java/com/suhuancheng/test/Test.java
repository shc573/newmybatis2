package com.suhuancheng.test;

import com.suhuancheng.entity.Classes;
import com.suhuancheng.entity.ClassesExample;
import com.suhuancheng.entity.User;
import com.suhuancheng.repository.ClassesMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ClassesExample accountExample = new ClassesExample();
        accountExample.setOrderByClause("name desc");
        accountExample.setDistinct(false);
        ClassesExample.Criteria criteria = accountExample.createCriteria();
        criteria.andNameEqualTo("张三");
//        List<Classes> accounts = ClassesMapper.selectByExample(accountExample);

        InputStream inputStream = User.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ClassesMapper classesMapper = sqlSession.getMapper(ClassesMapper.class);
        List<Classes> classesList = classesMapper.selectByExample(accountExample);
        System.out.println(classesList);
    }
}
