package com.yc.cinema.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class ConnTest {
	//测试mybatis框架与数据库的连接
	@Test
	public void testConn(){
		//加载配置文件mybatis.xml
		try {
			InputStream in=Resources.getResourceAsStream("mybatis.xml");
			
			//通过配置文件，创建一个sqlSession工厂对象
			SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
			
			//通过工厂生产SqlSession对象
			SqlSession session=factory.openSession();
			
			//通过会话对象获得链接
			Connection con=session.getConnection();
			assertNotNull("数据库链接失败...",con);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
